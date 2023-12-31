import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.StepSearch;

public class TestByStep {

    @Feature("Раздел Кредитование на сайте")
    @Story("----")
    @Owner("imax")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Abr", url = "ya.ru")
    @DisplayName("Отображение страницы для неавторизованного пользователя")
    @Test
    public void searchTest() {
        StepSearch steps = new StepSearch();

        SelenideLogger.addListener("allure", new AllureSelenide());

        steps.openPage();
        steps.inputInfo();
        steps.clickLink();
        steps.shouldSeeTitle();

    }

}
