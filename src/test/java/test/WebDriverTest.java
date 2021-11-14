package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class WebDriverTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserLoadUp() {
        driver = new ChromeDriver();
        driver.get("https://teletrade.org/ru/trading/trading-platforms/terminal-window");
    }

    @Test
    public void someFunctionTest() {
//    HomePage homePage = new HomePage();


    }

    @AfterMethod(alwaysRun = true)
    public void browserQuit() {
        //driver.quit();
    }
}
