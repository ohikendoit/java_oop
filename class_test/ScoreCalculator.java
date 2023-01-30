package class_test;

public class ScoreCalculator {
	
	//전역변수라 하는 멤버변수 (Instance)
	int subjectA = 100;
	int subjectB = 90;
	int subjectC = 80;
	int subjectD = 70;
	
	/**
	 * 4과목의 평균을 계산한다
	 */
	
	public void getAverage() {
		int sum = subjectA + subjectB + subjectC + subjectD;
		
		double avg = sum / 4.0;
		System.out.println("평균은? " + avg);
	}
	
	/**
	 * 성적 등급을 계산한다
	 */
	
	public void getGrade() {
		int sum = subjectA + subjectB + subjectC + subjectD;
		double avg = sum / 4.0;

		String grade ="";
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		
		System.out.println("등급은?" + grade);
		
	}
	
}
