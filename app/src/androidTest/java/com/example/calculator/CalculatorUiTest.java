package com.example.calculator;

import android.content.Context;

import androidx.test.filters.MediumTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class CalculatorUiTest {
    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void UiAddition() {
        String expectedResult = "12";
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.sumButton)).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.equalButton)).perform(click());
        onView(withId(R.id.resultText)).check(matches(withText(containsString(expectedResult))));
    }
    @Test
    public void UiMultiplication() {
        String expectedResult = "35";
        onView(withId(R.id.fiveButton)).perform(click());
        onView(withId(R.id.multiplicationButton)).perform(click());
        onView(withId(R.id.sevenButton)).perform(click());
        onView(withId(R.id.equalButton)).perform(click());
        onView(withId(R.id.resultText)).check(matches(withText(containsString(expectedResult))));
    }
}