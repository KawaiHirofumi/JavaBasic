package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("■");
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("□");
			}
			System.out.println("");
		}
	}
}

// ★ for文を使って、以下のような出力になるようにしてください
/*
 * 出力結果例
 * -----------------------------------
 * □□□□□
 * ■□□□□
 * ■■□□□
 * ■■■□□
 * ■■■■□
 */
//---------------------------------------

//		for (int i = 0; i <= 5; i++) {
//
//			//行
//
//			for (int j = 0; j <= 5; j++) {
//
//				//列
//
//				if () {
//					System.out.print("■");
//			}if else(){
//					System.out.println("□");
//				}else{
//			System.out.println();
//		}
//
//	}
//}

//for(i=1;i<10;i++){
//		for(j=1;j<=i;j++){
//			//■を出力
//			}
//			for(j=1;j<10-i;j++){
//			//□を出力
//			}
//			//改行を出力
//			}
