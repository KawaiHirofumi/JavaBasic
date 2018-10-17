package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_09 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		//入力型の指定

		int num = scanner.nextInt();

		//任意の値

		int sunday = 0;
		int monday = 1;
		int thesday = 2;
		int wednesday = 3;
		int thursday = 4;
		int friday = 5;
		int saturday = 6;

		if (num == sunday) {
			System.out.println("日曜日");
		} else if (num == monday) {
			System.out.println("月曜日");
		} else if (num == thesday) {
			System.out.println("火曜日");
		} else if (num == wednesday) {
			System.out.println("水曜日");
		} else if (num == thursday) {
			System.out.println("木曜日");
		} else if (num == friday) {
			System.out.println("金曜日");
		} else if (num == saturday) {
			System.out.println("土曜日");
		} else {
			System.out.println("6の整数を入力してください");
		}

		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */
	}
}
