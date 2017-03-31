package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        String expectedValue = "It really works!";
        assertEquals(result, expectedValue);
    }


}
