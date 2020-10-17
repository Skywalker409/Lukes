import java.util.Scanner;

public class FractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("what is the numerator of the fraction 1?");
		double num1 = input.nextInt();
		System.out.println("what is the denominator of the fraction 1?");
		double dem1 = input.nextInt();
		System.out.println("what is the numerator of the fraction 2?");
		double num2 = input.nextInt();
		System.out.println("what is the demnominator of the fraction 2?");
		double dem2 = input.nextInt();
	
	
		double frac1 = num1 / dem1;
		double frac2 = num2/dem2;
		double frac11 = frac1;
		double frac22 = frac2;
		Fraction diff = new Fraction();
		 double ans1 = diff.posDiff(frac11, frac22);
		 System.out.println( "Differnece:" +frac1 +" - " + frac2 +" = "+ans1);
		double ans2 = diff.xpower(frac11, frac22);
		 System.out.println("power:" +frac1 +" ^ " + frac2 +" = "+ans2);
		 double ans3 = diff.add(frac11, frac22);
		 System.out.println("Addition : " + ans3);
		 double ans4 = diff.multi(frac11, frac22);
		 System.out.println("multiplication : " + ans4);
		 double ans5 = diff.div(frac11, frac22);
		 System.out.println("Division: " + ans5);
		 
		 
		
		
		
		
	}

}
