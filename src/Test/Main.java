package Test;

import Interface.Calculator;
import InterfaceImpl.CalculatorImpl;

public class Main {

	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		int sum = c.sum(11, 12);
		System.out.println(sum);
		
		int cal = c.sub(10, 5);
		System.out.println(cal);
	}

}
