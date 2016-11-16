package com.johnbwhitejr.springdemo.coaches;

import com.johnbwhitejr.springdemo.fortunes.FortuneService;

/**
 * Created by johnwhite on 11/15/16.
 */
public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach() {

    }

    public FootballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your route tree";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
