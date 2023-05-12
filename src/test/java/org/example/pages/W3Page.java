package org.example.pages;


import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.w3schools.com/")
public class W3Page extends PageObject {

    @FindBy(name="search2")
    private WebElementFacade searchTerms;

    @FindBy(name="learntocode_searchbtn")
    private WebElementFacade lookupButton;

    @FindBy(name="accept-choices")
    private WebElementFacade acceptButton;

    public void enter_keywords(String keyword) {
        acceptButton.click();
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public String getTitle() {
        WebElementFacade element = find(By.tagName("h2"));
        return element.getText();
    }
}