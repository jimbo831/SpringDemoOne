package com.johnbwhitejr.springdemo;

import com.johnbwhitejr.springdemo.coaches.Coach;
import com.johnbwhitejr.springdemo.coaches.TrackCoach;

/**
 * Created by johnwhite on 11/15/16.
 */
public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
