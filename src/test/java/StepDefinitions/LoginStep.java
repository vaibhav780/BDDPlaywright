package StepDefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import com.microsoft.playwright.Page;
public class LoginStep {

    LoginPage loginPage;
    HomePage homePage;
    Playwright playwright= Playwright.create();
    BrowserType browserType = playwright.chromium();
    Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();

        @Given("user launched application")
        public void user_launched_application() {
           page.navigate("https://opensource-demo.orangehrmlive.com/");
           loginPage = new LoginPage(page);
           homePage = new HomePage(page);
        }
        @When("user logged in with username {string} and {string}")
        public void user_logged_in_with_username_and(String username, String password) {
            loginPage.LoginApplication(username,password);
        }
        @When("user verify Home Page title {string}")
        public void user_verify_home_page_title(String title) {
            homePage.VerifytitleHome(title);
        }



}
