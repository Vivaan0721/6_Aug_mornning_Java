package Polymorphism;

public class Method_Overriding {
	
	public static void main(String[]args) 
	{
		
		//Create object of son class
		Son S1=new Son();
		S1.Mobile();
		S1.Car();
		S1.Money();
		S1.Home();
		
		
		System.out.println("---------------------------------------------");
		
		//Create object of Father class
		
		Father F1=new Father();
		F1.Car();
		F1.Money();
		F1.Home();
		
	}

}
