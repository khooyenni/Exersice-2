import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		printQuestion1();
		printQuestion2();
		printQuestion3();
		printQuestion4();
		printQuestion5();
		printQuestion6();
		printQuestion7();
		printQuestion8();
		printQuestion9();
		printQuestion10();
		
		in.close();
		
		}
		
		public static void printQuestion1() {;
		    Scanner in = new Scanner (System.in);
		    
		    System.out.print("Please insert your first name: ");
		    String firstname = in.next();
		    System.out.print("Please insert your last name: ");
		    String lastname = in.next();
		    System.out.println("Hello \n"+  firstname +" "+ lastname);
		    System.out.println();
		}
		
		public static void printQuestion2() {
		    Scanner in = new Scanner (System.in);
		    
		    System.out.print("Please enter the first number: ");
		    int num1 = in.nextInt();
		    System.out.print("Please enter the second number: ");
		    int num2 = in.nextInt();
		    int sum = num1 + num2;
		    System.out.println("Sum of first and second number: "+ sum);
		    System.out.println();
		    
		}
		
		public static void printQuestion3() {
		    Scanner in = new Scanner (System.in);
			
		    System.out.print("Please enter the first number: ");
		    int num1 = in.nextInt();
		    System.out.print("Please enter the second number: ");
		    int num2 = in.nextInt();
		    int div = (num1/num2);
		    System.out.println("The division of first number and second number is:" + div);
		    System.out.println();
		    
		}
		
		public static void printQuestion4() {
		    Scanner in = new Scanner (System.in);
		    
		    System.out.print("Please enter the first number: ");
		    int num1 = in.nextInt();
		    System.out.print("Please enter the second number: ");
		    int num2 = in.nextInt();
		    System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		    System.out.println();
	    
		}
		
		public static void printQuestion5() {
			Scanner in = new Scanner(System.in);
			   
			System.out.print("Please enter the first number: ");
			int num1 = in.nextInt();
			System.out.print("Please enter the second number: ");
			int num2 = in.nextInt();
			System.out.print("Please enter the third number: ");
			int num3 = in.nextInt();
			System.out.print("Please enter the fourth number: ");
			int num4 = in.nextInt();
			System.out.println("Average of four numbers is: " + (num1 + num2 + num3 + num4 ) / 4);
			System.out.println();
	
		}
		
		public static void printQuestion6() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter the first number: ");
			int a = in.nextInt();   
			System.out.print("Please enter the second number: ");
			int b = in.nextInt();
			System.out.println("Before swapping : a, b = "+a+", "+ + b);
			a = a + b;
			b = a - b;
			a = a -b;
			System.out.println("After swapping : a, b = "+a+", "+ + b);
			System.out.println();

		}
		  
		public static void printQuestion7() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter the radius of the circle: ");
			double radius = in.nextDouble();
			double perimeter = 2 * Math.PI * radius;
			double area = Math.PI * radius * radius;
			System.out.println("Perimeter is = " + perimeter);
			System.out.println("Area is = " + area);
			System.out.println();
		    
		}
		
		public static void printQuestion8() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter the width of a rectangular: ");
			double width = in.nextDouble();
			System.out.print("Please enter the height of a rectangular: ");
			double height = in.nextDouble();
			double perimeter = 2*(height + width);
			double area = width * height;			
			System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
			System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
			System.out.println();
	        
	    }
		
		public static void printQuestion9() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter the first number: ");
			int num1 = in.nextInt();
			System.out.print("Please enter the second number: ");
			int num2 = in.nextInt();
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			System.out.println(num1 + " mod " + num2 + " = " +  (num1 % num2));
			System.out.println();
			 
	     }

		public static void printQuestion10() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter the number: ");
			int n = in .nextInt();
			System.out.printf("%d + %d%d  + %d%d%d + %d%d%d%d\n", n, n, n, n, n, n, n, n, n, n);
			System.out.println();
			
	     }


}
