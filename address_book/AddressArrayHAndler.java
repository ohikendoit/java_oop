package address_book;

/**
 * 주소를 최대 5개만 저장할 수 있는 주소록
 */

public class AddressArrayHandler {

	//배열의 정의방법
	//타입[] 변수명 = new 타입 [몇개?];
	//int[] arrays = new int[5];
	private Address[] addressArray = new Address[5];
	
	public void create(int index, String name, String phoneNumber, String address) {
		addressArray[index] = new Address();
		addressArray[index].setName(name);
		addressArray[index].setPhoneNumber(phoneNumber);
		addressArray[index].setAddress(address);
	}
	
	public void update(int index, String name, String phoneNumber, String address) {
		addressArray[index].setName(name);
		addressArray[index].setPhoneNumber(phoneNumber);
		addressArray[index].setAddress(address);		
	}

	
	public void delete (int index) {
		addressArray[index] = null;
	}
	
	public void read (int index) {
		if(addressArray.length > index) {
			System.out.println("이름: " + addressArray[index].getName());
			System.out.println("전화번호: " + addressArray[index].getPhoneNumber());
			System.out.println("주소: " + addressArray[index].getAddress());
		}
	}

	public static void main (String[] args) {
		
		AddressArrayHandler handler = new AddressArrayHandler();
		handler.create(0,  "장", "010-1234-1234", "인천");
		handler.create(0,  "기", "010-2345-2345", "서울");
		handler.create(0,  "이", "없음", "서울");
		handler.create(0,  "박", "011-122-3456", "서울");
		handler.create(0,  "최", "010-9876-3456", "서울");
		
		handler.addressArray[0] = new Address();
		handler.addressArray[0].setName("정윤성");
		handler.addressArray[1] = new Address();
		handler.addressArray[2] = new Address();
		handler.addressArray[3] = new Address();
		handler.addressArray[4] = new Address();
		
		System.out.println(handler.addressArray[0].getName());
		System.out.println(handler.addressArray[1].getName());
		System.out.println(handler.addressArray[2].getName());
		System.out.println(handler.addressArray[3].getName());
		System.out.println(handler.addressArray[4].getName());
		
		System.out.println(handler.addressArray.length);
		
		handler.read(0);
		handler.read(1);
		handler.read(2);
		handler.read(3);
		handler.read(4);
	}
	
}
