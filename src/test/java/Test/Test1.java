package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

    @BeforeMethod
    public void pageSetup () {
        driver.manage().window().maximize();
        driver.navigate().to(homepageURL);
    }

    @Test
    public void successfulAddToCart () throws InterruptedException {
        homepagePage.clickOnCartButton();
        Assert.assertEquals(cartPage.getNotification().getText(), "Your cart is empty.");
        cartPage.clickOnReturnToMainMenuButton();
        homepagePage.clickOnDogsButton();
        dogsPage.clickOnGoldenRetrieverButton();
        goldenRetrieverPage.clickOnAddToCartButton();

        Assert.assertTrue(cartPage.getRemoveButton().isDisplayed());
        Assert.assertEquals(cartPage.getItemDescription().getText(), "Adult Female Golden Retriever");
        boolean check = false;
        try {check = driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td/b")).isDisplayed();
        } catch (Exception e) { }
        Assert.assertFalse(check);

    }

    @Test
    public void sucessfulLogin () throws InterruptedException {

        String validUsername = excelReader.getStringData("Login", 2, 0);
        String validPassword = excelReader.getStringData("Login", 2, 1);

        homepagePage.clickOnSignInButton();
        signInPage.enterUsername(validUsername);
        signInPage.enterPassword(validPassword);
        signInPage.clickOnSignInButton();
        Assert.assertTrue(homepagePage.getSignOutButton().isDisplayed());
        Assert.assertTrue(homepagePage.getMyAccount().isDisplayed());
        homepagePage.clickOnMyAccountButton();
        Assert.assertEquals(myAccountPage.getUserID().getText(), validUsername);

    }

    @Test ()
    public void loginWithInvalidUsername () throws InterruptedException {
        homepagePage.clickOnSignInButton();

        for (int i = 1; i < excelReader.getLastRow("Login"); i++) {
            String invalidUsername = excelReader.getStringData("Login", i, 2);
            signInPage.enterUsername(invalidUsername);
            String validPassword = excelReader.getStringData("Login", 2, 1);
            signInPage.clickOnSignInButton();
            Assert.assertEquals(signInPage.getMessage().getText(), "Invalid username or password. Signon failed.");
        }

    }
    


}
