package com.cetc28.data.annotations;

import org.springframework.stereotype.Service;
import java.lang.annotation.*;

/**
 * 所有convertService需添加此注解，并且必须继承BaseConvertService类
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface ConvertService {
    String convertServiceName() default "";
}
