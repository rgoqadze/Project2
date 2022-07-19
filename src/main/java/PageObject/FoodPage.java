package PageObject;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;

public class FoodPage {
    public SelenideElement
        FoodButton = $(byTagAndText("label", "კვება")),
        FirstCardButton = $(".special-offer",0),
        PlusButton = $(byAttribute("src","/Images/NewDesigneImg/additional-icons/plus.png")),
        DetailVoucherPrice = $(byClassName("details-voucher-price")),
        BuyButton = $(byText("ყიდვა")),
        ItemCount = $(byId("basket_item_count")),
        BasketAmount = $(byId("basket-total-amount")),
        Registration = $(byClassName("register")),
        JuridialButton = $(byClassName("juridial")),
        LegalForm = $(byId("lLegalForm")),
        CompanyName = $(byId("lName")),
        TaxCode = $(byId("lTaxCode")),
        RegistrationDate = $(byId("registred")),
        Address = $(byId("lAddress")),
        ZipCode = $(byId("lPostalCode")),
        Country =$(byId("lCountryCode")),
        City = $(byId("lCity")),
        WepPage = $(byId("lWebSite")),
        Bank = $(byId("lBank")),
        BankAccount =$(byId("lBankAccount")),
        Email = $(byId("lContactPersonEmail")),
        Password1 = $(byId("lContactPersonPassword")),
        Password2 = $(byId("lContactPersonConfirmPassword")),
        NameAndLastName = $(byId("lContactPersonName")),
        Gender = $(byId("lContactPersonGender")),
        BirthDate = $(byId("birthday")),
        Citizen = $(byId("lContactPersonCountryCode")),
        PersonalID = $(byId("lContactPersonPersonalID")),
        PhoneNumber = $(byId("lContactPersonPhone")),
        RegistrationButton = $(byValue("რეგისტრაცია")),
        ErrorMessage = $(byText("რეგისტრაციის დროს დაფიქსირდა შეცდომა!"));





}

