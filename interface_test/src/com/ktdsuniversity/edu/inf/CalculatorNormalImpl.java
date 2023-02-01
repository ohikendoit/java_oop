package com.ktdsuniversity.edu.inf;

public class CalculatorNormalImpl 
	implements Calculator{

	@Override //인터페이스에서 받아 재정의했다
	public int sum(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

	@Override //애노테이션: 함부로 지우면안된다
	public int minus(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
	
	public int devide(int numberOne, int numberTwo) {
		return numberOne / numberTwo;
	}
	
}
