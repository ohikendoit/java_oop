package access;

public class Main {
	
	public static void main(String[] args) {
		
		Public pub = new Public();
		pub.add();
		
		int publicNumberOne = pub.getNumberOne();
		int publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberOne);		
		
		pub.setNumberOne(7);
		pub.setNumberTwo(3);
		publicNumberOne = pub.getNumberOne();
		publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberOne);		
		System.out.println(publicNumberTwo);		
		
		pub.add();		
	}

}
