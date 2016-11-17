package com.johnbwhitejr.springdemo.fortunes;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by johnwhite on 11/16/16.
 */
public class RandomFortuneService implements FortuneService {

    private String[] fortunes;

    public RandomFortuneService() {}

    public void setFortunes(String fortunesString) {
        fortunes = fortunesString.split(",");
    }

    @Override
    public String getFortune() {
        return fortunes[ThreadLocalRandom.current().nextInt(fortunes.length)];
    }
}
