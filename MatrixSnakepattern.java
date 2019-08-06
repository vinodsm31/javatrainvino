package com.training;

public class MatrixSnakepattern {

 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		 
 		int[][] myArr= {{10,20,30,40},
 						{13,23,33,43},
 						{27,29,37,48},
 						{32,33,39,50}}; 
 		int len=myArr.length; 
 		//System.out.println(len); 
 		for(int i=0;i<len;i++) 
 		{ 
 			if(i%2==0) 
 			{ 
 			for(int j=0;j<len;j++) 
 			{ 
 				System.out.print(myArr[i][j]+"-> "); 
 			} 
 			} 
 			else 
 			{ 
 				for(int j=len-1;j>=0;j--) 
 				{ 
 					System.out.print(myArr[i][j]+"->"); 
 				}	 
			} 
 		} 
  
 
 	} 
}
