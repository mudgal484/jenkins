package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepage extends Annotations {
    @Test(priority = 1)
    public void homepage() {
        //Getting title of the homepage
        String s = driver.getTitle();
        String s1 = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        System.out.println(s);
        Assert.assertEquals(s, s1);
    }

    @Test(priority = 2)
    public void homepage2() {
        String s = driver.getCurrentUrl();
        String s1 = "https://www.amazon.in/";
        Assert.assertEquals(s, s1);
    }

}
