package org.example.factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    private static Playwright playwright ;
    private static  Browser browser;
    private static  BrowserContext browserContext;
    private static  Page page;


    public static Page initbrowser(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        browserContext = browser.newContext();
        page = browserContext.newPage();
        return page;

    }
}
