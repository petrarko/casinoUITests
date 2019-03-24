package com.casino.utils.windows;

import static com.codeborne.selenide.Selenide.$x;

public class AgeConfirmation {
    private final String YES = "//button[contains(., \"Yes I'm over 18\")]";

    void confirmAgeIfNeeded() {
        if ($x(YES).exists()) {
            $x(YES).click();
        }
    }
}
