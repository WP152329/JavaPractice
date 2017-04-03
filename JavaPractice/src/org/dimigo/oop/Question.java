/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : cdb23
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] questions = { "가수", "배우", "과목" };
		String[] answers = { "인피니트", "류준열", "수학" };

		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + ".가장 좋아하는 " + questions[i] + "는?");
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if (answer.equals(answers[i])) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
			}

		}

		for (int i = 0; i < 3; i++) {
			StringBuilder a = new StringBuilder("가장 좋아하는 ");
			a.append(questions[i]).append("는? ").append(answers[i]).append("입니다.");
			
			System.out.println(a);
			
		}

	}

}
