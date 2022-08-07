package ru.yandex.uitesting.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;

public class SecondOrderPage {

    public SecondOrderPage() {
    }

    private final SelenideElement deliveryDay = Selenide.$(byCssSelector("[placeholder = '* Когда привезти самокат']"));
    private final SelenideElement rentalPeriodMenuOpener = Selenide.$(byClassName("Dropdown-placeholder"));
    private final SelenideElement firstRentalPeriod = Selenide.$(byClassName("Dropdown-option"));
    private final SelenideElement scooterColor = Selenide.$(byId("black"));
    private final SelenideElement orderButton = Selenide.$(byXpath("/html/body/div/div/div[2]/div[3]/button[2]"));


    public OrderConfirmationPage feelSecondOrderPage(String userDeliveryDay) {


        deliveryDay.setValue(userDeliveryDay).pressEnter();
        rentalPeriodMenuOpener.click();
        firstRentalPeriod.click();
        scooterColor.click();
        orderButton.click();
        return Selenide.page(OrderConfirmationPage.class);
    }
}
