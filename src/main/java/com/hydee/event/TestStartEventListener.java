package com.hydee.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zwg
 * @date 2018/7/13 0013 15:13
 */
@Component
public class TestStartEventListener implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("上下文启动时间------"+event.getSource().toString());
    }
}
