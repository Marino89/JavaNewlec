package part3.ex2.oop.capsule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam exam = new Exam(1, 2, 3);
		
		while (true) {
			int menu = inputMenu();
			
			switch (menu) {
			case 1:
				exam.input();
				break;
			case 2:
				exam.print();
				break;
			case 3:
				exam.load();
				break;
			case 4:
				exam.save();
				break;
			case 5:
				exitProgram();
				break;
			}
		}

	}

	// Program占쏙옙 Bottom 占쏙옙占쏙옙
	private static void exitProgram() {
		System.out.println("Bye~~");
		System.exit(0);
	}







	private static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);

		int menu = 0;

		System.out.println("⎾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⏋");
		System.out.println("│            성적 메뉴                      │");
		System.out.println("⎿________________________________________⏌");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적불러오기");
		System.out.println("4. 성적저장");
		System.out.println("5. 프로그램 종료");
		System.out.print(">");
		menu = scan.nextInt();

		return menu;
	}

}
