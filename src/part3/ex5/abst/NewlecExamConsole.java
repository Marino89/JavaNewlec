package part3.ex5.abst;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	
	
	@Override
	public void input() {
		
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("��ǻ�� >");
		int com = scan.nextInt();
		
		NewlecExam exam = (NewlecExam) getExam();
		exam.setCom(com);
		
		
		
	}

}
