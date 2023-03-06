package edu.craptocraft.romannumerals.training;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainingRegex {

    public static void main(String[] args) {

        // Create the regex expresion
        String regex = "[abc]@.";

        // source to match
        String source = "kelly@jdojo.com is invalid";
        TrainingRegex.findPattern(regex, source);

        source = "a@band@yea@u";
        TrainingRegex.findPattern(regex, source);

        source = "There is an @ sign here";
        TrainingRegex.findPattern(regex, source);

    }

    // The method that will check patterns
    public static void findPattern(String regex, String source) {

        // First compile the regex into an object
        Pattern p = Pattern.compile(regex);

        // Get a matcher object in which we will search "things"
        Matcher m = p.matcher(source);

        // Print the regex expresion and the text
        System.out.println("\nRegex: " + regex);
        System.out.println("\nRegex: " + source);

        // Find the regex expression in the source
        boolean found = false;
        while (m.find()) {

            // Search if there is a match
            System.out.println("Matched text: " + m.group() + ", Start:" +
                    m.start() + ", " + "End:" + m.end());

            // We found a match
            found = true;
        }

        // 0 matches
        if (!found) {

            System.out.println("No match found.");
        }

    }
}
