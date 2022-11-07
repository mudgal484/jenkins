package Testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_Page extends Annotations {
    @Test(priority = 3)
    public void search_page() {
        //validating search bar
        Boolean b = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);
    }

    @Test(priority = 4)
    public void search_page2() {
        //validating that it is enabled or not for sending data into it
        Boolean b = driver.findElement(By.id("twotabsearchtextbox")).isEnabled();
        Assert.assertTrue(b);
    }

    @Test(priority = 5)
    public void search_page3() {
        //validating whether it is searching what is demanded or not
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String s = driver.findElement(By.xpath("//span[text()='\"iphone\"']")).getText();
        Assert.assertEquals(s, "\"iphone\"");
    }

    @Test(priority = 6)
    public void search_page4() {
        //Validating the contents of searched item.
        String s = driver.findElement(By.xpath("//span[text()=\"Apple iPhone 14 128GB Starlight\"]")).getText();
        Assert.assertTrue(s.contains("iPhone"));

    }
}
