package ru.yandex.uitesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SeleniumTest extends BaseTest {
    private final int lineNumber;
    private final String checkedText;

    WebDriver driver;

    public SeleniumTest(int lineNumber, String checkedText) {
        this.lineNumber = lineNumber;
        this.checkedText = checkedText;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {,},
                {,},
                {,},
                {,},
                {,},
                {,},
                {,},
                {,}
        };
    }

    @Test
    public void shouldBeSumText(){
        MainPage page = new MainPage(driver);
        assertEquals(checkedText, page.getTextFromDropDown(lineNumber));
    }

    @Test
    public void testOrderingScooterOnTop(){

    }

    @Test
    public void testOrderingScooterOnBottom(){

    }
}
