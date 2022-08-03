package ru.yandex.uitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage {
    WebDriver driver;

    public OrderStatusPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By orderNotFoundBlock = By.className("Track_NotFound__6oaoY");

    private final By firstName = ;
    private final By lastName = ;
    private final By address = ;
    private final By metroStation = ;
    private final By phoneNumber = ;
    private final By nextButton = ;
    private final By deliveryDay = ;
    private final By rentalPeriod = ;
    private final By scooterColor = ;
    private final By confirmationButton = ;
    private final By placedOrderText = ;

    public boolean getOrderNotFoundBlockState() {
        return driver.findElement(orderNotFoundBlock).isDisplayed();
    }
}
