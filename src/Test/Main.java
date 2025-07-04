package Test;

import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Main {

	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		int sum = c.sum(11, 12);
		System.out.println("Addition :" +sum);
		
		int cal = c.sub(10, 5);
		System.out.println("Substraction : "+cal);
		
		int mul = c.mul(20, 27);
		System.out.println("Multiplication :" +mul);
		
		int div = c.div(12, 4);
		System.out.println("Division :" +div);
		
		int mod = c.mod(55, 10);
		System.out.println("Mod :" + mod );
		
		double avg = c.avg(20, 30);
		System.out.println("Avg : "+avg);
		
		int sq = c.square(5);
		System.out.println("Square : "+sq);
 }

}
