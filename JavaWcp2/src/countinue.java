
public class countinue {
	public static void main(String[] args) {
		for(int count = 1; count < 5; count++) {
			if(count == 2) {
				continue;
			}
			System.out.println("continue01 = " + count);
		}
	}
}

