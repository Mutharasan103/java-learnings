import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Arraylist Excersice
public class Arraylisdemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Dear");
        list.add("Orange");
        list.add("Banana");
        list.add("Cat");


        System.out.println(list);
        //add an element to selected index

        System.out.println("Element after insertion");
        list.add(1,"Ant");
        list.add(3,"Dog");




        System.out.println(list);


        // Using iterator to print element one by one
        for (String str:list)
        {
            System.out.println(str);
        }

        // Get an element from certain position
        String element = list.get(2);
        System.out.println("The element is " +element);

        //Update an element to selected index

        list.set(0,"Arasan");
        System.out.println("After updated");
        System.out.println(list);

        // sort
        System.out.println("After sorting an elements" );
        Collections.sort(list);
        System.out.println(list);


        //Remove element
        //list.removeAll(list);
       // System.out.println(list);


        //search an element

        if (list.contains("Cat"))
        {

            System.out.println("The element is found" );
        }
        else {
            System.out.println("The element is not found");
        }

        List<String> sublist = list.subList(0,2);
        System.out.println(sublist);


    }
}
