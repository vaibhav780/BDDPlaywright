package org.example.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    Page page;

    String username="//input[@name=\"username\"]";
    String password ="//input[@name=\"password\"]";
    String  loginbtn ="//button[@type=\"submit\"]";

    public LoginPage(Page page) {
        this.page = page;
    }
    public void LoginApplication(String uname , String pass){
        page.locator(username).fill(uname);
        page.locator(password).fill(pass);
        page.click(loginbtn);
    }

}
