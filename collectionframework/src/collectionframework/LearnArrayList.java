package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		
//   ArrayList<String> studentsName= new ArrayList<>();
//   // size = n
////   n+n/2+1
//    
//    studentsName.add("Deepak");
		
		/*
		List<Integer> List= new ArrayList();
		List.add(1);
		List.add(2);
		List.add(3);
		System.out.println(List);
	    List.add(4);//This will add 4 at end the List..
		System.out.println(List);
	List.add(1,50);// this will add the value
	System.out.println(List);
	
    List<Integer> newList = new ArrayList();// creating new list
    newList.add(150);
    newList.add(160);
    List.addAll(newList);//this will add all elements
    
    System.out.println(List);
    
    System.out.println(List.get(1));
    */
		
		
		List<Integer> List=new ArrayList<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		List.add(50);
		List.add(60);
		List.add(70);
		List.add(80);
		System.out.println(List);
		for(int i=0; i<List.size(); i++) {
System.out.println("List elements is" + " "+ List.get(i));
		}
		for(Integer element: List) {
System.out.println("foreach element is" + element);
		
		}
	Iterator<Integer> it = List.iterator();
	while(it.hasNext()) {
		
		System.out.println("Iteretor" + it.next());
	}
	
		
		
//		List.remove(1);//Remove the elements
//		System.out.println(List);
//		List.remove(Integer.valueOf(30));
//		System.out.println(List);
//		List.clear();//remove all elements
//		System.out.println(List);
    
		
//	List.set(2, 1000);
//	System.out.println(List);
//	
//	
//	System.out.println(List.contains(50));
//	
	
		
	}

}
