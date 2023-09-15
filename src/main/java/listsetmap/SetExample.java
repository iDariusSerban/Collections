package listsetmap;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("Japan");
        countries.add("India");
        System.out.println(countries);

        System.out.println(countries.contains("Japan"));

        for (String country : countries){
            System.out.println(country);
        }

    }
}
