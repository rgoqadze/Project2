package DataObject;

import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker = new Faker();

    String
            CompanyNameValue = faker.company().name(),
            TaxCodeValue = faker.number().digits(9),
            CompanyDataValue = "12122012",
            WebPageValue = "www." + faker.company().name() + ".com",
            BankNameValue = faker.name().name(),
            BankAccountValue = "GE10TB" + faker.number().digits(16),
            PersonalIdValue = faker.idNumber().valid(),
            BirthDateValue = "12061994",
            EmailValue = faker.company().name() + "@Gmail.com",
            FirstNameValue = faker.name().firstName(),
            LastNameValue = faker.name().lastName(),
            PhoneNumberValue = faker.number().digits(9),
            PasswordValue = faker.number().digits(9),
            AddressValue = faker.address().streetAddress(),
            CityValue = faker.name().title(),
            StateValue = faker.name().name();
    int Zip = Integer.parseInt(faker .number().digits(4));
}
