package Test;

import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Main {

	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		int sum = c.add(11, 12);
		System.out.println("Addition : " + sum);
		
 }

}
