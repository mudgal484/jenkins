package Testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations {
    public WebDriver driver;
    @BeforeClass
    public void browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.in/");
    }

//          Having doubt in cart test cases, need to discuss with my mentor


//        @Test(priority = 7)
//        public void cart() {
//
//
//            driver.findElement(By.xpath("//span[text()=\"Apple iPhone 14 128GB Starlight\"]")).click();
//            //System.out.println("Add to cart button is enabled" + driver.findElement(By.id("add-to-cart-button")).isEnabled());
//        }
//


    @AfterClass
    public void close_browser() {
        driver.close();
    }

}
