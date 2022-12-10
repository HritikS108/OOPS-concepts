package Animals;

import java.util.ArrayList ;
import java.util.Collections ;

public class ArrayListDemo {
        
	   public static void main (String[] args ) {
		   
		   //  create an array list
		   ArrayList<String> cars = new ArrayList<String>();
		   
		   //add items
		   cars.add("hondacity");
		   cars.add("innova");
		   
		   for(String s:cars) {
			   System.out.println(s);
		   }
		   
		   // access an item :- get()
		   String str = cars.get(1);
		   System.out.println(str);
		   
		   // to modify an element :- set()
		   cars.set(1,"swift");
		   for(String s:cars) {
			   System.out.println(s);
		   }
		   
		   // to remove an item 
		   cars.remove(0);
		   System.out.println(cars.get(0));   // imp
		   
		   // to remove all the elements :- clear()
		   cars.clear();
		   
		   // to get size of array : arr.size()
		   System.out.println(cars.size());
		   
//		   Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) 
//		   of type "String". Remember that a String in Java is an object
		   
		   // sort an arraylist 
		   Collections.sort(cars);
		   
		   
		   // LinkedList is similar to Array , difference is :-
//		   The ArrayList class has a regular array inside it. When an element is added, it is placed
//		   into the array. If the array is not big enough, a new, larger array is created to replace 
//		   the old one and the old one is removed.
//		   The LinkedList stores its items in "containers." The list has a link to the first container 
//		   and each container has a link to the next container in the list
		   
//    NOTE :-Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		   
		   // LinkedList methods :-  addFirst(), addLast(), removeFirst(), removeLast(),getFirst(),getLast().
		   
	   }
}
