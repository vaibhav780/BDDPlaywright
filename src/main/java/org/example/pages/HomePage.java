package org.example.pages;

import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage {

    Page page;

    String header= "//h6";


    public HomePage(Page page) {
        this.page = page;
    }


    public void VerifytitleHome(String pageheader){
        assertThat(page.locator(header)).containsText(pageheader);
    }
}
