package practice10;

public class Car {

	int serialNo ;
	String color;
	int gasoline;

	int run() {
		gasoline--;

		if(gasoline < 0) {
			return -1;
			
		} else {
			int number = new java.util.Random().nextInt(15) + 1;
			return number;
			
		}
	}

}
	
//	
//	int run() {			//ガソリンを1消費、ガス欠になったら-1を返す処理
//		this.gasoline--;
//		if (this.gasoline < 0) { //ガス欠になったら、↓
//			return -1;			//-1を返す
//		}
//
//		new Random().nextInt(15);
//		int r = new Random().nextInt(15); //1から１５までランダムでクルマを走らせる
//		r += 1;	 //←いれないと↑が０～１４に処理してしまう（0から数えるため）ので１を足す
//		return r;   //これで１～１５のランダムの距離を走らせるやつ。
//	}
//}

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