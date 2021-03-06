package com.example.liukuangcong.espressotest.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.liukuangcong.espressotest.MainActivity;
import com.example.liukuangcong.espressotest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by liukuangcong on 5/24/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Maintest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testText() {
        String expectedText = "Hello World!";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));

    }

    /*@Test
    public void sayHello(){
        onView(withId(R.id.editText)).perform(typeText("hello"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        String expectedText = "hello";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));
    }*/

    @Test
    public void test_again(){
        onView(withId(R.id.editText)).perform(typeText("CSE 110"),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.button2)).perform(click());

        String expectedText = "011 ESC";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));

    }


}
