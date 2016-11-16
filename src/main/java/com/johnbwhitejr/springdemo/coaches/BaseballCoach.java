package com.johnbwhitejr.springdemo.coaches;

import com.johnbwhitejr.springdemo.fortunes.FortuneService;

/**
 * Created by johnwhite on 11/15/16.
 */

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {

    }

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
