package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(52);
        linkedList.add(52);
        linkedList.add(5);
        linkedList.add(16);
        linkedList.add(9);

//        for (Integer number: linkedList){
//            System.out.println(number);
//        }

//        for (int i = 0; i<linkedList.size(); i++){
//            System.out.println(linkedList.get(i));
//        }

//        int count = 0;
//        while (count<linkedList.size()){
//            System.out.println(linkedList.get(count));
//            count++;
//        }


        System.out.println(linkedList.contains(500));

//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
