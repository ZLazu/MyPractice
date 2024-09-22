package peex.longestwordinfileiterator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import static peex.longestwordinfileiterator.FileText.readText;
import static peex.longestwordinfileiterator.WordsOperations.findLongestWord;


public class TextAnalyzer {

    static Iterator<String> words;
    static Path path = Paths.get("resources/text1.txt");

    public static void main(String[] args) {
        words = readText(path);

/*        words.forEachRemaining(System.out::println);
        words.forEachRemaining(result -> System.out.print(result + " "));*/

        String maxWord = findLongestWord(words);
        System.out.println("The longest word is \"" + maxWord + "\"");
    }
}
