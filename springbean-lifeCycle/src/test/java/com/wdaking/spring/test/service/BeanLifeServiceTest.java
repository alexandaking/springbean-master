package com.wdaking.spring.test.service;

import com.wdaking.spring.service.BeanLifeCycleService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Version 1.0
 * @Author: wangjian
 * @Date: 2019-06-03 15:02
 */
public class BeanLifeServiceTest {

    @Test
    public void testBeaLifeCycle(){
        System.out.println("Spring容器初始化");
        System.out.println("=====================================");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        System.out.println("Spring容器初始化完毕");
        System.out.println("=====================================");

        System.out.println("从容器中获取Bean");

        BeanLifeCycleService service = context.getBean("beanLifeService", BeanLifeCycleService.class);

        System.out.println("Bean Name="+service.getName());
        System.out.println("=====================================");

        context.close();

        System.out.println("Spring容器关闭");

    }
}
