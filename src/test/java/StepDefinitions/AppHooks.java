package StepDefinitions;

import base.Basetest;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.factory.ComLogger;
import org.example.factory.PlaywrightFactory;

public class AppHooks  {
   PlaywrightFactory playwrightFactory;
    Page page;
    String url="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup (){
        ComLogger.info("Hooks Started");
        playwrightFactory = new PlaywrightFactory();
       page= playwrightFactory.initbrowser();
       page.navigate(url);

    }


@After
    public void teardown(){
        page.context().browser().close();
    }
}