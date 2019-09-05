package com.training;

public class Dealership {  

 	
  	public static void main(String[] args) {  

  		  

 		Employee emp1=new Employee();  

  		emp1.setName("Emp1");  

  		  

  		Vehicle v1 = new Vehicle();  

  		v1.setMake("Ford"); 

  		v1.setModel("Endeavour"); 

  		v1.setYear(2019); 

  		v1.setMilage(20); 

  		v1.setPrice(2800000); 
		  

  		  

  		Vehicle v2 =new Vehicle();  

  		v2.setMake("Honda");  

  		v2.setModel("Amaze");  

  		v2.setYear(2019); 

  		v2.setMilage(27); 

  		v2.setPrice(505000); 

  		  

  		Customer c1 =new Customer();  

  		c1.setName("John");  

  		c1.setAddress("Chennai");  

  		c1.setCashOnHand(10000);  

  		  

  		boolean finance=false;  

  		  

  		  

  		c1.purchaseVehicle(emp1,v1,finance);  

  	}  

  }  
