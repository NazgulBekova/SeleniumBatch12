package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWSyntax {
    //Open chrome browser
    //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    //Enter valid username and password (username - Admin, password - Hum@nhrm123)
    //Click on login button
    //Then verify Syntax Logo is displayed.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[contains(@id, 'name')]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='LOGIN']"));
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        WebElement logo = driver.findElement(By.xpath("//img[contains(@src, 'syntax.png')]"));
        boolean isLogoDisplayed = logo.isDisplayed();

        if(isLogoDisplayed){
            System.out.println("Logo is displayed");
        }else {
            System.out.println("Logo is not displayed");
        }
    }
}
