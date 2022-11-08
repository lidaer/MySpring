package com.sz.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sz
 * @version 1.0
 * @date 2022/11/8 17:13
 */
public class BeanFactory {

    /**
     * 创建HashMap对象，用于保存bean
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 获取 bean
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 将 beanDefinition 注册进 beanDefinitionMap 中
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }

}
