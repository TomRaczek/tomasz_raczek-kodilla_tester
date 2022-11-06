package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement inputField = driver.findElement(By.cssSelector(".myre_8v_x button:first-of-type"));
        inputField.click();
        WebElement categories = driver.findElement(
                By.cssSelector(".mp7g_oh select optgroup:first-of-type option[value=\"/kategoria/elektronika"));
        categories.click();
        WebElement search = driver.findElement(
                By.cssSelector("form input"));
        search.sendKeys("Mavic mini");
        search.submit();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector(".opbox-listing section:first-of-type article:first-of-type")));
        List<WebElement> element = driver.findElements(By.cssSelector("section>article"));
        for (int i = 0; i < element.size(); i++) {
            System.out.println(element.get(i).getText());
        }
    }
}