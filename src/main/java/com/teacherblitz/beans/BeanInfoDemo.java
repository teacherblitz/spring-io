package com.teacherblitz.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.stream.Stream;

/**
 * bean 反省出所有的属性和方法
 *
 * @author teacherblitz
 * @since 2020/7/18
 */
public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException {
        // 获取当前Bean的所有信息
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        Stream.of(beanInfo.getPropertyDescriptors())
                .forEach(System.out::println);
    }
}
