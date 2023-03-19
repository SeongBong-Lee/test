package operator;

public class Review {
	public static void main(String[] args) {
		// 변수 : 
		// 자주 변경될 수 있는 부분은 저장해놓고 돌려쓰기
		String a = "글자를 저장";
		int num = 0;
				
		// 츨력 예시
		//System.out.println(num);
		//System.out.println("나는" + a + num);
		
		// 산술 연산자
		String add_char ="글자" + "붙이기";
		int add_num = 3 + 4;
		int add_minus = 3 - 4;
		
		int add_val = add_num + add_minus;
		
		System.out.println(add_char);
		System.out.println(add_val);
		
		
		// 비교 연산자
		System.out.println(3 > 4);
		
		// 대입 연산자
		num = 2;
		
		System.out.println(num);
		System.out.println("\n");
		System.out.println(num);
	}
	
}
