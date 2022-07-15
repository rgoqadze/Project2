package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class RestPage {
    public SelenideElement
            MaxPriceInput = $$(byName("maxprice")).filter(visible).get(0),
            SubmitButton =   $$(byText("ძებნა")).filter(visible).get(0),
            VaucherPrice1 = $(byXpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]"));
    public ElementsCollection
            VaucherPrice = $$(byXpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]"));
}
