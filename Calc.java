package com.training;

import java.util.Scanner;

public class Calc {
       

       
       public int add(int x, int y) 
       {
             
             
              return x+y;
             
       }
       public  int add(int x, int y, int z) 
       {
             
             int c = x+y+z;
             return c;
       }
       public  int sub(int x, int y, int z) 
       {
             
             int c = x-y-z;
             return c;
       }
       public  int sub(int x, int y) 
       {
             
             int c = x-y;
             return c;
       }
       public static void main(String[] args) {
             
             // TODO Auto-generated method stub
             Scanner Sc = new Scanner(System.in);
             String ans = null;
             
             Calc cal = new Calc();
             do {
                    
             

             System.out.println("whether you want 2 or 3 parameters");
             
             int k=Sc.nextInt(); 
             System.out.println("please enter the operator (+,-,*,/)");
             String str=Sc.next();
                    
                           
             if(k==2)
             {
                      System.out.println("enter the parameter");
                      int n= Sc.nextInt();
                      System.out.println("enter the parameter2");  
                      int S1=Sc.nextInt();
                      if(str.equals("+"))
                              System.out.println("two parameters"+cal.add(n, S1) );
                      else if(str.equals("-"))
                             System.out.println("two parameters"+cal.sub(n, S1) );
                      else if(str.equals("/"))
                             System.out.println("no fucntionality" );
                      else if (str.equals("*"))
                             System.out.println("no * fucntionality" );
                    
                             
                      
             }
             else if(k==3)
                           {
                    System.out.println("enter the 3 parameter");
                    int n= Sc.nextInt();
                           int S1=Sc.nextInt();
                           int p1=Sc.nextInt();
                           if(str.equals("+"))
                           System.out.println("3 parameters"+cal.add(n, S1,p1) );
                           else if(str.equals("-"))
                                 System.out.println("3 parameters"+cal.sub(n, S1,p1) );
                           else if(str.equals("*"))
                                 System.out.println("3 parameters"+"no * functinality" );
                           else if(str.equals("/"))
                                 System.out.println("3 parameters"+"no / functinality" );
                                 
                                 
                                 
             }
             
             System.out.println("Do you want to continue Y/N");
             
             ans=Sc.next();
             
             /*System.out.println("result is" + Z); 
             System.out.println("enter 3 parameters");
             System.out.println("result is" + R); */
             
             }while(ans.equals("Y"));
             

       }

}