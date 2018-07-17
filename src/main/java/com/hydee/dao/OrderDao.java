package com.hydee.dao;

import com.hydee.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @author zwg
 * @date 2018/7/9 0009 19:03
 */
@Repository
public class OrderDao {
    private Logger logger= LoggerFactory.getLogger(OrderDao.class);

      public void say(){
          logger.debug("我进入dao了");
      }
}
