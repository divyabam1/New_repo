package StepDefinition;
import io.cucumber.java.en.When;

import static Pages.SignInPage.*;

public class SignInPage_sd {

    @When("User is sucessfully enters the login details")
    public void logins()
    {

        sendkeysusername();
        sendkeyspwd();
        clickloginbtn();
    }
}
