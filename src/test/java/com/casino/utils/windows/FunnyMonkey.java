package com.casino.utils.windows;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class FunnyMonkey {
    private final long APP_LOADIND_TIMEOUT = 20 * 1000;

    public void waitAppIsRead() {
        Selenide.sleep(APP_LOADIND_TIMEOUT);
    }

    public void run() {
        Selenide.actions().click($x("//canvas"));
    }

}
