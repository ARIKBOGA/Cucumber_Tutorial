package pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

public abstract class Functions {

    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectElementFunction(WebElement dropdown, String visibleText) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
    }

    public void assertionFunction(WebElement alertMessageElement, String expectedMessage) {
        wait.until(ExpectedConditions.visibilityOf(alertMessageElement));
        Assert.assertEquals(alertMessageElement.getText(), expectedMessage);
        System.out.println("My message: " + alertMessageElement.getText());
    }
}