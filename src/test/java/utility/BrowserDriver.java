package utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

public static WebDriver driver;

public BrowserDriver() {

    WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver();
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

}
    public static WebDriver getDriver(){
    return driver;
}
    public void close()
    {
        driver.close();
    }

}


