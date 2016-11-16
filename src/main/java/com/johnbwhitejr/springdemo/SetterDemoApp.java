package com.johnbwhitejr.springdemo;

import com.johnbwhitejr.springdemo.coaches.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by johnwhite on 11/15/16.
 */
public class SetterDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();

    }
}
