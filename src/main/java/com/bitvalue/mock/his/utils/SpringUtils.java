package com.bitvalue.mock.his.utils;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Spring 上下文工具, 可用于获取spring 容器中的Bean
 */
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtils.applicationContext = applicationContext;
    }

    /**
     * @Description: 获取spring容器中的bean,通过bean名称获取
     * @param beanName bean名称
     * @return: Object 返回Object,需要做强制类型转换
     */
    public static Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }

    /**
     * @Description: 获取spring容器中的bean, 通过bean类型获取
     * @param beanClass bean 类型
     * @return: T 返回指定类型的bean实例
     */
    public static <T> T getBean(Class<T> beanClass) {
        return applicationContext.getBean(beanClass);
    }

    public static <T> Optional<T> getBeanOptional(Class<T> beanClass) {
        try {
            T bean = applicationContext.getBean(beanClass);
            return Optional.of(bean);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /**
     * @Description: 获取spring容器中的bean, 通过bean名称和bean类型精确获取
     * @param beanName bean 名称
     * @param beanClass bean 类型
     * @return: T 返回指定类型的bean实例

     */
    public static <T> T getBean(String beanName, Class<T> beanClass){
        return applicationContext.getBean(beanName,beanClass);
    }

}

