package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SuggestiveDropDown {

    public void selectSuggestiveDropDown() throws InterruptedException {
        // Set system properties of Chrome Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");

        // Create a driver Object based on the Browser (Instance of a chromedriver)
        WebDriver driver = new ChromeDriver(); // x objectname = operator class();
        // Load website
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice"); //Simply opening the web browser and telling it to go to the url

        //Auto Complete textbox
        driver.findElement(By.id("autocomplete")).click();
        driver.findElement(By.id("autocomplete")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));

        for(WebElement option : options){

            if (option.getText().equalsIgnoreCase("India")) {

                option.click();
                break;
            }
        }
    }
}

