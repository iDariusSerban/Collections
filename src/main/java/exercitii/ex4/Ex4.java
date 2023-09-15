package exercitii.ex4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(-2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(4);
        numbers1.add(-5);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(-7);
        numbers2.add(2);

        System.out.println(numbers1 + "," + numbers2);
        System.out.println(findPositiveNumbers(numbers1, numbers2));
    }

    public static Set<Integer> findPositiveNumbers(List<Integer> numbers1, List<Integer> numbers2) {
        Set<Integer> positiveNumbers = new HashSet<>();
        for (Integer number : numbers1) {
            if (number >= 0) {
                positiveNumbers.add(number);
            }
        }
        for (Integer number : numbers2) {
            if (number >= 0) {
                positiveNumbers.add(number);
            }
        }


        return positiveNumbers;
    }
}
