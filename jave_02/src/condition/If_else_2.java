package condition;

public class If_else_2 {
	public static void main(String[] args) {
		int num = 99;
		
		
		// 2. if-else문 사용하기
		if(num < 10) {			
			System.out.println("10 보다 작다");
		}else if(num < 100) {
			System.out.println("100 보다 작다");
		}else if(num < 1000) {
			System.out.println("1000 보다 작다");
		}else {
			System.out.println("그 밖의 숫자이다");
		}
		
	}
}
