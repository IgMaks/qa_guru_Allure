import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;


public class LambdaStep {
    @Test
    public void  searchTest(){

        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу",()-> {
            open("https://abr.ru/");
        });
        step("Ищем информацию о Кредитовании",()-> {
            $("input[name='q']").hover().setValue("Кредитование").pressEnter();
        });
        step("Открываем раздел кредитование",()-> {
            $(linkText("Кредитование")).click();
        });
        step("Проверяем страницй на наличие Titlle Кредитование",()-> {
            $(withText("Кредитование")).shouldHave(Condition.exist);
        });




    }

}
