package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement notification;
    WebElement returnToMainMenuButton;
    WebElement itemDescription;
    WebElement buttons;

    public CartPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNotification() {
        return driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td/b"));
    }

    public WebElement getReturnToMainMenuButton() {
        return driver.findElement(By.id("BackLink"));
    }

    public WebElement getItemDescription() {
        return driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[3]"));
    }

    public List <WebElement> getButtons() {
        return driver.findElements(By.className("Button"));
    }

    //----------------------------

    public void clickOnReturnToMainMenuButton () {
        getReturnToMainMenuButton().click();
    }

    public WebElement getRemoveButton () {

        int x = 0;
        for (int i = 0; i < getButtons().size(); i++ ) {
            if (getButtons().get(i).getText().equals("Button")) {x = i;}
        }
        return getButtons().get(x);
    }


}
