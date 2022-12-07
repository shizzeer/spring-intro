package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(messageServiceConfig.class);

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService msgService = applicationContext.getBean(MyNameMessageService.class);
        MessageService messageService2 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());

        System.out.println(messageService.hashCode());
        System.out.println(msgService.hashCode());
        System.out.println(messageService2.hashCode());
    }
}
