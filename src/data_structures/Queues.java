package data_structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;


public class Queues {

    public static void main(String[] args){

        LinkedList<People> linkedlist = new LinkedList<>();
        linkedlist.addFirst(new People("kchild", 4)); // adding element to the top of linked list
        linkedlist.addLast(new People("kgirlchild", 2)); // adding element to the end of linked list
        linkedlist.add(new People("Kboy",22));
        linkedlist.add(new People("Kgirl", 17));
        ListIterator<People> peopleListIterator = linkedlist.listIterator();
        while (peopleListIterator.hasNext()){
            System.out.println(peopleListIterator.next());  // loop through linked list and print in forward order
        }
        while (peopleListIterator.hasPrevious()){
            System.out.println(peopleListIterator.previous());  //print elements of linked list in reverse order
        }

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
