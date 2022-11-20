package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomPage extends AbstractPage {

    private RandomPage randomPage;

    public RandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getLink(WebDriver driver) {
        return driver.getCurrentUrl();
    }
}