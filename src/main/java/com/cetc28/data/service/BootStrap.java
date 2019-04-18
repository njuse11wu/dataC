package com.cetc28.data.service;

import com.cetc28.data.constant.Constant;
import com.cetc28.data.processer.ConvertServiceListenerProcessor;
import com.cetc28.data.service.convertservice.BaseConvertService;
import com.cetc28.data.service.convertservice.PersonConvertService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * @author wq
 */
@Slf4j
public class BootStrap {

    public static void start() {
        BaseConvertService base;
        for (Object cBean : ConvertServiceListenerProcessor.convertBeans) {
            try {
                base = (BaseConvertService) cBean;
                base.convert();
            }catch (ClassCastException classCastException){
                log.error("异常的注解bean转换，检查是否有非法的@ConvertService注解", classCastException);
            }
        }
    }
}
