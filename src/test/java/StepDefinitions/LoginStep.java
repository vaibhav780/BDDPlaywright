package StepDefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.factory.ComLogger;
import org.example.factory.PlaywrightFactory;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import com.microsoft.playwright.Page;
public class LoginStep {

public LoginPage loginPage = new LoginPage(PlaywrightFactory.initbrowser());

        @Given("user launched application")
        public void user_launched_application() {
                ComLogger.info("Browser Launched");
        }
        @When("user logged in with username {string} and {string}")
        public void user_logged_in_with_username_and(String username, String password) {
            loginPage.LoginApplication(username,password);
        }
//        @When("user verify Home Page title {string}")
//        public void user_verify_home_page_title(String title) {
//            homePage.VerifytitleHome(title);
//        }



}
