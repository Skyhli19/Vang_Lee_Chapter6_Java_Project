package Vang_Lee_Chapter6_Java_Project;

public class SimpleMath {
	double divide(double num, double den) {
		double result = num/ den;
		if (den == 0) {
			throw new ArithmeticException("Cannot be divided by 0");
		}
		return result;	
	}
}
