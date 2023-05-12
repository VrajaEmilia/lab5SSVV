package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("apple");
        anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

    }

    @Issue("#WIKI-2")
    @Test
    public void searching_by_keyword_orange_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("orange");
        anna.should_see_definition("An evergreen tree of the genus Citrus such as Citrus sinensis.");

    }

    @Test
    public void searching_by_keyword_Europe_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("Europe");
        anna.should_see_definition("The portion of Eurasia west of the Urals, traditionally considered a continent in its own right, located north of Africa, west of Asia and east of the Atlantic Ocean.");
    }
} 