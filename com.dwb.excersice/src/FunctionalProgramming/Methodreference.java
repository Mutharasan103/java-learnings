package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Methodreference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Cat");
        list.add("Dog");
        list.stream().map(s -> s.length()).forEach(s -> System.out.println(s));

       List<Integer> list1 = new ArrayList<>();
       list1.add(20);
        list1.add(30);
        list1.add(15);
        list1.add(18);
        list1.add(50);
        list1.add(12);
        list1.stream().map(s -> s%2==0).forEach(System.out::println);




    }
}
