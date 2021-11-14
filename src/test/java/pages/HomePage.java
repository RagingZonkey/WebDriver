package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private String login = "490155";
    private String password = "h3movhcp";

    @FindBy(id="login")
    private WebElement loginInputElement;

    @FindBy(id="password")
    private WebElement passwordInputElement;

    @FindBy(xpath = "//*[@id='server']")
    private WebElement serverInputComboBox;

    @FindBy(id="mt5-platform")
    private WebElement platformChoiceRadioButton;

    @FindBy(xpath = "//*[@id='server']/option")
    private WebElement teletrade5ServerComboBoxChoiceOption;

    @FindBy(xpath = "/html/body/div[15]/div/div[3]/button[2]")
    private WebElement confirmationButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }


    public HomePage performLoginOperation() {
//        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions
//                .presenceOfAllElementsLocatedBy(By.id("mt5-platform")));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

//        platformChoiceRadioButton.click();
//        serverInputComboBox.click();
//        teletrade5ServerComboBoxChoiceOption.click();
//        loginInputElement.sendKeys(login);
//        passwordInputElement.sendKeys(password);
//
//        wait.until(ExpectedConditions.elementToBeClickable(confirmationButton));
//
//        confirmationButton.click();

        return this;
    }

}
