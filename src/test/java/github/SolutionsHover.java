package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsHover {
    @Test
    void findHeader() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $$("ul[aria-labelledby=solutions-for-heading] li").first().click();
        $("main h1").shouldHave(text("Build like the best"));
    }
}
