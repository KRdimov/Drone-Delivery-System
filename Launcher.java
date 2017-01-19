package drone_delivery_system;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Launcher {
	
	public static void main(String[] args) {
		runSystem();
	}

	private static void runSystem() {
		System.out.println("Your request is:");
		String request = "4 2016-10-25 12:31 420,369 23 5 54 20"; //scanner.nextLine();
		System.out.println(request);
		parseRequest(request);
	}

	private static void parseRequest(String req) {
		String[] splitRequest=req.split(",");
		String[] splitProduct= splitRequest[1].split(" ");
		int[] extractProduct = new int[splitProduct.length-1]; 
		
	   //Parse string array to Integer array
	    for (int i = 0; i < extractProduct.length; i++) {
	    	extractProduct[i] = Integer.parseInt(splitProduct[i+1]);
		}
	    
	    //Fill in the HashMap
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < extractProduct.length; i++) {
	    	//the if statement separate the Even for prodId, the Odd for prod.quantity from the array "extractProduct"
			if (i%2 == 0) {
				map.put(extractProduct[i], extractProduct[i+1]);
			}
		}
	    System.out.println();
	    
	    //print the HashMap
	    for (int key : map.keySet()) {
			System.out.print("Product number:" + key);
			System.out.println(" Quantity:"+map.get(key));
		}
		
	}
}
