package com.training;
import java.util.Scanner; 
public class ArrayLucky {

	public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter iput"); 
 		int num=sc.nextInt(); 
 		String strinput=Integer.toString(num); 
 	   int len=strinput.length(); 
 	    //System.out.println(len); 
 	    int myArr[]=new int[len]; 
 	    for(int i=len-1;i>=0;i--) 
 	    { 
 	    	//System.out.println("test"); 
 	    	myArr[i]=num%10; 
 	    	num=num/10; 
 	    } 
 	    //System.out.println(myArr[0]); 
 		for(int j=0;j<len-1;j++) 
 		{ 
 			//System.out.println("index "+j +"--Value " + myArr[j]); 
 			for(int k=j+1;k<len-1;k++) 
 			{ 
 				//System.out.println("index "+j +"--Value " + myArr[j]); 
 				//System.out.println("index "+k +"--Value " + myArr[k]); 
 				if(myArr[j]==myArr[k]) 
 				{ 
 					//System.out.println("index "+j +"--Value " + myArr[j]); 
 					//System.out.println("index "+k +"--Value " + myArr[k]); 
 					System.out.println("UnLucky"); 
 					return; 
 				} 
 			} 
 		} 
 		System.out.println("Lucky"); 
 	} 
}
