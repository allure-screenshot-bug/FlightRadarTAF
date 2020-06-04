package com.mentorship.page.widget;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AirportDetailsWidget {

    private final SelenideElement airportWidgetWrapper = $(".airport-info-wrapper");

    private final SelenideElement airportName = $("[data-component='airportInfo'] h2");

    private final SelenideElement airportCode = $("[data-component='airportInfo'] .code");

    public boolean isAirportWidgetWrapperVisible() {
        return airportWidgetWrapper.isDisplayed();
    }

    public String getAirportName() {
        return airportName.shouldBe(Condition.visible).getText();
    }

    public String getAirportCode() {
        return airportCode.shouldBe(Condition.visible).getText();
    }
}
