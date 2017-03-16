/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop.java
 * 
 * 1. 개요 : 초간단 게임프로그램
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : cdb12
 * @version : 1.0
 */
public class Loop {

	
	public static void main(String[] args) {
		int choice;
		int initial = 100;
		int num;
		String[] inmul = {"마법사", "영주", "기사", "농민"};
		
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("---------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 케릭터 설정");
			System.out.println("9. 종료");
			System.out.println("---------------");
			System.out.println("메뉴 입력=> ");
			choice = scanner.nextInt();

			switch(choice) {
			case 1:
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : ");
				System.out.println(initial += 10);
				break;
			case 2:
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : ");
				System.out.println(initial -= 10);
				break;
			case 3:
				num= new Random().nextInt(4);//0~3까지 랜덤
				System.out.println(inmul[num] + "(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
				break;
			}
		}while(choice != 9);

	}

}
