package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserSteps;
import org.example.steps.serenity.W3EndUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchW3Schools {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public W3EndUser anna;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("html");
        anna.should_see_definition("Easy Learning with HTML \"Try it Yourself\"");

    }
}
