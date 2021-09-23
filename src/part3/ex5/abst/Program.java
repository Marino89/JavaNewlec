package part3.ex5.abst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {


		NewlecExam exam = new NewlecExam();		
		NewlecExamConsole console = new NewlecExamConsole();
		console.setExam(exam);
		console.input();
		
		// 搬钦, 技泼(Setting) -> Injection(1. setter, 2.Construtor) : 何前搬
		// Dependency: 何前按
		
		
		
	}
}


