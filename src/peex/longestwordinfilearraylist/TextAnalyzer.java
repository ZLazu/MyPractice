package peex.longestwordinfilearraylist;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static peex.longestwordinfilearraylist.InputText.readText;
import static peex.longestwordinfilearraylist.WordsOperations.findLongestWord;

public class TextAnalyzer {

    static List<String> words;
    static Path path = Paths.get("resources/text.txt");

    public static void main (String[] args) {
        words = readText(path);

        words.forEach(System.out::println);
        words.forEach(result -> System.out.print(result + " "));

        if (!words.isEmpty()) {
            int maxWordIndex = findLongestWord(words);
            System.out.println("The longest word is \"" + words.get(maxWordIndex) + "\"");
        } else {
            System.out.println("The text is not provided");
        }
    }
}
