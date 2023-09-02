package data_structures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        //A map is a collection of key-value pairs
        //Keys cannot be duplicate and can only be assigned one object
        Map<Integer, Person> myMap = new HashMap<>();

        myMap.put(1, new Person("Ihimbru"));
        myMap.put(2, new Person("Kanyimi"));
        myMap.put(3, new Person("Jude"));

        System.out.println(myMap.size());//size of map
        System.out.println(myMap.isEmpty()); //is map empty?
        System.out.println(myMap.get(1)); // Get the entry whose key is 1
        System.out.println(myMap.keySet()); // Get the set of keys 1,2...
        System.out.println(myMap.entrySet());//Get entries which are names
        myMap.remove(3);// remove third element
        myMap.getOrDefault(3, new Person("James")); //add person James to map if key is empty
        System.out.println(myMap.values()); //values without keys

        //Iterating through map and printing each entry on a new line
        myMap.entrySet().forEach(System.out::println);

        //second way
        myMap.forEach((key, person)-> System.out.println(key + "-" + person));

        //more optimized




    }
    record Person(String name){}
}
