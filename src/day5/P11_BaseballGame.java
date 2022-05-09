package day5;

import java.util.Scanner;

public class P11_BaseballGame {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 작성하세요.
		 * 중복되지 않은 1~9사이의 세 정수를 입력받아 맞추는 게임
		 * 입력 : 1 2 3
		 * 1B
		 * 입력 : 4 5 6
		 * O
		 * 입력 : 7 8 9
		 * 2S
		 * 입력 : 8 3 9
		 * 1S2B
		 * 입력 : 3 8 9
		 * 3S
		 * 프로그램 종료
		 * 
		 * 반복횟수 : s가 3보다 작을때까지 반복
		 * 규칙성 : 	정수 3개를 입력 받음
		 * 			s와 b를 각각 0으로 초기화
		 * 			com1과 user1이 같으면 s를 1증가
		 * 			com2와 user2가 같으면 s를 1증가
		 * 			com3과 user3이 같으면 s를 1증가
		 * 			com1과 user2가 같거나 com1과 user3이 같으면 b를 1증가
		 * 			com2와 user1이 같거나 com2와 user3이 같으면 b를 1증가
		 * 			com3과 user1이 같거나 com3과 user2가 같으면 b를 1증가
		 * 			s가 0이 아니면 s의 개수와 S를 출력
		 * 			b가 0이 아니면 b의 개수와 B를 출력
		 * 			s가 0이고 b가 0이면 O를 출력
		 * 			엔터
		 * */
		Scanner scan = new Scanner(System.in);
		int com1 = 3, com2 = 8, com3 = 9;
		int user1, user2, user3;
		int s = 0;
		int b = 0;
		while(s < 3) {
			System.out.println("1~9사이의 정수 세개를 입력하세요 : ");
			user1 = scan.nextInt();
			user2 = scan.nextInt();
			user3 = scan.nextInt();
			
			if(com1 == user1) {
				s++;
			}if(com2 == user2) {
				s++;
			}if(com3 == user3) {
				s++;
			}if(com1 == user2) {
				b++;
			}if(com2 == user1) {
				b++;
			}if(com3 == user1 || com3 == user2) {
				b++;
			}if(s != 0) {
				System.out.print(s + "S");
			}if(b != 0) {
				System.out.print(b + "B");
			}if(s == 0 && b == 0) {
				System.out.print("O");
			}
			System.out.println();
		}
		

	}

}
