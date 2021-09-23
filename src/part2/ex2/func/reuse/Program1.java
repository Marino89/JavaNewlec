package part2.ex2.func.reuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	

	
	// �⺻(���� ������) �Լ�
	static void printCount(){
		
		// ����..�ݺ�		
		
		printCount();
	}
	
	// �����ε�(����� ���� �� ����) �Լ�
	static void printCount(int count){
		
		System.out.println("����������������������������");
		System.out.println("��                Count              ��");
		System.out.println("����������������������������");
		System.out.printf("Count is %d\n", count);
		
	}

	public static void main(String[] args) throws IOException {
		// --- << main menu �Է� >> -------------------
				
		김지원: while (true) {
			//int menu = inputMenu();

			switch (inputMenu()) {
			case 1: {
				// --- <<count ����ϱ� >> -----------------------------------------------
				int count = KorExam.count();
				
				printCount(count); // �Ű����� ������(overload) �� �Լ�
				//printCount(); // �⺻���� �̿��ؼ� �˾Ƽ� �����~
				

			}
				break;

			case 2: {
				// --- <<total ����ϱ� >> -----------------------------------------------
				int total = KorExam.total();
				printTotal(total);


			}
				break;

			case 3: {
				// --- <<avg ����ϱ� >> -----------------------------------------------
				int count = KorExam.count();
				// --------------------------------------
				int total = KorExam.total();
				// -----------------------------------------------
				double avg = total / (double) count;

				printAvg(avg);

			}
				break;

			case 4:
				System.out.println("Bye~~");
				break 김지원; // while ���� ��� �� �ֳ�? �̰� ����?

//					default:
//						System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");
			}

		}

		System.out.println("�۾��Ϸ�");
	}

	static int inputMenu() {
		
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("����������������������������");
			System.out.println("��             Main Menu          ��");
			System.out.println("����������������������������");
			System.out.println("1. count");
			System.out.println("2. total");
			System.out.println("3. avg");
			System.out.println("4. exit");
			System.out.print(">");

			menu = scan.nextInt();

			if (menu > 4)
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");

		} while (menu > 4);
		
		return menu;
	}

	static void printAvg(double avg) {
		System.out.println("����������������������������");
		System.out.println("��              Average             ��");
		System.out.println("����������������������������");
		System.out.printf("Average is %.2f\n", avg);
	}

	static void printTotal(int total) {
		System.out.println("��������������������������");
		System.out.println("��               Total             ��");
		System.out.println("��������������������������");
		System.out.printf("Total is %d\n", total);	
	}


}
