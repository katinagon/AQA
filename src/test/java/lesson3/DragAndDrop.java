package lesson3;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class DragAndDrop {
    @Test
    void dragAndDropCheck() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
//        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(250, 0).release().perform();
        $("#column-a").dragAndDropTo($("#column-b"));
        $$("#columns").first().$("header").shouldHave(text("B"));
        sleep(5000);
    }
}
