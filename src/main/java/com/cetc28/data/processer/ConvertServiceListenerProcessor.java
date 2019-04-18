package com.cetc28.data.processer;

import com.cetc28.data.annotations.ConvertService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wq
 */
@Component
public class ConvertServiceListenerProcessor implements BeanPostProcessor {
    public static List<Object> convertBeans = new ArrayList<>();

    @SuppressWarnings("NullableProblems")
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (AnnotationUtils.isAnnotationDeclaredLocally(ConvertService.class, bean.getClass())) {
            convertBeans.add(bean);
        }
        return bean;
    }

}
