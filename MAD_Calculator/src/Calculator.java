import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Calculator {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		int operator;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number 1");
		number1=obj.nextInt();
		System.out.println("Enter number 1");
		number2=obj.nextInt();
		System.out.println("Enter operator");
		operator=obj.nextInt();
	
		
		switch (operator) {
		case 1: 
			System.out.println(number1 + number2);
		case 2: 
			System.out.println(number1 - number2);
		case 3: 
			System.out.println(number1 * number2);
		case 4: 
			System.out.println(number1 / number2);
		case 5: 
			System.out.println(number1 % number2);
		case 6: 
			System.out.println(Math.pow(number1, number2);	
		}
	}

}
