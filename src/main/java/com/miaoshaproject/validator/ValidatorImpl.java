package com.miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Version 1.0
 */
@Component
public class ValidatorImpl implements InitializingBean {

    private Validator validator;

    //实现校验方法并返回校验结果
    public ValidationResult validate(Object bean) {
        ValidationResult result = new ValidationResult();

        //如果bean里面的一些参数的规则，违背了validator定义的annotation的话，就会被加入到这个set里面
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(bean);
        if (constraintViolationSet.size() > 0) {
            //有错误
            result.setHasErrors(true);
            //遍历map
            constraintViolationSet.forEach(constraintViolation -> {
                //找到错误信息
                String errMsg = constraintViolation.getMessage();
                //找到错误的字段
                String propertyName = constraintViolation.getPropertyPath().toString();
                result.getErrorMsgMap().put(propertyName, errMsg);
            });
        }
        return result;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //将hibernate validator 通过工厂的初始化方式将其实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
