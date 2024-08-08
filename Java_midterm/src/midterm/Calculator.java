package midterm;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//		【問2】電卓プログラム
		//		以下の条件を満たすプログラムを作成してください。
		//		処理はユーザーの「続行 / 終了」を聞いて、「終了」を選択された時にプログラムを終了する
		//		必ず一回は計算される
		//		１つ目の数字を入力させる
		//		四則演算を入力させる
		//		２つ目の数字を入力させる
		//		計算結果を表示する
		try (Scanner input = new Scanner(System.in)) {
			boolean loop = true;
			while (loop) {
				System.out.println("電卓プログラムを起動します。");
				System.out.println("計算したい１つ目の数字を入力してください。");
				int number_a = input.nextInt();
				System.out.println("起動する四則演算を選択してください。");
				System.out.println("1:足し算　2:引き算 3:掛け算　4:割り算");
				int choice = input.nextInt();
				System.out.println("計算したい２つ目の数字を入力してください。");
				int number_b = input.nextInt();

				switch (choice) {
				case 1: {
					Sum(number_a, number_b);
					break;
				}
				case 2: {
					Sub(number_a, number_b);
					break;
				}
				case 3: {
					Mul(number_a, number_b);
					break;
				}
				case 4: {
					Div(number_a, number_b);
					break;
				}
				default:
					System.out.println("提示された数字内から選択してください");
				}

				while (true) {
					System.out.println("電卓プログラムを続けますか？");
					System.out.println("1:続行　2:終了");
					choice = input.nextInt();
					if (choice == 1) {
						loop = true;
						break;
					} else if (choice == 2) {
						loop = false;
						System.out.println("プログラムを終了します。");
						break;
					} else {
						System.out.println("1か2を選択してください");
					}
				}
			}
		}
	}

	public static void Sum(int a, int b) {
		int sum = a + b;
		System.out.println("足し算を行います。");
		System.out.println("結果は、" + sum + "です。");
	}

	public static void Sub(int a, int b) {
		int sub = a - b;
		System.out.println("引き算を行います。");
		System.out.println("結果は、" + sub + "です。");
	}

	public static void Mul(int a, int b) {
		int mul = a * b;
		System.out.println("掛け算を行います。");
		System.out.println("結果は、" + mul + "です。");
	}

	public static void Div(int a, int b) {
		int div = a / b;
		System.out.println("割り算を行います。");
		System.out.println("結果は、" + div + "です。");
	}

}
