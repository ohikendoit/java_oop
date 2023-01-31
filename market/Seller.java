package market;

/**
 * 판매자
 * @author 211-13
 *
 */
public class Seller {

	/**
	* 재고
	*/
	private int stock;
	
	/**
	 * 자본금
	 */
	private int money;

	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 판매
	 * (buyer에게 orderQty만큼을 판매한다.)
	 * @param buyer
	 * @param orderQty
	 */
	public void sell(Buyer buyer, int orderQty) {
		this.stock = this.stock - (orderQty * Market.PRICE_OF_APPLE);
	}
	
	public void addMoney(int money) {
		this.money = this.money + money;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "구매자: 재고: "+ this.stock + "개, 자본금: " + this.money + "원";
	}
}
