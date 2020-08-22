package com.teacherblitz.bean.search.name.dependency.lookup;

import com.teacherblitz.bean.search.name.annotation.Super;
import com.teacherblitz.bean.search.name.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author teacherblitz
 * @since 2020/7/19
 */
public class DependencyLookupDemo {

    public static void main(String[] args) {
        // 配置 xml 配置文件
        // 启动应用程序上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        lockupInRealTime(beanFactory);
        lockupInLazy(beanFactory);
        lockupInBeanType(beanFactory);
        lockupInCollectionType(beanFactory);
        lockupInAnnotationType(beanFactory);
    }

    public static void lockupInAnnotationType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, Object> beansWithAnnotation = listBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("注解类型查找：\t" + beansWithAnnotation);
        }
    }

    public static void lockupInCollectionType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beans = listBeanFactory.getBeansOfType(User.class);
            System.out.println("集合类型查找：\t" + beans);
        }
    }

    public static void lockupInBeanType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println("单个类型查找：\t" + user);
    }

    public static void lockupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println("延迟查找：\t" + user);
    }

    public static void lockupInRealTime(BeanFactory beanFactory) {
        // 实时查找
        User user = (User) beanFactory.getBean("user");
        System.out.println("实时查找：\t" + user);
    }
}
