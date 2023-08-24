package data_structures;

import java.util.Arrays;

public class TheArray {

    public static void main(String[] args){


        String[] fruits = new String[5];

        //assigning elements to the array
        fruits[0] = "Banana";  //The first index of an array is 0
        fruits[1] = "Apple";
        fruits[2] = "Mango";
        fruits[3] = "Pear";

        System.out.println(Arrays.toString(fruits));

        //updating element 2 of the array which is Fruit[1]
        fruits[1] = "Orange";

        //looping through array
        for (int i = 0; i < fruits.length ; i++) {
            System.out.println(i);
        }

        //enhancede for loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        Arrays.stream(fruits).forEach(System.out::println);

    }
}
