package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class StepSearch {
    @Step("Открываем главную страницу")
    public void openPage(){
        open("https://abr.ru/");
    }
    @Step("Ищем информацию о Кредитовании")
    public void inputInfo(){
        $("input[name='q']").hover().setValue("Кредитование").pressEnter();

    }
    @Step("Открываем раздел кредитование")
    public void clickLink(){
        $(linkText("Кредитование")).click();
    }
    @Step("Проверяем страницй на наличие Titlle Кредитование")
    public void shouldSeeTitle(){
        $(withText("Кредитование")).shouldHave(Condition.exist);;
    }
}



