package StepObject;

import PageObject.FoodPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class FoodPageSteps extends FoodPage {

    @Step("Go To Food Category")
    public FoodPageSteps GoToFoodPage(){
        FoodButton.click();
        return this;
    }
    @Step("Go To First Offer")
    public FoodPageSteps GoToSpecialOffer() {
        FirstCardButton.click();
        return this;
    }
    @Step("Increase item count by 1 and check that total amount")
    public  FoodPageSteps IncreaseQuantityAndCheck() {
        double Price1 = Integer.parseInt(DetailVoucherPrice.getText().substring(0,2));
        PlusButton.click();
        double Price2 = Integer.parseInt(DetailVoucherPrice.getText().substring(0,2));
        double Price3 = Price1 * 2;
        Assert.assertEquals(Price2,Price3);
        BuyButton.click();
        Assert.assertEquals(ItemCount.getText(),"2");
        Assert.assertEquals(BasketAmount.getText(),Price3+"0");
        return this;
    }
    @Step("Click on Buy  button")
    public FoodPageSteps ClickBuyButton() {
        BuyButton.click();
        return this;
    }
    @Step("Go To Registration Page")
    public FoodPageSteps GoToRegistration() {
        Registration.click();
        return this;
    }
    @Step("Choose Juridial Registration")
    public FoodPageSteps ChooseJuridial() {
        JuridialButton.click();
        return this;
    }
    @Step("Choose Legal Form")
    public FoodPageSteps ChooseLegalForm() {
        LegalForm.selectOption(1);
        return this;
    }
    @Step("Fill Company Name Input")
    public FoodPageSteps SetCompanyNameValue(String CompanyNameValue){
        CompanyName.sendKeys(CompanyNameValue);
        return this;
    }
    @Step("Fill Tax Code")
    public FoodPageSteps SetTaxCodeValue(String TaXCodeValue) {
        TaxCode.sendKeys(TaXCodeValue);
        return this;
    }
    @Step("Choose Company Registration Date")
    public FoodPageSteps SetCompanyDateValue(String CompanyDataValue) {
        RegistrationDate.sendKeys(CompanyDataValue);
        return this;
    }
    @Step("Fill Company Address")
    public FoodPageSteps SetCompanyAddressValue(String AddressValue){
        Address.sendKeys(AddressValue);
        return this;
    }
    @Step("Choose Country")
    public FoodPageSteps ChooseCountry() {
        Country.selectOption(10);
        return this;
    }
    @Step("Fill City Input")
    public FoodPageSteps SetCityValue(String CityValue) {
        City.sendKeys(CityValue);
        return this;
    }
    @Step("Fill Zip code Input")
    public FoodPageSteps SetZipcodeValue(String ZipValue){
        ZipCode.sendKeys(ZipValue);
        return this;
    }
    @Step("Fill Webpage Input")
    public FoodPageSteps SetWebpageValue(String WebPageValue){
        WepPage.sendKeys(WebPageValue);
        return this;
    }
    @Step("Fill Bank Name Input")
    public FoodPageSteps SetBankNameValue(String BankNameValue) {
        Bank.sendKeys(BankNameValue);
        return this;
    }
    @Step("Fill Bank Account Number Input")
    public FoodPageSteps SetBankAccountValue(String BankAccountValue) {
        BankAccount.sendKeys(BankAccountValue);
        return this;
    }
    @Step("Fill Email Input")
    public FoodPageSteps SetEmailValue(String EmailValue){
        Email.sendKeys(EmailValue);
        return this;
    }
    @Step("Fill Name And Lastname")
    public FoodPageSteps SetNameAndLastnameValue(String NameAndLastNameValue){
        NameAndLastName.sendKeys(NameAndLastNameValue);
        return this;
    }
    @Step("Choose Gender")
    public FoodPageSteps ChooseGender() {
        Gender.selectOption(0);
        return this;
    }
    @Step("Fill Birth Date")
    public FoodPageSteps SetBirthDateValue(String BirthDateValue){
        BirthDate.sendKeys(BirthDateValue);
        return this;
    }
    @Step("Choose Citizen")
    public FoodPageSteps ChooseCitizen(){
        Citizen.selectOption(2);
        return this;
    }
    @Step("Fill Personal Id Input")
    public FoodPageSteps SetPersonalId(String PersonalIdValue ){
        PersonalID.sendKeys(PersonalIdValue);
        return this;
    }
    @Step("Fill Phone Number Input")
    public FoodPageSteps SetPhoneNumberValue(String PhoneNumberValue) {
        PhoneNumber.sendKeys(PhoneNumberValue);
        return this;
    }
    @Step("Click Registration Button")
    public FoodPageSteps ClickRegistrationButton(){
        RegistrationButton.click();
        return this;
    }
    @Step("Check Error Message")
    public FoodPageSteps ErrorMessageCheck() {
        ErrorMessage.scrollIntoView(true);
        Assert.assertTrue(ErrorMessage.isDisplayed());
        return this;
    }
    @Step("Fill And Confirm Password")
    public FoodPageSteps SetPasswordValue (String PasswordValue) {
        Password1.sendKeys(PasswordValue);
        Password2.sendKeys(PasswordValue);
        return this;
    }
    @Step("Finnish Registration")
    public FoodPageSteps FinishRegistration() {
        RegistrationButton.click();
        return this;
    }
    
}
