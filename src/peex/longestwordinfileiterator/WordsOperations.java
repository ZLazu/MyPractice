package peex.longestwordinfileiterator;

import java.util.Iterator;

public class WordsOperations {
        public static String findLongestWord(Iterator<String> list) {
            int maxLength = list.next().length();
            String maxWord = "";
            while(list.hasNext()) {
                String word = list.next();
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    maxWord = word;
                }
            }
            System.out.println(" \n maxLength " + maxLength);
            System.out.println("maxWord " + maxWord);
            return maxWord;
        }
}
