package com.sz.springframework.test;

import com.sz.springframework.BeanDefinition;
import com.sz.springframework.BeanFactory;
import com.sz.springframework.test.bean.UserService;
import org.testng.annotations.Test;

/**
 * @author sz
 * @version 1.0
 * @date 2022/11/8 17:15
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }

}
