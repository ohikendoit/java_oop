package drug_store;

public class DrugStore {
	
	Customer cold = new Customer();
	Customer runnyNose = new Customer();
	Customer musclePain = new Customer();
	
	/**
	 * 방문한다
	 */
	public void visit() {
		cold.name = "정윤성";
		cold.symptom = "감기";
		
		runnyNose.name = "홍길동";
		runnyNose.symptom = "콧물";
		
		musclePain.name = "철수";
		musclePain.symptom = "근육통";
		
	}
	
	/**
	 * 처방하다
	 */
	public void prescribe() {
		/*
		 * 감기환자에게는 "이름"님, 감기증상 있으셔서 종합감기약 처방해 드립니다.
		 * 콧물환자에게는 "이름"님, 콧물증상 있으셔서 코막힘약 처방해 드립니다.
		 * 근육통환자에게는 "이름"님, 근육통증상 있으셔서 근육이완제 처방해 드립니다.
		 */
		
		String name = "정윤성";
		// name == "장민창"
		if (cold.symptom.equals("감기")){
			System.out.printf("%s 감기증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		else if (cold.symptom.equals("콧물")) {
			System.out.printf("%s 콧물증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		else {
			System.out.printf("%s 근육통증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		
		String name = "홍길동";
		if (runnyNose.symptom.equals("감기")){
			System.out.printf("%s 감기증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		else if (runnyNose.symptom.equals("콧물")) {
			System.out.printf("%s 콧물증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		else {
			System.out.printf("%s 근육통증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		
		String name = "철수";
		if (musclePain.symptom.equals("감기")){
			System.out.printf("%s 감기증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		else if (musclePain.symptom.equals("콧물")) {
			System.out.printf("%s 콧물증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
		else {
			System.out.printf("%s 근육통증상 있으셔서 종합감기약 처방해 드립니다.", name);
		}
		
	};
	
	
}
