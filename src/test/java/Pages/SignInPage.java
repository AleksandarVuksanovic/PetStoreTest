package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement username;
    WebElement password;
    WebElement signInButton;
    WebElement message;

    public SignInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.name("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.name("signon"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("messages"));
    }

    //---------------------------

    public void enterUsername (String username) {
        getUsername().clear();
        getUsername().sendKeys(username);
    }

    public void enterPassword (String password) {
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void clickOnSignInButton () {
        getSignInButton().click();
    }

}
