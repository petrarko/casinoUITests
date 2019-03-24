package com.casino.tests;


import com.casino.utils.windows.FunnyMonkey;
import com.casino.utils.windows.MainPage;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

class TestMainPage extends BaseTest {
    private final static Logger logger = Logger.getLogger(TestMainPage.class);

    @Test
    void addition() {
        MainPage mainPage = new MainPage();
        mainPage.load();
        FunnyMonkey funnyMonkey = mainPage.chooseFunnyMonkey();
        funnyMonkey.waitAppIsRead();
        funnyMonkey.run();
    }
}