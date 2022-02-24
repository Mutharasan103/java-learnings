import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");
        linkedList.add("Six");
        linkedList.add("Seven");
        linkedList.add("Eight");
        linkedList.add("Nine");
        linkedList.add("Ten");
        System.out.println("The linked list is- "+linkedList);

        //Iterator
        for (String str:linkedList)
        {
            System.out.println(str);
        }
        System.out.println("After iterator");
        Iterator iterator = linkedList.listIterator(3);
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //Descending order or reverse

        Iterator it = linkedList.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        for (int index = 0; index< linkedList.size();index++)
        {
            System.out.println("THe index of "+index+ ": is " +linkedList.get(index));
        }



    }
}
