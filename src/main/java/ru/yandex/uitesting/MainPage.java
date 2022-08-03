package ru.yandex.uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;

public class MainPage {



    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }
    WebDriver driver;
    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    private final By dropDownListLine = By.id("accordionheading-(0-7)");

    private final By dropDownListLineText = By.cssSelector("#accordion__heading-(0-7) > p");

    private final By topOrderButton = By.className("Header_NavAGCXC > class= Button_Buttonra12g");

    private final By bottomOrderButton = By.className("Button_Buttonra12g Button_Middle1CSJM");

    public void openDropDownList(int lineNumber) {
        driver.findElement(By.id("accordionheading-(" + lineNumber + ")")).click();
    }

    public void getTextFromDropDown(int lineNumber) {
        driver.findElement(By.cssSelector("#accordion__heading-(" + lineNumber + ") > p")).getText();
    }

    public void clickTopOrderButton() {
        driver.findElement(topOrderButton).click();
    }

    public void clickBottomOrderButton() {
        driver.findElement(bottomOrderButton).click();
    }
}
