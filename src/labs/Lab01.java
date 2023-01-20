package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	

	public static void problem1() {
		 Scanner inKey = new Scanner(System.in);// activating the scanner 
	        int entnum;
	        System.out.println("Put a positive integer");
	        entnum = inKey.nextInt();
	        int entnum1;
	        System.out.println("Enter another positve integer");
	        entnum1 = inKey.nextInt();
	        
	        double num1Pow = Math.pow(entnum,entnum1);//return type = double
	        System.out.println(num1Pow + "\n");
		
	}


	public static void problem2() {
		
		 Scanner inKey = new Scanner(System.in);// activating the scanner 
	        int entnum;
	        System.out.println("Put a positive integer");
	        entnum = inKey.nextInt();
	        double num2 = Math.sqrt(entnum);//The sqrt is going to find the square  root
	        System.out.println(num2 + "\n");
	}


	public static void problem3() {
		 Scanner inKey = new Scanner(System.in);
	        double entA, entB, hypotenuse;   
	        System.out.println("Length of  side A");//Enter a number 
	        entA = inKey.nextInt();
	        System.out.println("Length of  side B");//Enter another number 
	        entB = inKey.nextInt();
	        hypotenuse = Math.sqrt((entA*entA)+(entB*entB));
	        System.out.println("Hypotenuse = " + hypotenuse);
		
	}

	
	
	public static void problem4() {
		 Scanner inKey = new Scanner(System.in);// activating the scanner 
	        int entnum;
	        int max = Integer.MIN_VALUE;//Max value
	        int min = Integer.MAX_VALUE;//Min value
	        
	        System.out.print("Enter an integer");
	        entnum = inKey.nextInt();
	        while (entnum > 0)//While 
	            {
	        System.out.print("Enter an integer");
	        entnum = inKey.nextInt();
	        if (entnum < 0)//if
	        {
	        System.out.print("Enter an integer");
	        entnum = inKey.nextInt();
	        max = Math.max(max, entnum);
	        System.out.println(max);
	        System.out.println("Max =" + max);
	        min = Math.min(min, entnum);
	        System.out.println(min);
	        System.out.println("Min =" + min);
	        }}
		
		
	}





	
	
}
