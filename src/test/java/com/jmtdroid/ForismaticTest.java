package com.jmtdroid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ForismaticTest {
    public enum LanguageString {
        en, ru;
    }

    private LanguageString selectedLanguage = LanguageString.en;

    @BeforeEach
    public void setUp() {
        // Most likely overkill, but attempting to show variety of testing opportunities
        int idx = new Random().nextInt(LanguageString.values().length);
        selectedLanguage = LanguageString.values()[idx];
    }

    @RepeatedTest(5)
    @DisplayName("Validate Get Quote with Different Options")
    public void testGetQuote() {
        String quote = Forismatic.getQuote(selectedLanguage.toString());
        assertNotEquals(quote, "Failure to Retrieve Quote");
        // Another assumption based on string including quote, spaces, and author name
        assert(quote.length() > 10);
    }

    @Test
    @DisplayName("Get Quote with Invalid Option")
    public void testGetQuoteInvalidOption() {
        assertNotEquals("Failure to Retrieve Quote", Forismatic.getQuote("xx"));
    }

    // Other tests could be created to test for buffer overflow.
    // It appears at this time that if you pass an invalid language to the API it will just default to English
}
