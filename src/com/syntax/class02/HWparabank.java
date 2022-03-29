package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWparabank {
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //click on register
    //close the browser

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Nazgul");
        driver.findElement(By.id("customer.lastName")).sendKeys("Bekova");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Test Str");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fort Mill");
        driver.findElement(By.id("customer.address.state")).sendKeys("SC");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("Nazgul");
        driver.findElement(By.id("customer.password")).sendKeys("Nazgul");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Nazgul");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        //register.click();
        driver.close();


    }
}