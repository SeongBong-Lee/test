package condition;

import java.util.Scanner;

public class If_else_3 {
	public static void main(String[] args) {		
		
		// Q. 1
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int num = sc.nextInt();		
		
		if(num >= 20) {
			System.out.println("성인 입니다.");
		}else if(num >= 14 && num < 20) {
			System.out.println("청소년 입니다.");
		}else {
			System.out.println("어린이 입니다.");
		}
		
		
		// Q. 2
		System.out.println("점수를 입력하세요");
		num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("학점은 A 입니다.");
		}else if(num >= 80 && num < 90) {
			System.out.println("학점은 B 입니다.");
		}else if(num >= 70 && num < 80) {
			System.out.println("학점은 C 입니다.");
		}else {
			System.out.println("학점은 F 입니다.");
		}
		
		
		// Q. 3
		System.out.println("비밀번호를 입력하세요");
		num = sc.nextInt();
		
		int password = 123;
		
		if(num == password) {
			System.out.println("비밀번호가 맞습니다.");
		}
		else {
			System.out.println("비밀번호가 틀립니다.");
		}
		
		// Q. 4
		System.out.println("연도를 입력하세요");
		num = sc.nextInt();
		
		if(num%4 == 0 && num%100 !=0) {			
			System.out.println("윤년입니다.");
		}else {
			if(num%400 == 0) {
				System.out.println("윤년입니다.");
			}
			else {
				System.out.println("윤년이 아닙니다.");
			}
		}
		
	}
	
}
