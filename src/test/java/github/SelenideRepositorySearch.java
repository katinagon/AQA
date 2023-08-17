package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.editable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $("div.mr-2 svg.octicon-search").click();
        $(".QueryBuilder-InputWrapper input").setValue("selenide").pressEnter();
        $(".hKtuLA a").shouldHave(text("selenide/selenide")).click();
        $("div#repository-container-header").shouldHave(text("selenide / selenide"));
    }

}