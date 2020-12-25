package exception;

public class exception01 {
	public static void main(String[] args) {
//		System.out.println("100 ÷ 0は？");
//		int result = 100/ 0;
//		System.out.println("計算結果" + result);
//		System.out.println("プログラム終了");
//	
	
	try {
		System.out.println("100 ÷ 0 は？");
		int results = 100 / 0;
		System.out.println("計算結果" + results);
	} catch (ArithmeticException e) {
		System.out.println("例外が発生");
	} finally {
		System.out.println("プログラム終了");
	}
	}
}
