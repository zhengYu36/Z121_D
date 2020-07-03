package com.zy.utils;

import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintViolation;
import java.util.Iterator;
import java.util.Set;

public class ValidateUtil {

    public static <T> void validate(T obj) throws Exception {
        //这边获取spring已经实例化的验证器即可，即刚才配置文件里配置验证器id
        LocalValidatorFactoryBean validator = (LocalValidatorFactoryBean)
                SpringBeanUtil.getBeanByName("validator");
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);
        //抛出检验异常
        Iterator<ConstraintViolation<T>> iter = constraintViolations.iterator();
        while (iter.hasNext()) {
            ConstraintViolation<T> error = iter.next();
            StringBuffer buffer = new StringBuffer().append("[")
                    .append(error.getPropertyPath().toString()).append("]")
                    .append(error.getMessage());
            throw new IllegalArgumentException(buffer.toString());
        }

    }

}
