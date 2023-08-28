package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {

    private List<String> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public void push(String element){
        stack.add(element);
    }
    public String pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        return stack.remove(stack.size()-1);
    }

    public String peak(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        return stack.get(stack.size()-1);
    }

    @Override
    public String toString(){
        return "elements of stack are :"+stack.toString();

    }


    public static void main(String[] args){
        Stack books = new Stack();

        books.push("book1");
        books.push("book2");
        books.push("book3");
        books.push("book4");

        System.out.println(books.toString());

        books.pop();
        System.out.println(books.toString());
        System.out.println(books.peak());






    }


}
