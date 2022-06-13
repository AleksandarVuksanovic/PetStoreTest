package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoldenRetrieverPage {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement addToCartButton;

    public GoldenRetrieverPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.className("Button"));
    }



    //-------------------------

    public void clickOnAddToCartButton () {
        getAddToCartButton().click();
    }
}
