package rex;
//A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text,
// you can use this search pattern to describe what you are searching for.
//A regular expression can be a single character, or a more complicated pattern.
//Regular expressions can be used to perform all types of text search and text replace operations.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Fullstack", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Fullstack Academy!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
