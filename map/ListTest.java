package map;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

		public static void main(String[] args) {
			List<String> strList = new ArrayList<>();
			strList.add("100");
			
			if (strList.contains("100")) { //중복체크는 컨테인스로한다
				System.out.println("100은 이미 등록되어있습니다.");
			}
			
		}
}
