package com.hydee.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zwg
 * @date 2018/7/13 0013 14:52
 */
@Component
public class Test1EventListener implements ApplicationListener<ContextRefreshedEvent> {

@Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Object source = event.getSource();
        System.out.println("调用上下文刷新++source"+source);
    }
}
