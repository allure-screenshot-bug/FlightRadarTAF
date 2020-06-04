package com.mentorship.action.common;

import com.google.inject.Inject;
import com.mentorship.page.home.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchAction {

    private static final Logger LOG = LoggerFactory.getLogger(SearchAction.class);

    @Inject
    private HomePage homePage;

    public SearchAction searchByText(String text) {
        LOG.info("Searching by '{}' query", text);
        homePage.enterSearchText(text);
        homePage.clickOnFirstSearchSuggestion();
        return this;
    }
}
