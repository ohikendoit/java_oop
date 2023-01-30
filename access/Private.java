package access;

/**
 * 모든 멤버가 Private인 클래스
 * @author 211-13
 *
 */
public class Private {
	
	private int numberOne;
	private int numberTwo;
	
	public void add() {
		int result = numberOne + numberTwo;
		System.out.println(result);
	}

}
