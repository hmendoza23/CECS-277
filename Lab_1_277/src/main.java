/*Hector Mendoza
 *CECS 277
 *Lab Assignment 1
 *9-5-18 
 */


import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		int num1 = 0;
		int denom1 = 0;
		String fraction1 = "";
		String fraction2 = "";
		int num2 = 0;
		int denom2 = 0;
		
		Scanner key = new Scanner(System.in);
		
			RationalNums R3 = new RationalNums ();
			//initialize first fraction (rational num)
			RationalNums R1 = new RationalNums(num1,denom1); 
			
			//Call function for user input
			R1.inputRational(); 
			
			// Save user input as a string
			fraction1 = R1.tostring(); 
			
			//initialize second fraction (rational num)
			RationalNums R2 = new RationalNums(num2,denom2); 
			
			//Call function for second user input
			R2.inputRational(); 
			
			//Save second user input as string
			fraction2 = R2.tostring();
			
			
				//Addition
				System.out.println("Addition:");
				System.out.print(fraction1 + " + " + fraction2+" "+"= ");
				R3.add(R1, R2);
				System.out.println("\n");
				
				//Subtraction
				System.out.println("Subtraction:");
				System.out.print(fraction1 + " - "+ fraction2 +" = ");
				R3 = R1.sub(R2);
				System.out.print(R3.tostring());
				System.out.println("\n");
				 
				//Multiplication
				System.out.println("Multiplication:");
				System.out.print(fraction1 +" x " + fraction2 +" "+"= ");
				R3.mul(R1,R2);
				System.out.println("\n");
				
				//Division
				System.out.println("Division:");
				System.out.print(fraction1 +" / " + fraction2+" = ");
				R3 = R1.div(R2);
				System.out.println(R3.tostring()+"\n");
				;
				
				//Double division
				System.out.println("Double Division:");;
				System.out.print(fraction1 +" / " + fraction2 + " = ");
				double stuff = R3.divToDouble(R1, R2);
				if (stuff == (int) stuff) {
					System.out.print((int) stuff);
				}
				else {
					System.out.print(stuff);
				}
				System.out.println("\n ");
	
			
			}
		}
		
	


