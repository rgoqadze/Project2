package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FunPage {
    public SelenideElement
        FunButton =  $(byTagAndText("label","გართობა")),
        FirstCardButton = $(".special-offer",0),
        MainImageButton = $(byCssSelector("div.col-6")),
        NextButton = $(".lb-next"),
        ImgNumber = $(".lb-number"),
        CloseButton = $(".lb-close");
    public ElementsCollection
        Img =$$(By.xpath("//div[@class='bottom-side-images']/div"));
}
