package data_structures;

import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class TheSet {
    public static void main(){

        Set<People> peopleSet = new HashSet<>();
        peopleSet.add(new People("Mike"));
        peopleSet.add(new People("Jake"));
        peopleSet.add(new People("Jason"));
        peopleSet.add(new People("Jason")); // set data structure doesn't recognize duplicates
        // prints elements of set in any order because element of a set aren't stored in any order
        peopleSet.forEach(System.out::println);
        ListIterator<People> peopleListIterator = peopleSet.peopleListIterator();
    }
    record People(String names){}
}
