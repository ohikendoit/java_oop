package todoitem;

public class TodoItemVO {
	
	//상수
	

	//변수
	/**
	 * 아이템
	 */
	private String itemName;
	private boolean isSuccess; //자동으로 false값
	
	
	//생성자 -> 기본생성자 / 컴파일할떄 자동생성
	public TodoItemVO(String itemName) {
		setItemName(itemName);
	}
	
	
	//Getter Setter
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	//Method
	
	
}
