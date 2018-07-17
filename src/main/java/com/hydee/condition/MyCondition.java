package com.hydee.condition;


import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zwg
 * @date 2018/7/13  11:59
 */
public class MyCondition implements Condition{


    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        BeanDefinitionRegistry registry = context.getRegistry();
        //registry.registerBeanDefinition("red12345",registry.getBeanDefinition("red"));

        return true;
    }
}
