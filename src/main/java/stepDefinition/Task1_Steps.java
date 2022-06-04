package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.ContactUsPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Task1_Steps {

    private final ContactUsPage contactUsPage = new ContactUsPage();
    private WebDriver driver;

    @Given("^navigate to website$")
    public void navigate_to_website() {

        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click on contact us button$")
    public void click_on_contact_us_button() {
        contactUsPage.clickContactUsButton();
    }

    @Given("^select subject heading$")
    public void select_subject_heading() {
        contactUsPage.selectSubjectHeading();
    }

    @Given("^type email$")
    public void type_email() {
        contactUsPage.enterEmail();
    }

    @Given("^type order reference$")
    public void type_order_reference() {
        contactUsPage.enterOrderReference();
    }

    @Given("^type a message$")
    public void type_a_message() {
        contactUsPage.enterMessage();
    }

    @When("^click on submit button$")
    public void click_on_submit_button() {
        contactUsPage.clickSubmitButton();
    }

    @Then("^verify success message$")
    public void verify_success_message() {
        contactUsPage.verifySuccessMessage();
        Driver.closeDriver();
    }
}