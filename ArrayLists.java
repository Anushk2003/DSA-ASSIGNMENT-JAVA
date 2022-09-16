package anushka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*; //imports all the packages
import java.util.Scanner;


public class ArrayLists {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // definiong an arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //add el in between
        list.add(1,1);
        System.out.println(list);

        //set element -if kisi position ko change karna hai
        list.set(0,5);
        System.out.println((list));
        //to check if particular value is present or not
        System.out.println(list.contains(12));

        //delete element
//        list.remove(3);
//        System.out.println(list);
//        //delete a particular value
//        list.remove(Integer.valueOf(5));
//        System.out.println(list);
        //Remove puri list
//        list.clear();
//        System.out.println(list);


        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));

        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //add a new list
        List<Integer> newList = new ArrayList();//creating a new list
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        //how to iterate ?
        //method-1
        for(int i = 0; i < list.size(); i++){
            System.out.println("the element is " + list.get(i));

        }
        //method-2
        for(Integer elemnt: list ){
            System.out.println("foreach element is " + element);

        }
        //method-3
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("iterator " + it.next());

        }

        //input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());

        }



    }
}
