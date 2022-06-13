package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePage{

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement dogsButton;
    WebElement cartButton;
    WebElement signInButton;
    WebElement signOutButton;
    WebElement myAccount;


    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDogsButton() {
        return driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]"));
    }

    public WebElement getCartButton() {
        return driver.findElement(By.name("img_cart"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.linkText("Sign In"));
    }

    public WebElement getSignOutButton() {
        return driver.findElement(By.linkText("Sign Out"));
    }

    public WebElement getMyAccount() {
        return driver.findElement(By.linkText("My Account"));
    }

    //----------------------------------------------

    public void clickOnDogsButton () {
        getDogsButton().click();

    }

    public void clickOnCartButton () {
        getCartButton().click();
    }

    public void clickOnSignInButton () {
        getSignInButton().click();
    }

    public void clickOnMyAccountButton () {
        getMyAccount().click();
    }

}
