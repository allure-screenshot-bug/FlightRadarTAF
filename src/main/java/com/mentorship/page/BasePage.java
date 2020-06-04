package com.mentorship.page;

import com.google.inject.Inject;
import com.mentorship.page.widget.HeaderWidget;

public class BasePage {

    @Inject
    private HeaderWidget headerWidget;

    public HeaderWidget getHeaderWidget() {
        return headerWidget;
    }
}
