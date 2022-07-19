package StepObject;

import PageObject.FunPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static java.lang.String.valueOf;

public class FunPageSteps extends FunPage {
    @Step("Go To Fun Category")
    public FunPageSteps GoToFunPage(){
        FunButton.click();
        return this;
    }
    @Step("Go To Firs Offer")
    public FunPageSteps GoToSpecialOffer(){
        FirstCardButton.click();
        return this;
    }
    @Step("Open Gallery")
    public FunPageSteps OpenGalerry(){
        MainImageButton.click();
        return this;
    }
    @Step("Click All Images")
    public FunPageSteps ClickAllImage(){

        for(int i = 0; i < Img.size()+2; i++){
            NextButton.click();
        }
        return this;
    }
    @Step("Identify last image")
    public FunPageSteps LastImageCheck() {
        String n = String.valueOf(Img.size()+3);
        ImgNumber.shouldBe(Condition.visible,Duration.ofMillis(4000));
        Assert.assertEquals(ImgNumber.getText(), "Image"+" " + n+" "+"of"+" "+n);
        return this;
    }
    @Step("Close Gallery")
    public FunPageSteps GalleryClose(){
        CloseButton.click();
        return this;
    }

}
