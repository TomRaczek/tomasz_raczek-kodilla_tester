import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.RandomPage;


public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        WebElement cookie = driver.findElement(By.cssSelector(".QS5gu.sy4vM"));
        cookie.click();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        String randomLink = googleResults.chooseRandomResult();
        RandomPage randomPage = new RandomPage(driver);
        String expectedLink = randomPage.getLink(driver);
        Assert.assertEquals(randomLink, expectedLink);
    }
}