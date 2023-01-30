package calculator;

/**
 * 사칙연산 클래스
 * @author 211-13
 *
 */

public class Calculator {

	//더하기 (정수, 정수): 정수
	public int sum(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		return result;
	}
	
	
	//빼기minus (정수, 정수): 정수
	public int minus(int numberOne, int numberTwo) {
		int result = 0; 
		if (numberOne > numberTwo) {
			result = numberOne - numberTwo;
		}
		else if (numberTwo > numberOne) {
			result = numberTwo - numberOne;
		}
		else {
			result = numberTwo - numberOne;
		}
		return result;
	}
	
	
	//곱하기multi (정수, 정수): 정수
	public int multi(int numberOne, int numberTwo) {
		int result = numberOne * numberTwo;
		return result;
	}
	
	
	//나누기 (정수, 정수): 실수
	public double devide(int numberOne, int numberTwo) {
		double result = (double) numberOne / numberTwo;
		return result;
	}
	
	//나머지 구하기remain (정수, 정수): 정수
	public int remain(int numberOne, int numberTwo) {
		int result = numberOne % numberTwo;
		return result;		
	}
	
	
}
