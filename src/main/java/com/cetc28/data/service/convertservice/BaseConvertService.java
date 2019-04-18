package com.cetc28.data.service.convertservice;

import com.cetc28.data.dao.ICountDown;
import com.cetc28.data.service.forkjoin.ForkConvertByIds;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * @author wq
 */
public abstract class BaseConvertService {
    /**
     * convert方法不需要重写
     */
    public void convert() {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ForkConvertByIds(getIds(), this));
        pool.shutdown();
    }

    /**
     * @param ids idList
     *            继承类实现根据id转换的具体方法
     */
    public abstract void convertByIds(List<String> ids);

    /**
     * @return idList
     * 继承类实现获取相应的id集合的具体方法
     */
    public abstract List<String> getIds();
}
