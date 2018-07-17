package com.hydee.test;

import com.hydee.beans.Person;
import com.hydee.dao.OrderDao;
import com.hydee.mainconfiguration.MainConfiguration;
import com.hydee.services.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zwg
 * @date 2018/7/13 0013 11:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        MainConfiguration.class
})
public class SpringTest  {
     @Autowired
    private ApplicationContext applicationContext;

    @Test
   public void test1(){
//        if(applicationContext instanceof AnnotationConfigApplicationContext){
//
//            ((AnnotationConfigApplicationContext) applicationContext).refresh();
//        }

        //System.out.println("刷新完毕");
        ((ConfigurableApplicationContext)applicationContext).start();
        String[] contextBeanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : contextBeanDefinitionNames) {

            System.out.println(name);
        }
        //Person person = applicationContext.getBean(Person.class);

    }

}
