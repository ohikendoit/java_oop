package store;

/**
 * 실행 클래스
 * @author 211-13
 *
 */

public class Main {
	
	Store store = new Store();
	
	public static void main(String[] args) {
		
		Main main = new Main();
		//main.store.addProducts();
		main.store.checkQuantity();
		
		// 편의점 변수 (인스턴스 | 객체)
		Store store = new Store();
		store.drink.name = "콜라";
		store.drink.quantity = 10;
		
		store.snack.name = "홈런볼";
		store.snack.quantity = 0;
		
		store.water.name = "삼다수";
		store.water.quantity = 1;
		
		store.checkQuantity();
		
	}
	
}
