package data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TheList {

    public static void main(String[] args){

        List lang = new ArrayList();
        lang.add("Java");
        lang.add("python");
        lang.add("dart");
        lang.add("kotlin");

        System.out.println(lang);  //print out elements of lang list

        for(Object l : lang){
            System.out.println(l);  //looping through the list and printing out its elements
        }

        List<Integer> ages = new ArrayList<>();
        ages.add(22);
        ages.add(21);
        ages.add(20);
        ages.add(19);
        ages.remove(0);
        //ages.add("s"); cannot go cos i've declared the type explicitely

        System.out.println(ages.contains(22));



        List<String> names = List.of("Kanyimi", "Unji");   //size is fixed once declared hence can't add elements


        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pear");
        fruits.add("Apple");

        fruits.remove("Banana");
        fruits.remove(2);

        for(Object f : fruits){
            System.out.println(f);
        }

        
    }




}
