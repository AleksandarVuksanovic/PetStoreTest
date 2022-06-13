package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement userID;
    WebElement signOutButton;

    public MyAccountPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUserID() {
        return driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[1]/td[2]"));
    }

    public WebElement getSignOutButton() {
        return driver.findElement(By.linkText("Sign Out"));
    }
}
