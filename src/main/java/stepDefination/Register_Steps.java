package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModel.RegisterPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {
    private WebDriver driver;

    RegisterPage registerPage = new RegisterPage();

    @Given("^Navigate to Website$")
    public void navigateToWebsite() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^Click Sign in Button$")
    public void clickSignInButton() {
        registerPage.clickOnSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) {
        registerPage.typeEmail(email);
    }

    @And("^Click On Create Account Button$")
    public void clickOnCreateAccountButton() {
        registerPage.clickOnSubmitButton();
    }

    @And("^Choose Title$")
    public void chooseTitle() {
        registerPage.clickOnGender();
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        registerPage.typeFirstnameAndLastname(firstname, lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) {
        registerPage.typePassword(password);
    }

    @And("^type companyName \"([^\"]*)\"$")
    public void typeCompanyName(String companyName) {
        registerPage.typeCompanyName(companyName);
    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) {
        registerPage.typeAddress(address);
    }

    @After
    public void quitDriver() {
        Driver.customWait(3);
        Driver.closeDriver();
    }
}