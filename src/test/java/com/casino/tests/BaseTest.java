package com.casino.tests;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    private final static Logger logger = Logger.getLogger(BaseTest.class);

    @BeforeEach
    void init() {
        logger.info("Starting test");
        System.setProperty("webdriver.chrome.driver", "/Users/aguitelson/Downloads/chromedriver");
    }

    @AfterEach
    void tearDown() {
        logger.info("Test is done");

    }
}
