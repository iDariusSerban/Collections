package exercitii.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(toSquare(numbers));
    }
    public static List<Integer> toSquare (List<Integer> numbers){
        List<Integer> squareNumbers = new ArrayList<>();
        for (Integer number:numbers) {
            squareNumbers.add(number*number);
        }
        return squareNumbers;
    }
}
