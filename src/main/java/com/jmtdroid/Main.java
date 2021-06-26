package com.jmtdroid;

public class Main {

    public static void main(String[] args) {
        // Accepts a language as an argument (either `English` or `Russian`)
        // If a language is not specified, default to English.
        String lang = "en";
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("russian")) {
                lang = "ru";
            }
        } else if (args.length > 1) {
            System.out.println("Usage:");
            System.out.println("  ./gradlew run --args='English|Russian'");
            return;
        }

        // Since we are just outputting the quote we could just write this straight to
        // stdout instead of creating a variable
        String textResponse = Forismatic.getQuote(lang);
        System.out.println("Quote (Author): " + textResponse);
    }
}
