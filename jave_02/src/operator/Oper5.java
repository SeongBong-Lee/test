package operator;

public class Oper5 {
	public static void main(String[] args) {
		// 누적 연산자
		int num = 3;
		
		num += 2;
		System.out.println(num);
		
		// 증감 연산자
		
		System.out.println(++num);
		// ++이 앞에 있으면 먼저 증감 연산자 계산 후에 그 줄의 코드 실행
		// ++이 뒤에 있으면 그 줄의 코드 실행 후에 증감 연산자 수행
		
	}
}
