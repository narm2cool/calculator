package calculator;

import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		
		System.out.println("Enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculato calc=new calculato();
		int result;
		//Menu Driven program
		
		
		System.out.println("Enter 1. Addition 2 Division 3 subtraction 4 mulitiplication 0 if exit ");
	    int choice=sc.nextInt();
		switch(choice)
		{
			case 1 :result=calc.addition(a, b);
					System.out.println("sum="+result);
					break;
			case 2 : result=calc.division(a, b);
					 System.out.println("dividend="+result);	
					 break;
			case 3 : result=calc.subtraction(a, b);
			         System.out.println("difference="+result);	
			            break;
			case 4 : result=calc.multiplication(a, b);
			          System.out.println("product="+result);	
			           break;
			case 0 : System.exit(a);

		}
	}
}
}


					 
		
		


	


