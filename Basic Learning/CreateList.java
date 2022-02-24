package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /*LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(15);
        linkedList.add(20);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(40);

         */
        list.add(15);
        list.add(20);
        list.add(5);
        list.add(7);
        list.add(40);
        list.add(100);
        System.out.println(list);
        System.out.println(list.indexOf(4));
    }
}
