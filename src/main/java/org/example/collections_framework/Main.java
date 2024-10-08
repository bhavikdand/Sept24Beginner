package org.example.collections_framework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        Map<String, String> map = new HashMap<>();

        Collections.shuffle(list);

        Collections.sort(list);
        int position = Collections.binarySearch(list, 5);
        if(position < 0){
            // element is missing
            System.out.println("5 is not present");
        } else {
            System.out.println("5 is present at " + position);
        }
    }
}
