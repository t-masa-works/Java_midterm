package midterm;

import java.util.Scanner;

public class ProgramRun {

	public static void main(String[] args) {
		try (Scanner input_number = new Scanner(System.in)) {
			boolean loop = true;

			while (loop) {
				System.out.println("起動させたいプログラムを選択してください");
				System.out.println("0:終了する");
				System.out.println("1:FizzBuzzプログラム");
				System.out.println("2:電卓プログラム");
				System.out.println("3:ソートプログラム");
				int select_number = input_number.nextInt();

				switch (select_number) {
				case 0: {
					System.out.println("プログラムを終了します");
					loop = false;
					break;
				}
				case 1: {
					FizzBuzz.run(args);
					loop = false;
					break;
				}
				case 2: {
					Calculator.run(args);
					loop = false;
					break;
				}
				case 3: {
					Sort.run(args);
					loop = false;
					break;
				}
				default:
					System.out.println("提示された数字内で選択してください");
				}
			}
		}
	}
}
