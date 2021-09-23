package part3.ex3.has;

import java.util.Scanner;

public class ExamConsole {
	
	// Exam 객체 exam을 has a 상속해주세요.
	private Exam exam;
	
	public ExamConsole() {
		// 1. Composition Has A 상
		// this.exam = new Exam();
	}	
				
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}

	// 1. Association Has A 상속
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void print() {

		Scanner scan = new Scanner(System.in);

		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��              ���� ���              ��");
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("���� : " + exam.getKor());
		System.out.println("���� : " + exam.getEng());
		System.out.println("���� : " + exam.getMath());

		int total = this.exam.total();
		double avg = this.exam.avg();
		System.out.println("���� :" + total);
		System.out.printf("��� : %.2f\n", avg);
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��              ���� �Է�              ��");
		System.out.println("��������������������������������������������������������������������������");

		System.out.println("���� >");
		int kor = scan.nextInt();
		System.out.println("���� >");
		int eng = scan.nextInt();
		System.out.println("���� >");
		int math = scan.nextInt();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

	}
}
