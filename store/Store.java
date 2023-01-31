package store;

/**
 * 편의점
 * @author 211-13
 *
 */

public class Store {
	
	/**
	 * 멤버변수 (인스턴스 필드) 선언
	 * 물, 과자, 음료
	 */
	
	Product water = new Product();
	Product snack = new Product();
	Product drink = new Product();
	
	/**
	 * 재고 확인
	 * 재고를 확인해서 개수를 출력한다
	 */
	public void checkQuantity() {
		
		//재고가 2개 이상일 경우: "물건 명" 제품은 재고가 8개 있습니다.
		//재고가 0개 인 경우: "물건 명" 제품은 품절 되었습니다.
		//재고가 1개 인 경우: "물건 명" 제품은 재고가 1개 있습니다. 재 주문이 필요합니다.
		
		//물건 명
		String productName = water.name;
		//재고
		int productQuantity = water.quantity;
		
		boolean outOfStock = productQuantity == 0;
		boolean needOrder = productQuantity == 1;
		
		// if ~ else if ~ else
		/*
		 *if (조건 혹은 boolean){
		 * 조건 혹은 boolean의 결과가 true 일 경우 실행할 코드
		 *}
		 *else if (조건 혹은 boolean) {
		 * 조건 혹은 boolean의 결과가 true 일 경우 실행할 코드
		 *}
		 *else {
		 * 모든 조건이 false 일 경우 실행할 코드
		 *}
		 */
		if (outOfStock) {
			// 재고가 0개 인 경우: "물건 명" 제품은 품절되었습니다.
			System.out.printf("%s 제품은 품절 되었습니다.", productName);
		}
		else if (needOrder) {
			// 재고가 0개 인 경우: "물건 명" 제품은 품절되었습니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다", productName, productQuantity);
		}
		else {
			//재고가 2개 이상일 경우: "물건 명" 제품은 재고가 8개 있습니다.
			System.out.printf("%s 제품은 재고가 %d개 있습니다.", productName, productQuantity);
		}
	}
}
