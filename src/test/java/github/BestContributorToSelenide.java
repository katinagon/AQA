package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
    @Test
    void solntsevShouldBeTheTopContributor() {
        open("https://github.com/selenide/selenide");
        $(".BorderGrid--spacious").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
