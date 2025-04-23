package com.example.tugasjunit;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<com.example.simplecalculator.MainActivity> activityRule =
            new ActivityScenarioRule<>(com.example.simplecalculator.MainActivity.class);

    /**
     * Test case untuk menguji fungsi penjumlahan pada UI
     * Menguji apakah aplikasi dapat melakukan penjumlahan dan menampilkan hasil dengan benar
     * Langkah-langkah:
     * 1. Input angka 15 pada field pertama
     * 2. Input angka 7 pada field kedua
     * 3. Klik tombol Add
     * Expected output: Text "15 + 7 = 22" muncul pada hasil
     */
    @Test
    public void testAddOperation() {
        // Input first number
        Espresso.onView(ViewMatchers.withId(R.id.firstNumberEditText))
                .perform(ViewActions.typeText("15"), ViewActions.closeSoftKeyboard());

        // Input second number
        Espresso.onView(ViewMatchers.withId(R.id.secondNumberEditText))
                .perform(ViewActions.typeText("7"), ViewActions.closeSoftKeyboard());

        // Click add button
        Espresso.onView(ViewMatchers.withId(R.id.addButton))
                .perform(ViewActions.click());

        // Check if result is displayed correctly
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("15 + 7 = 22")));
    }

    /**
     * Test case untuk menguji fungsi pengurangan pada UI
     * Menguji apakah aplikasi dapat melakukan pengurangan dan menampilkan hasil dengan benar
     * Langkah-langkah:
     * 1. Input angka 20 pada field pertama
     * 2. Input angka 8 pada field kedua
     * 3. Klik tombol Subtract
     * Expected output: Text "20 - 8 = 12" muncul pada hasil
     */
    @Test
    public void testSubtractOperation() {
        // Input first number
        Espresso.onView(ViewMatchers.withId(R.id.firstNumberEditText))
                .perform(ViewActions.typeText("20"), ViewActions.closeSoftKeyboard());

        // Input second number
        Espresso.onView(ViewMatchers.withId(R.id.secondNumberEditText))
                .perform(ViewActions.typeText("8"), ViewActions.closeSoftKeyboard());

        // Click subtract button
        Espresso.onView(ViewMatchers.withId(R.id.subtractButton))
                .perform(ViewActions.click());

        // Check if result is displayed correctly
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("20 - 8 = 12")));
    }
}