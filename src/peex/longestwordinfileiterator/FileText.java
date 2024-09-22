package peex.longestwordinfileiterator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Scanner;

public class FileText {

    public static Iterator<String> readText(Path path) {
        Iterator<String> words;
        try {
            File file = path.toFile();
            words = readInput(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File is not found");
            e.printStackTrace(System.out);
            System.out.println("Enter the text. Press Enter, then press Cmd + D (or Ctrl + D) when you finish entering the text");
            words = readInput(System.in);
        }
        ((Scanner) words).close();
        return words;
    }

    public static Iterator<String> readInput(InputStream in) {
        Scanner scanner = new Scanner(in);
        scanner.useDelimiter("\\p{Punct}*\\p{javaWhitespace}+\\p{Punct}*");
        return scanner;
    }

/*    public static List<String> readAndRemovePunctuatin(Scanner scanner) {
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.next();
            words.add(data);
        }
        return words;

    }*/
}
