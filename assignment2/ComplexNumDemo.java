/**
 * A class to test the ComplexNum class
 * @author Anderson VanLandingham
 */
 
package assg2_vanlandinghama20;

public class ComplexNumDemo {
	
	public static void main(String[] args) {
		
		// Test the constructors
		ComplexNum num1 = new ComplexNum ();
		ComplexNum num2 = new ComplexNum (2.2);
		ComplexNum num3 = new ComplexNum (2.2);
		ComplexNum num4 = new ComplexNum (9.4, -5.3);
		ComplexNum num5 = new ComplexNum (4.6, 1.2);
		
		//Tests the string method
		System.out.println("Testing the String method: \n");
		System.out.println(num1.toString());
		System.out.println(num2.toString());
		System.out.println(num3.toString());
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("\n");
		
		//Testing the setReal method
		System.out.println("Testing the setReal methods: \n");
		System.out.println("The original number is " + num1);
		num1.setReal(1.1);
		System.out.println("The new number is " + num1.getReal() + " as a real number. \n");
		System.out.println();
		
		//Testing the setImaginary method
		System.out.println("Testing the setImaginary methods: \n");
		System.out.println("The original number is " + num3);
		num3.setImaginary(7.9);
		System.out.println("The new number is " + num3.getImaginary() + " as a imaginary number. \n");
		System.out.println();
		
		//Testing the add method
		System.out.println("Testing the addition: \n");
		System.out.println("The number is " + num4 + " and " + num3 + " which are: ");
		ComplexNum add1 = num4.add(num3);
		System.out.println("The answer to this is " + add1.toString() + "\n");
		System.out.println();
		
		//Testing the subtraction method
		System.out.println("Testing the subtraction: \n");
		System.out.println("The subtraction of " + num5 + " and " + num4 + " which is: ");
		ComplexNum sub1 = num5.sub(num4);
		System.out.println("The answer to this is " + sub1.toString() + "\n");
		System.out.println();
		
		//Test the negation method
		System.out.println("Testing the negation: \n");
		System.out.println("The negation of " + num4.toString() + " and turns it into: ");
		ComplexNum neg1 = num4.neg();
		System.out.println(neg1);
		System.out.println("\n");
		
		//Testing the equal method
		System.out.println("Testing the equal: \n");
		
		if (num1.equals(num2))
			System.out.println("num1 and num2 are equal");
		else
			System.out.println("num1 and num2 are not equal");
		if (num2.equals(num3))
			System.out.println("num2 and num3 are equal");
		else
			System.out.println("num2 and num3 are not equal");
		if (num3.equals(num4))
			System.out.println("num3 and num4 are equal");
		else
			System.out.println("num3 and num4 are not equal");
		if (num4.equals(num5))
			System.out.println("num4 and num5 are equal");
		else
			System.out.println("num4 and num5 are not equal");
		
	}

}
	
