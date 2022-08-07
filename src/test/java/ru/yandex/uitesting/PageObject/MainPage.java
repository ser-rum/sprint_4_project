package ru.yandex.uitesting.PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byCssSelector;

public class MainPage {

    private final SelenideElement topOrderButton = Selenide.$(byCssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g"));
    private final SelenideElement bottomOrderButton = Selenide.$(byCssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"));
    private final SelenideElement importantQuestionsBlock = Selenide.$(byClassName("accordion"));

    public MainPage() {
    }

    public void shouldBeExactText(SelenideElement importantQuestionSelector,
                                  SelenideElement importantAnswerSelector, String importantAnswerText){

        importantQuestionsBlock.scrollIntoView(false);
        importantQuestionSelector.click();
        importantAnswerSelector.shouldHave(exactText(importantAnswerText));

    }

    public FirstOrderPage clickTopOrderButton() {

        topOrderButton.click();
        return Selenide.page(FirstOrderPage.class);

    }

    public FirstOrderPage clickBottomOrderButton() {

        bottomOrderButton.scrollTo().click();
        return Selenide.page(FirstOrderPage.class);

    }
}
