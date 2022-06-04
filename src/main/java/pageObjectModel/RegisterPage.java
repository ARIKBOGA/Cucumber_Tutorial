package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends Functions {

    private WebDriver driver;

    public RegisterPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(name = "email_create")
    private WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstnameElement;

    @FindBy(id = "customer_lastname")
    private WebElement lastnameElement;

    @FindBy(id = "passwd")
    private WebElement passwordElement;

    @FindBy(id = "company")
    private WebElement companyNameElement;

    @FindBy(id = "address1")
    private WebElement addressElement;

    public void clickOnSignInButton() {
        clickFunction(signInButton);
    }

    public void typeEmail(String email) {
        sendKeysFunction(emailTextBox, email);
    }

    public void clickOnSubmitButton() {
        clickFunction(submitButton);
    }

    public void clickOnGender() {
        clickFunction(gender);
    }

    public void typeFirstnameAndLastname(String firstname, String lastname) {
        sendKeysFunction(firstnameElement, firstname);
        sendKeysFunction(lastnameElement, lastname);
    }

    public void typePassword(String password) {
        sendKeysFunction(passwordElement, password);
    }

    public void typeCompanyName(String companyName) {
        sendKeysFunction(companyNameElement, companyName);
    }

    public void typeAddress(String address) {
        sendKeysFunction(addressElement, address);
    }
}
