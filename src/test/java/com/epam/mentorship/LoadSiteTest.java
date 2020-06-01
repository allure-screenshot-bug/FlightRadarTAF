package com.epam.mentorship;

import com.epam.mentorship.action.common.NavigationAction;
import com.epam.mentorship.assertion.home.HomePageAssertion;
import com.google.inject.Inject;
import org.testng.annotations.Test;

public class LoadSiteTest extends BaseTest {

    @Inject
    private NavigationAction navigationAction;

    @Inject
    private HomePageAssertion homePageAssertion;

    @Test(description = "Verify ability for guest user to load main page and see site components")
    public void verifyAbilityForGuestToLoadSite() {
        navigationAction.openHomePage();
        homePageAssertion.assertMainPageLoaded();
    }

}
