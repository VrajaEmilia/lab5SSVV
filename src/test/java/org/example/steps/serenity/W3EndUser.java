package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.W3Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class W3EndUser {

    W3Page w3Page;

    @Step
    public void enters(String keyword) {
        w3Page.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        w3Page.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
       assertThat(w3Page.getTitle(), equals(definition));
    }

    @Step
    public void is_the_home_page() {
        w3Page.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}