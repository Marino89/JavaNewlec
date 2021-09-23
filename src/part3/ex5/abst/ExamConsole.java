package part3.ex5.abst;

import java.util.Scanner;

public class ExamConsole {
	
	// Exam 객체 exam을 has a 상속해주세요.
	private Exam exam;
	
	public ExamConsole() {
		// 1. Composition Has A 관계
		this.exam = new Exam();
	}	
				
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}

	public Exam getExam() {
		return exam;
	}
	// 1. Association Has A 관게
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void print() {

		Scanner scan = new Scanner(System.in);

		System.out.println("占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙");
		System.out.println("占쏙옙              占쏙옙占쏙옙 占쏙옙占�              占쏙옙");
		System.out.println("占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙");
		System.out.println("占쏙옙占쏙옙 : " + exam.getKor());
		System.out.println("占쏙옙占쏙옙 : " + exam.getEng());
		System.out.println("占쏙옙占쏙옙 : " + exam.getMath());

		onPrint();
		
		int total = this.exam.total();
		double avg = this.exam.avg();
		System.out.println("占쏙옙占쏙옙 :" + total);
		System.out.printf("占쏙옙占� : %.2f\n", avg);
	}



	private void onPrint() {
		// TODO Auto-generated method stub
		
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙");
		System.out.println("占쏙옙              占쏙옙占쏙옙 占쌉뤄옙              占쏙옙");
		System.out.println("占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙");

		System.out.print("국어 >");
		int kor = scan.nextInt();
		System.out.print(" >");
		int eng = scan.nextInt();
		System.out.print("���� >");
		int math = scan.nextInt();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

	}
}
