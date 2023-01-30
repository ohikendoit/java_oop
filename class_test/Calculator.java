package class_test;

public class Calculator {

	public static void main(String[] args) {
		
		/*
		 * Primitive Type
		 *  byte, short, int, long
		 *  float, double
		 *  char, boolean
		 * 
		 * Reference Type
		 * 	Primitive Type을 제외한 모든 타입
		 * 
		 * 변수의 생성 방법
		 * Primitive Type
		 * 	type name = value;
		 * 
		 * Reference Type
		 * 	Type name = new Type();
		 * 
		 */
		String name = "정윤성";
		String name2 = new String("정윤성");
		System.out.println(name);
		System.out.println(name2);
		
		ScoreCalculator scoreCalculator = new ScoreCalculator(); //인스턴스화 (객체화)
		scoreCalculator.getAverage();
		scoreCalculator.getGrade();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		temperatureConverter.toCel();
		temperatureConverter.toFah();
	}
	
}
