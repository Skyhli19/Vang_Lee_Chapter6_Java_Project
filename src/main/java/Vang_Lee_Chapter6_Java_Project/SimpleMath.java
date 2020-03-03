package Vang_Lee_Chapter6_Java_Project;

public class SimpleMath {
	double divide(double num, double den) {
		double result = num/ den;
		if (den == 0) {
			throw new ArithmeticException("Cannot be divided by 0");
		}
		return result;	
	}
	double multiply(double num1, double num2) {
		double result = num1*num2;
		return result;
	}

}

