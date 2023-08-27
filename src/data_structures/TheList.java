package data_structures;

import java.util.ArrayList;
import java.util.List;

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
        //ages.add("s"); cannot go cos i've declared the type explicitely

        System.out.println(ages.contains(22));

        List<String> names = List.of("Kanyimi", "Unji");   //size is fixed once declared hence can't add elements
    }


}
