package ru.yandex.uitesting.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;

public class PlacedOrderPage {

    private final SelenideElement placedOrderText = Selenide.$(byCssSelector(".Order_ModalHeader__3FDaJ"));

    public PlacedOrderPage() {
    }

    public void shouldBePlacedOrderText(String placedOrderMessage){
        placedOrderText.shouldHave(text(placedOrderMessage));
    }
}
