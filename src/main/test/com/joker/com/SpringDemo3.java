package com.joker.com;

import com.joker.demo3.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");

        productService.save();
    }
}
