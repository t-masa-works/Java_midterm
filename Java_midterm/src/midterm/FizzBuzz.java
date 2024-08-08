package midterm;

public class FizzBuzz {

	public static void run(String[] args) {
		//		【問1】FizzBuzzプログラム
		//		以下の条件を満たすプログラムを作成してください。
		//		1から100まで繰り返す
		//		3で割り切れる場合は"Fizz"と表示
		//		5で割り切れる場合は"Buzz"と表示
		//		3と5で割り切れる場合は"FizzBuzz"と表示
		//		そのほかの場合は、数字を表示
		//		ループ処理を使用する
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
