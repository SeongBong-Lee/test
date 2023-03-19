package condition;

import java.util.Scanner;

public class If_2 {
	public static void main(String[] args) {
		int num = 0;
		
		// 사용자에게 입력 받을 문자
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		System.out.println(num);
		
		if(num < 10) {
			System.out.println("입력하신 숫자는 10보다 작습니다.");
		}
		else {
			System.out.println("입력하신 숫자는 10보다 큽니다.");
		}
		
	}
}
