package ru.yandex.uitesting.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;

public class FirstOrderPage {

    public FirstOrderPage() {
    }


    private final SelenideElement firstName = Selenide.$(byCssSelector("[placeholder = '* Имя']"));
    private final SelenideElement lastName = Selenide.$(byCssSelector("[placeholder = '* Фамилия']"));
    private final SelenideElement address = Selenide.$(byCssSelector("[placeholder = '* Адрес: куда привезти заказ']"));
    private final SelenideElement openMetroStation = Selenide.$(byClassName("select-search__input"));
    private final SelenideElement choseMetroStation = Selenide.$(byXpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]/button"));
    private final SelenideElement phoneNumber = Selenide.$(byCssSelector("[placeholder = '* Телефон: на него позвонит курьер']"));
    private final SelenideElement nextButton = Selenide.$(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"));

    public SecondOrderPage feelFirstOrderPage(String userFirstName, String userLastName, String userAddress,
                                              String userPhoneNumber) {

        firstName.setValue(userFirstName);
        lastName.setValue(userLastName);
        address.setValue(userAddress);
        openMetroStation.click();
        choseMetroStation.click();
        phoneNumber.setValue(userPhoneNumber);
        nextButton.click();
        return Selenide.page(SecondOrderPage.class);
    }
}
