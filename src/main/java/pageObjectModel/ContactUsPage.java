package pageObjectModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends Functions {
    WebDriver driver;
    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;
    @FindBy(id = "id_contact")
    private WebElement subjectHeadingDropdown;
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(id = "id_order")
    private WebElement orderReferenceInput;
    @FindBy(id = "message")
    private WebElement messageForm;
    @FindBy(id = "submitMessage")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@id='center_column']/p")
    private WebElement successMessageElement;

    public ContactUsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickContactUsButton() {
        clickFunction(contactUsButton);
    }

    public void selectSubjectHeading() {
        selectElementFunction(subjectHeadingDropdown, "Customer service");
    }

    public void enterEmail() {
        sendKeysFunction(emailInput, "abc@gmail.com");
    }

    public void enterOrderReference() {
        sendKeysFunction(orderReferenceInput, "Order reference");
    }

    public void enterMessage() {
        sendKeysFunction(messageForm, Faker.instance().chuckNorris().fact());
    }

    public void clickSubmitButton() {
        clickFunction(submitButton);
    }

    public void verifySuccessMessage() {
        assertionFunction(successMessageElement, "Your message has been successfully sent to our team.");
    }
}