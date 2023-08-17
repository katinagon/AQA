package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsSearch {
    @Test
    void softAssertionsHasCodeExampleForJUnit5() {
        open("https://github.com/selenide/selenide");
        $("ul li a#wiki-tab").click();
        $("button.js-wiki-more-pages-link").click();
        $("[data-filterable-for=wiki-pages-filter]").shouldHave(text("SoftAssertions"));
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();
        $$("div.markdown-body h4").get(2).shouldHave(text("Using JUnit5 extend test class:"));
        sleep(5000);
    }
}
