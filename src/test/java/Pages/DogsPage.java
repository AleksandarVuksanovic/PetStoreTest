package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DogsPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement goldenRetrieverButton;

    public DogsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getGoldenRetrieverButton() {
        return driver.findElement(By.linkText("K9-RT-01"));
    }

    //---------------------------

    public void clickOnGoldenRetrieverButton () {
        getGoldenRetrieverButton().click();
    }

}
