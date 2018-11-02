package practice10;

/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		final int distance = 300;

		Car car1 = new Car();
		car1.color = "blue";
		car1.gasoline = 60;
		String car_1 = "我が名は稲妻";

		int sum = 0;
		//int n = 0;

		for (int n = 0; n < 61; n++) {
			//while (n >= 51) {

			//n ++;

			int random = car1.run();

			if (random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			sum += random;

			System.out.println(sum);//ここでランダムの累積をいう

			if (sum >= distance) {



				//int sum = (n*number);
				int x = 60 - n;

				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです!車は" + car_1 +"です");
				break;
			}
		}

		Car car2 = new Car();
		car2.color = "blue";
		car2.gasoline = 70;
		String car_2 = "我が名はハヤブサ";

		int sum1 = 0;
		//int n = 0;

		for (int n = 0; n < 71; n++) {
			//while (n >= 51) {

			//n ++;

			int random = car2.run();

			if (random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			sum1 += random;

			System.out.println(sum1);//ここでランダムの累積をいう

			if (sum1 >= distance) {



				//int sum = (n*number);
				int x = 70 - n;

				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです" + car_2 +"です");
				break;
			}
		}

		Car car3 = new Car();
		car3.color = "blue";
		car3.gasoline = 80;
		String car_3 = "我が名は火炎";

		int sum2 = 0;
		//int n = 0;

		for (int n = 0; n < 81; n++) {
			//while (n >= 51) {

			//n ++;

			int random = car3.run();

			if (random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			sum2 += random;

			System.out.println(sum2);//ここでランダムの累積をいう

			if (sum2 >= distance) {

				//int sum = (n*number);
				int x = 80 - n;

				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです" + car_3 +"です");
				break;
			}
		}

	}
}