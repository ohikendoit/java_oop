package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

		public static void main(String[] args) {
			
			Map<String, Object> map = new HashMap<>();
			map.put("JAVA", 100);
			map.put("C", 100);
			map.put("C#", 100);
			map.put("PYTHON", 100);
			
			System.out.println("JAVA\t" + map.get("Java"));
			System.out.println("C\t" + map.get("C"));
			System.out.println("C#\t" + map.get("C#"));
			System.out.println("Python\t" + map.get("Python"));
			System.out.println("Languages\t" + map.get("Languges"));
			System.out.println("Scala\t" + map.get("Scala"));
			
			map.keySet(); //키만 잔뜩 모여있는 셋
			Set<String> keys = map.keySet();
			for (String key: keys) {
				System.out.println(key + " => " + map.get(key));
			}
			
			
			// !true == false
			// !false == true
			if ( !map.containsKey("Python") ) {
				map.put("Python", 100);
			}
			
			map.put("Python", 100);
			System.out.println("Python\t" + map.get("Python"));
			
			map.remove("C#");
			System.out.println("C#\t" + map.get("C#"));
			
			System.out.println(map.size());
		
			Map<Integer, List<String>> matrix = new HashMap<>();
		}
}
