package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement inputField = driver.findElement(By.xpath
                        ("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/button[1]"));
        inputField.click();
        WebElement categories = driver.findElement(
                By.xpath("//div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select/optgroup[1]/option[3]"));
        categories.click();
        WebElement search = driver.findElement(
                By.xpath("//form[@action=\"/listing\"]/input"));
        search.sendKeys("Mavic mini");
        search.submit();
    }
}
