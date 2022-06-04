package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderPage extends Functions {
    private WebDriver driver;

    public OrderPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement usernameBox;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement loginButton;

    @FindBy(linkText = "Order")
    private WebElement orderLink;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productDropdown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantityBox;

    @FindBy(xpath = "//input[@value='Calculate']")
    private WebElement calculateButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerNameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement streetBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement cityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement stateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipCodeBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    private WebElement visaRadioButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumberBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expireDateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButon;

    @FindBy(xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']/following-sibling::strong")
    private WebElement verifyMessageElenment;


    public void typeUsername(String username) {
        sendKeysFunction(usernameBox, username);
    }

    public void typePassword(String password) {
        sendKeysFunction(passwordBox, password);
    }

    public void clickLoginButton() {
        clickFunction(loginButton);
    }

    public void clickOrderLink() {
        clickFunction(orderLink);
    }

    public void selectProductType(String option) {
        selectElementFunction(productDropdown, option);
    }

    public void setQuantity(String quantity) {
        sendKeysFunction(quantityBox, quantity);
    }

    public void cickCalculateButton() {
        clickFunction(calculateButton);
    }

    public void typeCustomerName(String customerName) {
        sendKeysFunction(customerNameBox, customerName);
    }

    public void typeStreet(String street) {
        sendKeysFunction(streetBox, street);
    }

    public void typeCity(String city) {
        sendKeysFunction(cityBox, city);
    }

    public void typeState(String state) {
        sendKeysFunction(stateBox, state);
    }

    public void typeZipCode(String zipCode) {
        sendKeysFunction(zipCodeBox, zipCode);
    }

    public void clickVisaButton() {
        clickFunction(visaRadioButton);
    }

    public void typeCardNumber(String cardNumber) {
        sendKeysFunction(cardNumberBox, cardNumber);
    }

    public void typeExpireDate(String expireDate) {
        sendKeysFunction(expireDateBox, expireDate);
    }

    public void clickProcessButton() {
        clickFunction(processButon);
    }

    public void verifySuccessMessage(String message) {
        assertionFunction(verifyMessageElenment, message);
    }

}
