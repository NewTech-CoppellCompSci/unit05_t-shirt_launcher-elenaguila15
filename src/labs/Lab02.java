package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		  Scanner inKey = new Scanner(System.in);
	        double entnum; //The first double
	        double entnum2; //The second double
	        System.out.println("Enter a postitive integer");
	        entnum = inKey.nextInt();
	        System.out.println("Enter another postitive integer");
	        entnum2 = inKey.nextInt();
	        for (int i = 1; i < 11; i++){ //for statement 
	        double scope = entnum;
	        double min = entnum2;
	            int num = (int) (Math.random() * scope + min);
	            System.out.println(num);
	        }
		
	}


	public static void problem2() {
		
		 Scanner inKey = new Scanner(System.in);
	        double Radius;//First double
	        double Height;//Second double
	        double PI;// the double for pie
	        PI  = 3.141592653589793;
	        System.out.println("Enter the radius");
	        Radius = inKey.nextInt();
	        System.out.println("Enter the height");
	        Height = inKey.nextInt();
	        
	    System.out.println("The radius is" + PI * Radius * Radius * Height );    
	    }
	


	public static void problem3() {

        Scanner inKey = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        System.out.println("Enter x1:");
        x1 = inKey.nextInt();
        System.out.println("Enter y1:");
        y1 = inKey.nextInt();
        System.out.println("Enter x2:");
        x2 = inKey.nextInt();
        System.out.println("Enter y2:");
        y2 = inKey.nextInt();
        System.out.println("The distance Between points");
        System.out.println( ( x2 - x1) * 2 + (y2 - y1)* 2);
		 
	}

	
	
	public static void problem4() {
		 
		 Scanner inKey = new Scanner(System.in);
	        double avalue;
	        double bvalue;
	        double cvalue;
	        double x1;
	        double x2;
	        System.out.println("Enter a-value");
	        avalue = inKey.nextInt();
	        System.out.println("Enter b-value:");
	        bvalue  = inKey.nextInt();
	        System.out.println("Enter c-value`:");
	        cvalue= inKey.nextInt();
	        System.out.print("x1 =" + bvalue +"\nx2=" + (bvalue *2 - 4* avalue * cvalue));
		
		
	}



}
