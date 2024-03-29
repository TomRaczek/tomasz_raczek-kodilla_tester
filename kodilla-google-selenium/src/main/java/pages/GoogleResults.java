package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResults extends AbstractPage {

    @FindBy(css = ".Z26q7c a h3.LC20lb")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public String chooseRandomResult() throws InterruptedException {
        Random random = new Random();
        int n = random.nextInt(results.size());
        WebElement webElement = results.get(n);
        WebElement parent = webElement.findElement(By.xpath("./.."));
        String chosenLink = parent.getAttribute("href");
        results.get(n).click();
        Thread.sleep(3000);
        return chosenLink;
    }
}