package com.teacherblitz;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

/**
 * bean definition 创建
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/8/26
 */
public class BeanDefinitionCreationDemo {

    public static void main(String[] args) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition("user");
        builder.addPropertyValue("name", "张三");

        MutablePropertyValues values = builder.getBeanDefinition().getPropertyValues();
        System.out.println(values.getPropertyValues()[0].getValue());
    }
}
