package ru.yandex.uitesting.PageObject;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.*;

public class OrderConfirmationPage {

    public OrderConfirmationPage() {
    }

    public PlacedOrderPage clickConfirmationButton() {
        Selenide.$(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();
        return Selenide.page(PlacedOrderPage.class);
    }
}
