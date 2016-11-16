package com.johnbwhitejr.springdemo.coaches;

import com.johnbwhitejr.springdemo.fortunes.FortuneService;

/**
 * Created by johnwhite on 11/15/16.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {}

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
