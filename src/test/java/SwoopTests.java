import StepObject.FoodPageSteps;
import StepObject.FunPageSteps;
import StepObject.ManePageSteps;
import StepObject.RestPageSteps;
import Utils.InsertDataToSql;
import Utils.Runner;
import Utils.SelectFromSql;
import Utils.SqlCreate;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.sql.SQLException;
import static DataObject.RegistrationData.*;



@Listeners(Utils.TestLister.class)
@Epic("Check Categoprys")
@Feature("Check Voucher buy")
public class SwoopTests extends Runner {

    SqlCreate create = new SqlCreate();
    InsertDataToSql InsertData = new InsertDataToSql();
    SelectFromSql selectSql = new SelectFromSql();

@BeforeClass
public void GenerateData() throws SQLException {

    create.CreateDBAndTable();
    selectSql.SelectQuery();
    InsertData.InsertQuery();
}

    @Test(groups = {"Resgression1"})
    @Story("Price Check")
    @Description("Set Max Price And Check Prices")
    @Severity(SeverityLevel.MINOR)
    public void RestPageTest() {

        ManePageSteps Steps1 = new ManePageSteps();
        RestPageSteps Steps2 = new RestPageSteps();
        Steps1
                .GoToRest();
        Steps2
                .ScroltoPriceButton()
                .SetMaxPrice()
                .ClickSubmit()
                .PriceCheck();
    }

    @Test(groups = {"Resgression1"})
    @Story("Gallery Check")
    @Description("Check All Images")
    @Severity(SeverityLevel.NORMAL)
    public void FunPageTest(){
        FunPageSteps Steps = new FunPageSteps();
        Steps
                .GoToFunPage()
                .GoToSpecialOffer()
                .OpenGalerry()
                .ClickAllImage()
                .LastImageCheck()
                .GalleryClose();
    }
    @Test(groups = {"Resgression2"})
    @Story("Voucher Quantity And Registration Check")
    @Description("Food Category and Registration")
    @Severity(SeverityLevel.CRITICAL)
    public void FoodPageTest() {
        FoodPageSteps Steps = new FoodPageSteps();
        Steps
                .GoToFoodPage()
                .GoToSpecialOffer()
                .IncreaseQuantityAndCheck()
                .ClickBuyButton()
                .GoToRegistration()
                .ChooseJuridial()
                .ChooseLegalForm()
                .SetCompanyNameValue(CompanyNameValue)
                .SetTaxCodeValue(TaxCodeValue)
                .SetCompanyDateValue(CompanyDataValue)
                .SetCompanyAddressValue(selectSql.address)
                .ChooseCountry()
                .SetCityValue(selectSql.city)
                .SetZipcodeValue(selectSql.zip)
                .SetWebpageValue(WebPageValue)
                .SetBankNameValue(BankNameValue)
                .SetBankAccountValue(BankAccountValue)
                .SetEmailValue(selectSql.email)
                .SetNameAndLastnameValue(selectSql.firstname+ " " + selectSql.lastname)
                .ChooseGender()
                .SetBirthDateValue(BirthDateValue)
                .ChooseCitizen()
                .SetPersonalId(PersonalIdValue)
                .SetPhoneNumberValue(selectSql.phone)
                .ClickRegistrationButton()
                .ErrorMessageCheck()
                .SetPasswordValue(selectSql.password)
                .FinishRegistration();

    }

}
