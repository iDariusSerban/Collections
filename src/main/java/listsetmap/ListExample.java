package listsetmap;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>();

        prices.add(2);
        prices.add(3);
        prices.add(4);

        System.out.println(prices);

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }

        prices.set(1,5);
        System.out.println(prices.get(1));

        for (Integer price : prices){
            System.out.println(price);
        }

        List<String> words = new ArrayList<>();
        words.add("saffdg");
        words.add("sdfgg");
        for (String word: words){
            System.out.println(word.toUpperCase());
        }

        prices.remove(0);
        System.out.println(prices);

        System.out.println(prices.indexOf(5));
        System.out.println(prices.contains(4));

        List<String> immutableList = Arrays.asList("abc","bcd","def");





        immutableList.add("sdfg");
        System.out.println(immutableList);


    }
}
