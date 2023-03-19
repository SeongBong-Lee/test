package condition;

import java.util.Scanner;

public class If_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = sc.nextInt();
		
		if(num < 90) {
			System.out.println("분발하세요.");
		}
		else {
			System.out.println("우등생 입니다.");
		}
	}
}
