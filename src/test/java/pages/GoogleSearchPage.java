package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GoogleSearchPage {

    public static String before = null;
    public static String after = null;
    public static WebDriver driver;
    public static String pageTitleExpectedGoogle = "Google";

    public void openWebpagegoogle() {
        //Set the chrome driver path
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\browser" + "\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("useAutomationExtension", false);

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


    }

    public void verifyPageTitlegoogle() {

        //Verify page title
        String pageTitleActual = driver.getTitle();
        Assert.assertEquals(pageTitleExpectedGoogle, pageTitleActual);

    }

    public void verifyPageLoadgoogle() {

        Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
    }

    public void verifyGooglePage() {

        Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.name("btnI")).isEnabled());
        Assert.assertTrue(driver.findElement(By.name("btnK")).isEnabled());
    }

    public void verifySearchResults(String expectedResult) {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).getText().equalsIgnoreCase(expectedResult));
    }

    public void enterKeyword(String keyword) {
        //Clear the input field
        driver.findElement(By.name("q")).clear();
        //Enter the keyword
        driver.findElement(By.name("q")).sendKeys(keyword);
    }

    public void clickSubmit(){
        //Click on submit
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
        driver.findElement(By.name("btnK")).click();
    }

    public void closeBrowserGoogle() {
        driver.close();
        //driver.quit();
    }

}
