package peex.longestwordinfilearraylist;

import java.util.List;

public class WordsOperations {
    public static int findLongestWord(List<String> list) {
        int maxLength = list.get(0).length();
        String maxWord = list.get(0);
        int maxWordIndex = 0;
        for (int i = 1; i < list.size(); i ++) {
            String word = list.get(i);
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxWord = word;
                maxWordIndex = list.indexOf(word);
            }
        }
        System.out.println("maxLength " + maxLength);
        System.out.println("maxWord " + maxWord);
        System.out.println("maxWordIndex " + maxWordIndex);
        return maxWordIndex;
    }
}
