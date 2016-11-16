package com.johnbwhitejr.springdemo.fortunes;

/**
 * Created by johnwhite on 11/15/16.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
