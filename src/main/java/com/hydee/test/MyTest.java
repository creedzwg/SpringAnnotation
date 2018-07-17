package com.hydee.test;

import com.hydee.beans.Person;
import com.hydee.services.OrderService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zwg
 * @date 2018/7/9 0009 19:16
 */
public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OrderService service = context.getBean(OrderService.class);
        service.say();
    }
    @Test
    public  void test1(){
       // Person person = new Person();
       // person.setUsername("zhansgan");
        //person.setPassword("123456");
//        String str1 = "ab";
//            changeString(str1);
//            //System.out.println("str="+str1);
//      //changeObject(person);
//        //System.out.println(person);
//        System.out.println(str1);
        Long value = Long.valueOf("000497294");
        System.out.println(value);

    }
    private static void changeString(String str) {
        str = "cd";
    }

    private static  void changeObject(Person person){
        //person=new Person();
        person.setUsername("45678");
    }



}
