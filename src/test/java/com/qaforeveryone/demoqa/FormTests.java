package com.qaforeveryone.demoqa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FormTests {

    @Test
    @DisplayName("My fist test")
    public void isFirstTest() {
        Assertions.assertEquals(2, 2);

    }

    @Test
    @DisplayName("My first UI test")
    public void isExist() {
        Selenide.open("https://demoqa.com/");

        Selenide.sleep(5000);
        String actualTitle = Selenide.title();

        Assertions.assertEquals("ToolsQA", actualTitle);

    }
    
}
