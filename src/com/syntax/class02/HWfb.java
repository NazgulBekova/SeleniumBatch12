package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWfb {
    //navigate to fb.com
    //click on create new account
    //fill up all the textboxes
    //click on sign up button
    //close the pop up
    //close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fb.com/");
        driver.findElement(By.linkText("Create new account")).click();



    }
}
