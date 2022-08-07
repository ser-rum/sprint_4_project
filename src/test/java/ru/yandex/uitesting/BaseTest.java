package ru.yandex.uitesting;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @Before
    public void setup(){
//        System.setProperty("selenide.browser", "firefox");   //Строчка для проверки прохождения тестов на Firefox
        SelenideElement cookieAcceptButton = $(byId("rcc-confirm-button"));
        open("https://qa-scooter.praktikum-services.ru/");
        cookieAcceptButton.click();

    }

    @After
    public void teardown(){
        Selenide.clearBrowserCookies();
        Selenide.closeWindow();
    }
}
