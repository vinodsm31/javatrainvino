package com.traning;

import java.util.Scanner;

public class assignment2 {
       

       

       public static void main(String[] args) 
       {
             
             Scanner scan= new Scanner(System.in);
             System.out.println("enter the number");
             int number=scan.nextInt();
       
             int rows=1;
             int k=1;
             
             for(int i=1; i<=rows;i++)
             {
                    rows++;
             
                    for(int j=1;j<=i;j++)
                    {
                           
                    System.out.print(k+" ");
                    k++;
                    }
                    
                    System.out.println();
                    if(rows+(k-1)>number)
                    {
                           
                           break;
                    }
                    
             }
       
             
       }

}
