package gas;

import java.util.HashMap;
import java.util.Map;

public class Street {
		
		public static final Map<FuelType, Double> PRICES;
		
		static { //값의 할당이나 초기화는 여기서한다
			PRICES = new HashMap<>();
			PRICES.put(FuelType.GASOLIN, 1569.67);
			PRICES.put(FuelType.DIESEL, 1651.15);
			PRICES.put(FuelType.LPG, 1039.35);
		}
		
		public static void name(String[] args) {
			
			GasStation gasStation = new GasStation();
			
			Customer customer = new Customer();
			customer.setFuel(new Fuel(FuelType.DIESEL, 50));
			customer.setMoney(1000000);
			
			customer.buy(gasStation, FuelType.DIESEL, 500000000);
		}
}

//누가 뭘 주유를 했고, 주유소는 얼마나 남았나 출력하기
//구매자의 연료와 잔량
