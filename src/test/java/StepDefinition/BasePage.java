package StepDefinition;
import io.cucumber.java.en.Given;
import Pages.HomePage;
import utility.BrowserDriver;
public class BasePage {

    @Given("User navigates to login page")
    public void userNavigatesToLoginPage() throws Throwable
    {
        //BrowserDriver bd = new BrowserDriver();
        HomePage homepage = new HomePage();
        homepage.clickHamburger();
        homepage.signPortal();

    }}
