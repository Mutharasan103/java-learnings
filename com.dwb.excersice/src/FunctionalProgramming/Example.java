package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Example {

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
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
            printWithFp(arrayList);
            printWithFpOdd(arrayList);
            printWithFpEven(arrayList);

            int sum = arrayList.stream().reduce(0,(number1,number2) -> number1 + number2);
            System.out.println("The sum is- " +sum);
        }



    private static void printWithFpOdd(List<Integer> list) {
            list.stream().filter(element -> element%2==1).forEach(element -> System.out.println("Odd element is- "+ element));

    }
    private static void printWithFpEven(List<Integer> list) {
        list.stream().filter(element -> element%2==0).forEach(element -> System.out.println("Even element is- "+ element));

    }

    private static void printWithFp(List<Integer> list)
        {
            list.stream().forEach(element -> System.out.println("Element- " + element));
        }
    }

