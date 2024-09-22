package peex.longestwordinfilearraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputText {

    /**
     * Gets text from the file, if the file is not provided asks user to provide a text in console.
     * @param path file path
     * @return a list of words
     */
    public static List<String> readText(Path path) {
        List<String> words;
        try {
            File file = new File(String.valueOf(path));
            words = readFromFile(file);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File is not found");
            e.printStackTrace();
            words = readUserInput();
        }
        return words;
    }

    /**
     *
     * @return the list of words without punctuation
     */
    public static List<String> readUserInput() {
        List<String> words;
        System.out.println("Enter the text. Press Enter, then press Cmd + D (or Ctrl + D) when you finish entering the text");
        Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter("\\p{Punct}* \\p{Punct}*");
        words = readAndRemovePunctuation(scanner);
        scanner.close();
        return words;
    }

    /**
     *
     * @param file
     * @return
     * @throws FileNotFoundException
     */
    public static List<String> readFromFile(File file) throws FileNotFoundException {
        List<String> words;
        Scanner scanner = new Scanner(file);
        words = readAndRemovePunctuation(scanner);
        scanner.close();
        return words;
    }

    /**
     * Removes punctuation and white spaces at the end and at the beginning of the word.
     * @return
     */
    public static List<String> readAndRemovePunctuation(Scanner scanner) {
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.next();
            data = data.replaceAll("^\\p{Punct}*", "");
            data = data.replaceAll("\\p{Punct}*$", "");
            words.add(data);
        }
        System.out.println(words);
        return words;
    }
}