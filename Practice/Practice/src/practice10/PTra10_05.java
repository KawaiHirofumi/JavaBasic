package practice10;
/*
 * PTra10_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_05 {

	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	public static void main(String[] args) {

		// Carクラスを作成後に着手してください
		// ★ Car型の変数carを宣言し、Carクラスのインスタンスを代入してください
		Car car = new Car();

		// ★ 変数carに格納されているインスタンスのserialNoフィールドに、10000を代入してください
		car.serialNo = 1000;

		// ★ 変数carに格納されているインスタンスのcolorフィールドに、"Red"を代入してください
		car.color = "red";

		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		car.gasoline = 50;

		// 目的地までの距離
		
		final int distance = 300;


		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 */


		int sum = 0;//（進んだ距離）

		for(int n = 0; n < 51; n ++) {//ここでループを終わらす定義

			
			
			//while (n >= 51) {
			//n ++;

			int random = car.run();//ここでランダムを定義

			if(random == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			sum += random;//ここでランダムの値を定義
			
			System.out.println(sum);//ここでランダムの累積をいう

			if(sum >= distance) {//ここに目的地

				//int sum = (n*number);
				int x = 50 - n;//今あるガソリンー進んだ数

				System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + x + "リットルです");
				break;
			}
		}
	}
}



//
//
//		int runresult = 0; //runした回数(進んだ回数)
//		int runcount = 0 ; //走行距離(時間)
//
//		while(true) {
//			int move = car.run();
//			//１ずつガソリンは消費して１～１５進む
//			runresult += move; //ガソリン消費量も１づつ加算
//			runcount++ ; 	//↑に加えmoveするごとに走行距離を加算
//			System.out.println(runresult);
//
//			if (move == -1) {  //ガス欠の場合に対する処理
//				System.out.println("目的地に到達できませんでした");
//				break;           //ガス欠なので動けない＝これ以上処理はできない
//			}else if (runresult >= distance) { //runresultがdistanceについたら処理はおわり
//				System.out.println("目的地にまで" + runcount +"時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
//				break;			//目的地についたのでこれで処理はおわり
//			}
//		}
//	}
//}