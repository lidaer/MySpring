package com.sz.springframework;

/**
 * @author sz
 * @version 1.0
 * @date 2022/11/8 17:13
 */
public class BeanDefinition {

    /**
     * 存放 bean
     */
    private Object bean;

    public BeanDefinition(Object bean){
        this.bean=bean;
    }

    public Object getBean() {
        return bean;
    }
}
