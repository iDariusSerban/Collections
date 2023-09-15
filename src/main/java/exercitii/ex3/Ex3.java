package exercitii.ex3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");
        words.add("prune");

        System.out.println(words);
        System.out.println(findLongestWord(words));

    }

    public static String findLongestWord(List<String> words) {
        String longerstWord = " ";
        for (String word : words) {
            if (word.length() > longerstWord.length()) {
                longerstWord = word;
            }
        }

        return longerstWord;
    }
}
