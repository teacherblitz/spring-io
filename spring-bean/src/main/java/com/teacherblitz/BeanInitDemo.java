package com.teacherblitz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * TODO
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/8/26
 */
@Configuration
public class BeanInitDemo {

    public static void main(String[] args) {
        // 创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册上下文
        context.register(BeanInitDemo.class);
        // 刷新上下文
        context.refresh();
        // 依赖查找
        Stu stu = (Stu) context.getBean("stu");
        System.out.println("stu：" + stu.getName());
        // 关闭上下文
        context.close();
    }


    @Component
    class Stu{

        private String name;

        @Bean("stu")
        public Stu stu(){
            Stu stu = new Stu();
            stu.setName("朱老师");
            return stu;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
