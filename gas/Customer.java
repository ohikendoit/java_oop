package gas;

public class Customer {

	private Fuel fuel;
	private int money;
	
	/**
	 * 연료
	 * @return
	 */
	public Fuel getFuel() {
		return fuel;
	}
	/**
	 * 자본금
	 * @param fuel
	 */
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	/**
	 * 주요소에서 연료를 구입한다
	 * @param gasStation 주유소
	 * @param type 연료 종류 (gasolie, diesel, lpg)
	 * @param stock 구매량
	 */
	public void buy(GasStation gasStation, FuelType type, int stock) {
		// 1. Type연료를 stock만큼 구매할 돈이 있는지 확인한다.
		if (checkMoney(type, stock)) {
			boolean sellResult = gasStation.sell(type, stock);
			// 1-3. 돈은 있는데 주유소에서 판매할 수 없다고 하면 "연료를 구매할 수 없습니다."를 출력하고 메소드를 끝낸다.
			if(sellResult) {
				// 1-1. 돈이 있다면 연료의 잔량을 stock 만큼 증가시킨다.
				int fuelStock = fuel.getStock();
				fuelStock += stock;
				fuel.setStock(fuelStock);
				
				int money = (int) (Street.PRICES.get(type) * stock);
				this.pay(gasStation,  stock);
			}
			else {
				System.out.println("연료를 구매할 수 없습니다.");
			}
		}
		// 1-2. 돈이 없다면 "연료를 구매할 수 없습니다."를 출력하고 메소드를 끝낸다.
		else{
			System.out.println("연료를 구매할 수 없습니다.");
		}
	}
	/**
	 * 지출
	 * @param money 구매가격
	 */
	private void pay(GasStation gasStation, int money) {
		//주유소에게 돈을 지급한다
		gasStation.addMoney(money);
		this.money -= money;
	}
	
	/**
	 * 주유하기에 충분한 돈을 가지고 있는지 확인한다.
	 * @param type 주요할 연료종류 (gasolin, diesel, lpg)
	 * @param stock 주유량
	 * @return 주유가 가능한 돈을 가지고 있다면 true, 아니면 false
	 */
	private boolean checkMoney(FuelType type, int stock) {
		return Street.PRICES.get(type) * stock <= money;
	}
	
}
