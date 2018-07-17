package com.hydee.mainconfiguration;

import com.hydee.beans.Person;
import com.hydee.condition.MyCondition;
import com.hydee.dao.OrderDao;
import org.springframework.context.annotation.*;

/**
 * @author zwg
 * @date 2018/7/13 0013 10:46
 */
@Configuration
@ComponentScan(basePackages = {"com.hydee"},excludeFilters = {
       @ComponentScan.Filter(value = {OrderDao.class},type = FilterType.ASSIGNABLE_TYPE)
})
@Conditional({MyCondition.class})
public class MainConfiguration {

    @Bean
    @Lazy
    @Scope("singleton")
    public Person returnPerson(){
        return new Person();
    }
}
