package data_structures;

import java.util.Stack;

public class StackDefault {
    public static void main(String[] args){
        Stack chips = new Stack<>();
        chips.push("chip1");
        chips.push("chip2");
        chips.push("chip3");

        System.out.println(chips.peek());
        System.out.println(chips.pop());
        System.out.println(chips);

    }
}
