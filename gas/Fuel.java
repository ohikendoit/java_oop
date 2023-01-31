package gas;

//가장 작은단위인 연료부터 코드작성

/**
 * 연료
 * @author 211-13
 *
 */
public class Fuel {

	/**
	 * 연료 종류
	 * 휘발유, 경유, LPG
	 */
	private FuelType type;
	
	/**
	 * 연료 잔량
	 */
	private int stock;
	
	//기본형태의 생성자를 만들어줘야함
	
	//멤버변수 초기화
	public Fuel(FuelType type, int stock) {
		setType(type);
		setStock(stock);
	}
	

	public FuelType getType() {
		return type;
	}

	public void setType(FuelType type) {
		this.type = type;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
