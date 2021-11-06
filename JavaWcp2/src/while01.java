
public class while01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 =" + number);
		}
	}
}

//do_whileの場合は、ループ開始時点で条件がfulseであっても一度は実行される
////public class do_while01{
//	public static void main(String[] args) {
//		int number = 1;
//		do {
//			number *= 2;
//			System.out.println("while01 =" + number);
//		}while (number < 50);
//	}
//}
