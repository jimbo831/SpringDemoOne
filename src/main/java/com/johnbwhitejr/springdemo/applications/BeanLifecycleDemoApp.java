package com.johnbwhitejr.springdemo.applications;

import com.johnbwhitejr.springdemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by johnwhite on 11/16/16.
 */
public class BeanLifecycleDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
