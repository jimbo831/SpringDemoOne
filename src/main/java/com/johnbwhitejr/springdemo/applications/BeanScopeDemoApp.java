package com.johnbwhitejr.springdemo.applications;

import com.johnbwhitejr.springdemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by johnwhite on 11/16/16.
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
