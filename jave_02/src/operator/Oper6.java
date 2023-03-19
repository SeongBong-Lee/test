package operator;

public class Oper6 {
	public static void main(String[] args) {
		// 관계 연산자
		// &&, ||, !
		// true 또는 false에 영향을 줌
		
		float a = 0.1f;
		float b = 0.1f;
		
		System.out.println(2>1 && a==0.1f);
		int tall = 120;
		int age = 14;
		boolean t_f = tall > 130 || age >= 13;
		
		System.out.println(t_f);
		
		System.out.println(!t_f);
		
	}
}
