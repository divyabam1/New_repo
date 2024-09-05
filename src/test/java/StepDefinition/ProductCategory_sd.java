package StepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import static Pages.ProductCategoryPage.*;

public class ProductCategory_sd {


    @Then("User should be able to view the product details")
    public void productcategory() {
        String productcategoryvalue= driver.findElement(By.xpath(productcategory)).getText();
        Assert.assertEquals(productcategoryvalue,"Formal Shoes");

    }}
