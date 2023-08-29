package data_structures;

import java.util.LinkedList;
import java.util.Queue;


public class Queues {

    public static void main(String[] args){

    }

    private static void queues() {
        Queue<People> people = new LinkedList<>();
        people.add(new People("Ihims",22));
        people.add(new People("Kanyimi",21));
        people.add(new People("Paul",20));

        System.out.println(people.peek());
        people.peek();
        System.out.println(people.poll()); //remove first element which or throw exception error if queue is empty
        System.out.println(people.size());
    }

    static record People(String name, int age){};
}
