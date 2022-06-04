package stepDefinition;

import com.github.javafaker.Faker;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.OrderPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Order_Steps {

    private WebDriver driver = Driver.getDriver();

    OrderPage orderPage = new OrderPage();

    Faker faker = new Faker();


    @Given("^navigate to website \"([^\"]*)\"$")
    public void navigateToWebsite(String url) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @And("^Enter username: \"([^\"]*)\"$")
    public void enterUsernameTester(String username) {
        orderPage.typeUsername(username);
    }

    @And("^Enter password: \"([^\"]*)\"$")
    public void enterPasswordTest(String password) {
        orderPage.typePassword(password);
    }

    @And("^Click on Login button$")
    public void clickOnLoginButton() {
        orderPage.clickLoginButton();
    }

    @And("^Click on Order$")
    public void clickOnOrder() {
        orderPage.clickOrderLink();
    }

    @And("^Select \"([^\"]*)\" from product, set quantity to \"([^\"]*)\"$")
    public void selectFromProductSetQuantityTo(String option, String quantity) {
        orderPage.selectProductType(option);
        System.out.println("quantity = " + quantity);
        orderPage.setQuantity(quantity);
    }

    @And("^Click to \"([^\"]*)\" button$")
    public void clickToButton(String calculate) {
        orderPage.cickCalculateButton();
    }

    @And("^Fill address Info with JavaFaker$")
    public void fillAddressInfoWithJavaFaker() {
        orderPage.typeCustomerName(faker.name().fullName());
        orderPage.typeStreet(faker.address().streetAddress());
        orderPage.typeCity(faker.address().cityName());
        orderPage.typeState(faker.address().state());
        orderPage.typeZipCode(faker.address().zipCode().substring(0,4));
    }

    @And("^Click on \"([^\"]*)\" radio button$")
    public void clickOnRadioButton(String visa) {
        orderPage.clickVisaButton();
    }

    @And("^Generate card number using JavaFaker$")
    public void generateCardNumberUsingJavaFaker() {
        orderPage.typeCardNumber(faker.business().creditCardNumber().replaceAll("-",""));
        orderPage.typeExpireDate(faker.numerify("0#/1#"));
    }

    @When("^Click on \"([^\"]*)\"$")
    public void clickOn(String process) {
        orderPage.clickProcessButton();
    }

    @Then("^Verify success message “New order has been successfully added\\.”$")
    public void verifySuccessMessageNewOrderHasBeenSuccessfullyAdded() {

    }

    @Then("^Verify success message \"([^\"]*)\"$")
    public void verifySuccessMessage(String message) {
        orderPage.verifySuccessMessage(message);
    }

    @After
    public void quitDriver() {
        Driver.customWait(3);
        Driver.closeDriver();
    }
}
