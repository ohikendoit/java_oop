package lotto;

public class Lotto {

	public static void main(String[] args) {
		
		int[] lottoArray = new int[6];
		lottoArray[0] = 5;
		lottoArray[1] = 15;
		lottoArray[2] = 27;
		lottoArray[3] = 34;
		lottoArray[4] = 36;
		lottoArray[5] = 41;
		
		System.out.println(lottoArray[0]);
		
		int number = 100;
		
		// 전통적인 for
		for (int index = 0; index < lottoArray.length; index += 1) {
			if ( index % 2 == 0) {
				System.out.println(index);
			}
		}
		
		//성능이 빠른 for-each
		//인덱스 값이 없음
		
		String string = "26. 대대전술단은 1개 전차중대(탱크 10대), 3개 기계화 보병중대(장갑차 40대), 1개 대전차중대와 3개의 포병중대(자주포나 다연장로켓 운영), 1개 방공중대의 편제로 구성이 됨. \r\n"
				+ "\r\n"
				+ "​\r\n"
				+ "[출처] 러시아 vs 우크라이나 전쟁 근황|작성자 메르";
		int len = string.length();
		
		String[] wordArray = string.split(" ");
		
		for (int i = 0; i < wordArray.length; i += 1) {
			System.out.println(wordArray[i]);
		}
		
		
						
	}
}

