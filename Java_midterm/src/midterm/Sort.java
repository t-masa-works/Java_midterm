package midterm;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		//		【問3】ソートプログラム
		//		以下の条件を満たすプログラムを作成してください。
		//		配列のサイズを入力させる（1次元配列）
		//		配列のサイズ分だけ繰り返し、ユーザーに数字を入力させる
		//		「降順（大きい順）」か「昇順（小さい順）」を選択させる
		//		「昇順」「降順」コードをメソッドで実装する
		//		メソッドからは返り値を取得し、Mainメソッドでその結果を表示する
		//		Javaの既存メソッド（Arrays.sortやCollections.sort）の使用禁止
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("配列のサイズを入力してください");
			int size = input.nextInt();
			int[] numbers = new int[size];

			for (int i = 0; i < numbers.length; i++) {
				System.out.println("配列に格納する" + i + "番目の数字を入力してください");
				int number = input.nextInt();
				numbers[i] = number;
			}

			System.out.print("入力した配列内の数字:");
			for (int i = 0; i < numbers.length; i++) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(numbers[i]);
			}
			System.out.println("");

			System.out.println("降順か、昇順に並び替えます。選択してください");
			while (true) {
				System.out.println("1:降順　2:昇順");
				int choice = input.nextInt();
				if (choice == 1) {
					System.out.println("降順で並び替えます。");
					SortDown(numbers);
					break;
				} else if (choice == 2) {
					System.out.println("昇順で並び替えます。");
					SortUp(numbers);
					break;
				} else {
					System.out.println("1か2を選択してください");
				}
			}
		}
	}

	public static void SortDown(int numbers[]) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int n = 0; n < numbers.length - 1; n++) {
				if (numbers[n] < numbers[n + 1]) {
					int tmp = numbers[n];
					numbers[n] = numbers[n + 1];
					numbers[n + 1] = tmp;
				}
			}
		}
		System.out.print("配列内の数字:");
		for (int i = 0; i < numbers.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(numbers[i]);
		}
	}

	public static void SortUp(int numbers[]) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int n = 0; n < numbers.length - 1; n++) {
				if (numbers[n] > numbers[n + 1]) {
					int tmp = numbers[n];
					numbers[n] = numbers[n + 1];
					numbers[n + 1] = tmp;

				}
			}
		}
		System.out.print("配列内の数字:");
		for (int i = 0; i < numbers.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(numbers[i]);
		}
	}
}
