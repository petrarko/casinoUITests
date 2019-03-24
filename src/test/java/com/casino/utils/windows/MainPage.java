package com.casino.utils.windows;

import com.casino.utils.Constants;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final String FUNNY_MONCEY_CANVAS = "//div[@class='casino-overlay']";
    private final String GAME_BUTTON = "//a[@class='game-button']";

    private AgeConfirmation ac = new AgeConfirmation();


    public void load() {
        open(Constants.URL);
        sleep(Constants.LOAD_PAGE_TIMEOUT); // wait to load
        ac.confirmAgeIfNeeded();
    }


    public FunnyMonkey chooseFunnyMonkey() {
        Selenide.actions().click($x(FUNNY_MONCEY_CANVAS)).perform(); //workaround
        $x(GAME_BUTTON).click();
        return new FunnyMonkey();
    }
}
