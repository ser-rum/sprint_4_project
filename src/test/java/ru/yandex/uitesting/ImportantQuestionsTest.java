package ru.yandex.uitesting;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.uitesting.PageObject.MainPage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


@RunWith(Parameterized.class)
public class ImportantQuestionsTest extends BaseTest {



    private final SelenideElement importantQuestionSelector;
    private final SelenideElement importantAnswerSelector;
    private final String importantAnswerText;


    public ImportantQuestionsTest(SelenideElement importantQuestionSelector, SelenideElement importantAnswerSelector,
                                  String importantAnswerText) {
        this.importantQuestionSelector = importantQuestionSelector;
        this.importantAnswerSelector = importantAnswerSelector;
        this.importantAnswerText = importantAnswerText;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]")),
                        $(byCssSelector("#accordion__panel-0 > p")), "Сутки — 400 рублей. Оплата курьеру — " +
                        "наличными или картой."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]")),
                        $(byCssSelector("#accordion__panel-1 > p")), "Пока что у нас так: один заказ — один " +
                        "самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — " +
                        "один за другим."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]")),
                        $(byCssSelector("#accordion__panel-2 > p")), "Допустим, вы оформляете заказ на 8 мая. " +
                        "Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, " +
                        "когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная " +
                        "аренда закончится 9 мая в 20:30."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]")),
                        $(byCssSelector("#accordion__panel-3 > p")), "Только начиная с завтрашнего дня. " +
                        "Но скоро станем расторопнее."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]")),
                        $(byCssSelector("#accordion__panel-4 > p")), "Пока что нет! Но если что-то срочное — " +
                        "всегда можно позвонить в поддержку по красивому номеру 1010."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]")),
                        $(byCssSelector("#accordion__panel-5 > p")), "Самокат приезжает к вам с полной зарядкой. " +
                        "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. " +
                        "Зарядка не понадобится."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]")),
                        $(byCssSelector("#accordion__panel-6 > p")), "Да, пока самокат не привезли. Штрафа " +
                        "не будет, объяснительной записки тоже не попросим. Все же свои."},
                {$(byXpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]")),
                        $(byCssSelector("#accordion__panel-7 > p")), "Да, обязательно. Всем самокатов! " +
                        "И Москве, и Московской области."}
        };
    }

    @Test
    public void shouldBeTextInDropDownList1Test(){

        MainPage page = new MainPage();
        page.shouldBeExactText(importantQuestionSelector, importantAnswerSelector, importantAnswerText);
    }
}
