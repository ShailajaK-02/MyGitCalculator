package InterfaceImpl;

import Interface.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}

	

	

	}
