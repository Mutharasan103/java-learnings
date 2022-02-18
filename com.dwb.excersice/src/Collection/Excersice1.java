package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Excersice1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter your numbers ");
        arrayList.add(50);
        arrayList.add(25);
        arrayList.add(75);
        arrayList.add(40);
        arrayList.add(18);
        arrayList.add(87);
        arrayList.add(65);
        arrayList.add(10);
        arrayList.add(10);
        System.out.println(arrayList);

       // HashSet hashSet = new HashSet<>();

        for (Integer ts:arrayList)
        {
            TreeSet treeSet = new TreeSet<>();

            System.out.println(ts);

        }



    }
    }

