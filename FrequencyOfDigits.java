package com.training;
import java.util.Scanner;
public class FrequencyOfDigits {

	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		 
 		 
 		Scanner sc=new Scanner(System.in); 
 		System.out.println("Enter input:"); 
 		int num=sc.nextInt(); 
 		 
 		int[] digitFreq=new int[10]; 
 		int[] myArr=new int[10]; 
 		while(num>0) 
 		{ 
 			int lastdigit=num%10; 
 			digitFreq[lastdigit]++; 
 			num=num/10; 
 			 
 		} 
 		 
 		int var=0; 
 		for(int i=0;i<digitFreq.length;i++) 
 		{			 
 			if(digitFreq[i]>0) 
 			{				 
 				 
 				while(var<10) 
 				{ 
 					myArr[var]=digitFreq[i]; 
 					//System.out.println("index "+ var+ "Value "+myArr[var]); 
 					var=var+1; 
 					break; 
 				} 
 				 
 			} 
 			 
 		} 
 		 
 		for(int j=0;j<myArr.length-1 && myArr[j]>0 ;j++) 
 		{ 
 			//System.out.println(j+ "j---"+ myArr[j]); 
 			for(int k=1;k<myArr.length && myArr[k]>0;k++) 
 			{ 
 				if(myArr[j]!=myArr[k]) 
 				{ 
					System.out.println("false"); 
 					return; 
 				} 
 			} 
 			 
 						 
 		} 
 		System.out.println("True");		 
 				 
 		 
 		 
 	} 

}
