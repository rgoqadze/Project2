package StepObject;

import PageObject.MainPage;
import com.codeborne.selenide.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.*;

public class ManePageSteps extends MainPage {

    @Step("Click Rest Category Button")
    public ManePageSteps GoToRest(){
        RestButton.click();
        return this;
    }

}
