package com.juzix.knight.main;

import com.juzix.knight.config.KnightConfig;
import com.juzix.knight.service.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        ApplicationContext context1 = new FileSystemXmlApplicationContext("knights.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("knights.xml");


        ApplicationContext context3 = new AnnotationConfigApplicationContext(com.juzix.knight.config.KnightConfig.class);


        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}