package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wdwait;

    public ExcelReader excelReader;

    public String homepageURL;

    public HomepagePage homepagePage;

    public CartPage cartPage;

    public DogsPage dogsPage;
    public GoldenRetrieverPage goldenRetrieverPage;

    public SignInPage signInPage;
    public MyAccountPage myAccountPage;

    @BeforeClass
    public void setUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\aleksandar.vuksanovi\\OneDrive - Smart kolektiv\\Documents\\Aleksandar\\Aleksandar\\IT Bootcamp\\Kurs\\Selenium\\Test Data.xlsx");
        homepageURL = excelReader.getStringData("URLS", 2, 0);
        homepagePage = new HomepagePage(driver, wdwait);
        cartPage = new CartPage(driver,wdwait);
        dogsPage = new DogsPage(driver, wdwait);
        goldenRetrieverPage = new GoldenRetrieverPage(driver,wdwait);
        signInPage = new SignInPage(driver, wdwait);
        myAccountPage = new MyAccountPage(driver, wdwait);

    }

    public void visibilityWait (WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollIntoView (WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    @AfterClass
    public void tearDown () {
        //driver.close();
        //driver.quit();
    }





}
