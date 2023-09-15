package data_structures;

import java.util.Stack;

public class StackDefault {
    public static void main(String[] args){
        Stack chips = new Stack<>();
        chips.push("chip1");
        chips.push("chip2");
        chips.push("chip3"); // last element to enter

        System.out.println(chips.peek());//element at top of stack
        System.out.println(chips.pop());
        chips.add("d");
        System.out.println(chips);


    }
}
