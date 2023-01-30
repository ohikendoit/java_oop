package address_book;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {

		private List<Address> addressList = new ArrayList<>();
		//Ctrl + Shift + O to import files
		//매우 많이 쓰이는 문법
		
		/*
		 * byte = Byte
		 * short = Short
		 * int = Integer
		 * long = Long
		 * float = Float
		 * double = Double
		 * boolean = Boolean
		 * char = Character
		 */
		private List<Integer> intList = new ArrayList<>();
		private List<Double> doubleList = new ArrayList<>();
		private double[] doubleArray = new double[50];
		
		public void create(String name, String phoneNumber, String address) {
			Address addr = new Address();
			addr.setName(name);
			addr.setPhoneNumber(phoneNumber);
			addr.setAddress(address);
			addressList.add(addr);
			
		}
		
		public void update(int index,
							String name,
							String phoneNumber,
							String address) {
			Address addr = addressList.get(index);
			addr.setName(name);
			addr.setPhoneNumber(phoneNumber);
			addr.setAddress(address);
		}
		
		public void delete(int index) {
			addressList.remove(index);
		}
		
		public void read(int index) {
			Address addr = addressList.get(index);
			System.out.println("이름: " + addr.getName());
			System.out.println("전화번호: " + addr.getPhoneNumber());
			System.out.println("주소: " + addr.getAddress());
		}
		
		public static void main(String[] args) {
			AddressListHandler handler = new AddressListHandler();
			
			//list추가
			Address addr = new Address();
			addr.setName("정윤성");
			handler.addressList.add(addr);
			
			Address addr2 = new Address();
			addr2.setName("이동학");
			handler.addressList.add(addr2);
			
			
			//list조회
			Address each = handler.addressList.get(0);
			System.out.println(each.getName());
			
			each = handler.addressList.get(1);
			System.out.println(each.getName());
			
			System.out.println(handler.addressList.size());
			//list삭제
			//handler.addressList.remove(0);
			//handler.addressList.remove(1);
			System.out.println(handler.addressList.size());
			
			//handler.addressList.clear();
			
			
			//list수정
			Address addr3 = handler.addressList.get(0);
			addr3.setName("유경진");
			
			System.out.println(handler.addressList.get(0).getName());
			
			
			//AddressListHandler handler = new AddressListHandler();
			//handler.create("조태용", "010-1234-1234", "서울");
			//handler.create("이동학", "010-5678-1234", "서울");
			//handler.create("이건회", "010-2345-1234", "서울");
		}
}
