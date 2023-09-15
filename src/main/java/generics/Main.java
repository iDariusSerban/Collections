package generics;

public class Main {

    public static void main(String[] args) {
        String word = "abc";
        GenericClass<String> object1 = new GenericClass<>(word);
        System.out.println(object1.get());
        object1.set("bcd");
        System.out.println(object1.get());

        GenericClass<Integer> object2 = new GenericClass<>(4);
        System.out.println(object2.get());

        SimpleClass object3 = new SimpleClass();
        Character[] characters = {'a','b','c'};
        Integer[] numbers = {1,2,3};
        object3.printArray(characters);
        object3.printArray(numbers);
    }
}
