package StepObject;

import PageObject.RestPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class RestPageSteps extends RestPage {
    @Step("Scroll To Price Input")
    public RestPageSteps ScroltoPriceButton() {
        MaxPriceInput.scrollIntoView(true);
        return this;
    }
    @Step("Fill Max Price: '100'")
    public RestPageSteps SetMaxPrice() {
        MaxPriceInput.shouldBe(Condition.visible, Duration.ofMillis(4000)).sendKeys("100");
        return this;
    }
    @Step("Click Search Button")
    public RestPageSteps ClickSubmit() {
        SubmitButton.shouldBe(Condition.visible, Duration.ofMillis(4000)).click();
        VaucherPrice1.scrollIntoView(true);
        return this;
    }
    @Step("Check All Voucher Price")
    public RestPageSteps PriceCheck() {
        int Price = 0;
        for (int i = 0; i < VaucherPrice.size(); i++) {
            Price = Integer.parseInt(VaucherPrice.get(i).getText().substring(0, 2));
            System.out.println(Price);
            Assert.assertTrue(Price <= 100);
        }
        return this;
    }
}
