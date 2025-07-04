package InterfaceImpl;

import Interface.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}

	@Override
	public int sub(int a, int b) {
		int sub = a -b;
		return sub;
	}

	@Override
	public int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	@Override
	public int div(int a, int b) {
		int div = a/b;
		return div;
	}

	
	
}
