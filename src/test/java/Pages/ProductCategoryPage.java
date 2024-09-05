package Pages;

import utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;
import utility.BrowserDriver;

public class ProductCategoryPage {


    public static WebDriver driver = BrowserDriver.getDriver();
    public static String productcategory = "//*[@id=\"ShoeType\"]";

    @Test
    public void testProductCategoryPage() {
        // Locate the element and get the text
        WebElement element = driver.findElement(By.xpath(productcategory));
        String productCategoryValue = element.getText();

        // Assert the value
        Assert.assertEquals("Formal Shoes", productCategoryValue);
    }
}
