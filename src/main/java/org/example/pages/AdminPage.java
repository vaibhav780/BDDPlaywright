package org.example.pages;

import com.microsoft.playwright.Page;

public class AdminPage {


    Page page;

    String adminLink = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span";
    String addbtn ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
    public AdminPage(Page page) {
        this.page = page;
    }


    public void goToAdmin(){
        page.click(adminLink);
    }

    public void AddNewEntery(){
    page.click(addbtn);
    }
}
