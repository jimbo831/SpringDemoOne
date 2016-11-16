package com.johnbwhitejr.springdemo;

import com.johnbwhitejr.springdemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by johnwhite on 11/15/16.
 */
public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
