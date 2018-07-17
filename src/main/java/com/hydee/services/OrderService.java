package com.hydee.services;

import com.hydee.dao.OrderDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

/**
 * @author zwg
 * @date 2018/7/9 0009 19:03
 */
@Service
public class OrderService {
 private Logger logger= LoggerFactory.getLogger(OrderService.class);

    private   OrderDao orderDao;

    public void   say(){
      logger.debug("我进入service了");
      orderDao.say();

    }
//    @Autowired(required = false)
//    public  OrderService(OrderDao orderDao) {
//        this.orderDao=orderDao;
//    }


}
