package Animals;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap ;

public class HashMapDemo {
        
	    public static void main(String[] args) {
	    	
	    	ArrayList<Integer> arr = new ArrayList<Integer>();
	    	
	    	Scanner myobj = new Scanner(System.in);
	    	
	    	int n = myobj.nextInt();
	    	
//	    	for(int i=0;i<n;i++) {
//	    		arr.add(myobj.nextInt());
//	    	}
//	    	
//	    	Collections.sort(arr);
	    	
//	    	for(int i:arr)System.out.println(i);
	    	
	    	HashMap<String,Integer> mp = new HashMap<String,Integer>();  
	    	
//	IMP :-   Keys and values in a HashMap are actually objects. In the examples above, we used objects of type 
//	    	"String". Remember that a String in Java is an object (not a primitive type). To use other types, 
//	    	such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: 
//	    	Boolean for boolean, Character for char, Double for double,
	    	
	    	
	    	for(int i=0;i<n;i++) {
	    		String name = myobj.next();            // note :-  don't use nextLine() here.
	    		int age = myobj.nextInt();
	    		mp.put(name,age);
	    	}
	    	
//	    	The difference between the Java Scanner’s next() and nextLine() methods is that nextLine() 
//	    	returns every character in a line of text right up until the carriage return, while next() 
//	    	splits the line up into individual words, returning individual text Strings one at a time.
//	    	In contrast to next(), nextLine() returns all of the text in a single line of input, 
//	    	right up to the first line break.
	    	
	         //  add items in Hashmap :-  mp.put(key,value);
	    	// access element in hashmap :- mp.get(key);
	    	// remove element :- mp.remove(key)
	    	// clear hashmap :- mp.clear()
	    	// size :- mp.size()
	    
	    // print key value pair in hashmap :- 
	    	
	    for(String s : mp.keySet()) {
	    	System.out.println("key: " + s + "  value : " + mp.get(s));
	    }
	   }
}
