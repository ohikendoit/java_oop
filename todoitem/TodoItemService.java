package todoitem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoItemService {

	/**
	 * todo 아이템 목록
	 */
	
	//변수
	private List<TodoItemVO> todoItemList;
	
	
	//생성자
	public TodoItemService() {
		todoItemList = new ArrayList<>();
	}
	
	
	//Getter Setter
	public List<TodoItemVO> getTodoItemList() {
		return todoItemList;
	}

	public void setTodoItemList(List<TodoItemVO> todoItemList) {
		this.todoItemList = todoItemList;
	}
	
	
	/**
	 * todo 아이템 등록
	 */
	public void create(String itemName) {
		todoItemList.add(new TodoItemVO(itemName));
	}
	
	/**
	 * todo 아이템 수정
	 * @param index 수정할 List Index
	 * @param isSuccess 완료 여부
	 */
	public void update(int index, boolean isSuccess) {
		TodoItemVO todoItem = todoItemList.get(index);
		todoItem.setSuccess(isSuccess);
	}
	
	
	/**
	 * todo 아이템 삭제
	 */
	public void delete(int index) {
		todoItemList.remove(index);
	}
	
	
	/**
	 * todo 모든 아이템을 조회한다
	 */
	public void read() {
		for (TodoItemVO todoItem: todoItemList) {
			String successSymbol = " ";
			if (todoItem.isSuccess()) {
				successSymbol = "X";
			}
			//삼항연산자
			//String successSymbol = todoItem.isSuccess() ? "X": " ";
			System.out.println("["+ successSymbol + "] " + todoItem.getItemName());
		}
		System.out.println("총 " + todoItemList.size() + "개의 아이템이 조회되었습니다.");
	}
	
	
	/**
	 * main
	 */
	public static void main(String[] args) {
		TodoItemService todoitemService = new TodoItemService();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("TODO LIST");
		
		while (true) {
			System.out.println("================");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			System.out.println("================");
			System.out.println("메뉴를 입력하세요:");
			
			int menu = scan.nextInt();
			scan.nextLine();
			
			if (menu == 1) {
				//등록
				System.out.println("TODO 명을 입력하세요:");
				String itemName = scan.nextLine();
				service.create(itemName);
				System.out.println("아이템이 등록되었습니다.");
			}
			
			else if (menu == 2) {
				//수정
				System.out.println("수정할 아이템 번호를 입력하세요:");
				int itemIndex = scan.nextInt();
				scan.nextLine(); //엔터를 무시하는 코드
				
				int listLength = service.getTodoItemList().size;
				if (listlength <= itemIndex) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					System.out.println("아이템이 완료되었다면 \"Y\"를 입력하세요:");
					String yn = scan.nextLine();
					boolean isY = yn.equalsIgnoreCase("Y");
					service.update(itemIndex, isY);
					//service.update(itemIndex, yn.equalsIgnoreCase("Y")));
					//service.update(itemIndex, yn.toUpperCase().equals("Y")));
					//service.update(itemIndex, yn.toLowerCase().equals("y"))
					TodoItemVO todoItem = service.getTodoItemLst().get(itemIndex);
					
					if (isY) {
						System.out.println("[" + todoItem.getItemName() + "] 이 완료되었습니다.");
					}
					else {
						System.out.println("[" + todoItem.getItemName() + "] 이 미완료되었습니다.");
					}
				}
			}
			
			else if (menu == 3) {
				//삭제
				System.out.println("삭제할 아이템 번호를 입력하세요:");
				int itemIndex = scan.nextInt();
				scan.nextLine(); // 엔터를 무시하는 코드
				int listLength = service.getTodoItemList().size();
				if (listLength <= itemIndex) {
					System.out.println("아이템이 존재하지 않습니다.");
				}
				else {
					service.delete(itemIndex);
					System.out.println("아이템이 삭제되었습니다.");
				}
			}
			else if (menu == 4) {
				//조회
				service.read();
			}
			else {
				//종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
		}
	}

}
