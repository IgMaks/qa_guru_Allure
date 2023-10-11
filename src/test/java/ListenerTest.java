import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;


public class ListenerTest {
    @Test
    public void  searchTest(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://abr.ru/");
        $("input[name='q']").hover().setValue("Кредитование").pressEnter();
        $(linkText("Кредитование")).click();
        $(withText("Кредитование")).shouldHave(Condition.exist);

    }

}
