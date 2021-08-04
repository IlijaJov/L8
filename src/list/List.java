package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class List {

	public static void main(String[] args) {

		int[] num = { 8, 6, 1, 5, 3, 9, 2};

		sort(num);
		
		prime(num);
		
		System.out.println("\nMap keys and values are: " + "\n" + toMap(num));

	}
	
	public static void sort(int[] list) {
		int n; // I introduce temporary variable
		for (int i = 0; i < list.length; i++) {  //a list is put in for loop
			
			for (int j = i + 1; j < list.length; j++) { //inside a loop there is 
														//another for loop
			
				if (list[i] > list[j]) { //here all of the numbers are compared with each other 
				
					n = list[i];         //if first number is larger than second it is assigned 
					list[i] = list[j];	//it to temp variable
					list[j] = n;		//then a smaller number is assign to first position
										//and lastly a number from temp variable is assign 
										//to second position
										//this process is repeated until every number is 
										//compared and put in right order	
				}
			}
		}
		
		System.out.println("List in ascending order: "); //print command
			String comma = "";
			for (int i = 0; i < list.length; i++) {
				System.out.print(comma + list[i]); //print command
				comma = ", "; 
		}
	}
	
	
	public static void prime(int[] list) {
		System.out.println("\nPrime numbers are:"); //print command
		String comma = "";
		
		for (int i = 0; i < list.length; i++) { //a list is put in for loop
			if (list[i] < 4 && list[i] > 0) {  // if number in list is smaller than 4 
											  //and larger than 0 it is a prime number
			
		System.out.print(comma + i + "=" + list[i]); //print command
				comma = ", ";}
			
		else if (list[i] % 3 != 0 && list[i] % 2 != 0) { //if the number is not divisible by 3  
															//or 2 we know it is a prime number 
			System.out.println(comma + i + "=" + list[i]); //print command
			comma = ", ";
			}
		}
	}

	public static Map<Integer, Boolean> toMap(int [] numList) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // an empty arrayList is introduced
		for (int i = 0; i < numList.length; i++) { // here numbers are read from list 
			list.add(numList[i]);    			   // and added to arrayList
		}
		
	Map<Integer,Boolean> map = new HashMap<Integer,Boolean> (); //a map is introduced
	boolean even; // a boolean is introduced
		
	for(int i=0; i<list.size();i++) { //an arrayList is put in loop
		int n = (int) list.get(i);		// here data from list is read and assigned to int n
			
			if(n %2 == 0) { even = true;} //if n is divisible with 2 and the result is 
										 //whole number boolean even is true
			
			else {even=false;} // if number is divide by 2 and result isn't whole number  
							   //boolean even is false
			
			map.put(n, even);	//numbers and booleans are added to map	
		}
		return map; //map is returned
	}
	
}
