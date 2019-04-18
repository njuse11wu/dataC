package com.cetc28.data.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wq
 */
@Slf4j
public class MakeListToMap {
    /**
     * @param idName 对象中作为id的属性名称
     * @param list 需区分的集合
     * @param <T> 具体对象类型
     * @return map
     */
    public static <T> Map<String, List<T>> convertToMap(String idName, List<T> list) {
        if (list.size() == 0) {
            return new HashMap<>(16);
        }
        Map<String, List<T>> res = new HashMap<>(16);
        try {
            //避免循环里反射，影响性能
            Field f = list.get(0).getClass().getDeclaredField(idName);
            f.setAccessible(true);
            for (T l : list) {
                try {
                    String id = (String) f.get(l);
                    if (res.get(id) != null) {
                        res.get(id).add(l);
                    } else {
                        List<T> orderList = new ArrayList<>();
                        orderList.add(l);
                        res.put(id, orderList);
                    }
                } catch (IllegalAccessException e) {
                    log.error("反射get对象失败",e);
                }
            }
        } catch (NoSuchFieldException e) {
            log.error("反射获取方法失败",e);
        }
        return res;
    }
}
