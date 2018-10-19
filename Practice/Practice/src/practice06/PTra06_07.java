package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		int count = 0;
	    for (int i = 0; i < 5; i++) {
	        String test = "";
	        for (int j = 0; j < count; j++) {
	            test += "■";
	        }
	        for (int k = 5 - count; k > 0; k--) {
	            test += "□";
	        }
	        System.out.println(test);
	        count++;
	    }

	    count = 0; // 初期化
	    for (int i = 0; i < 5; i++) {
	        String test = "";
	        for (int k = 5 - count; k > 0; k--) {
	            test += "■";
	        }
	        for (int j = 0; j < count; j++) {
	            test += "□";
	        }
	        System.out.println(test);
	        count++;
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
 * ■■■■■
 * ■■■■□
 * ■■■□□
 * ■■□□□
 * ■□□□□
 */


//
//int count = 0;
//for (int x = 0; x < 10; x++) {
//    for (int y = 0; y < 5; y++) {
//        if (x - y <= 0) {
//            System.out.print("□");
//        }
//        else if (x < 5) {
//            System.out.print("■");
//        }
//        else if (x + y < 10) {
//            System.out.print("■");
//        }
//        else {
//            System.out.print("□");
//        }
//    }
//    System.out.println();
//}