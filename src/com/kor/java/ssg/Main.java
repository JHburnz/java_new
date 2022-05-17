package com.kor.java.ssg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("== 프로그램 시작 ==");

		int lastArticleId = 0;

		while (true) {

			System.out.printf("명령어를 입력하세요 : ");
			String command = sc.nextLine();

			command = command.trim();

			if (command.length() == 0) {
				continue;
			}

			if (command.equals("system exit")) {
				break;
			} else if (command.equals("article list")) {
				System.out.println("게시물이 없습니다.");
			} else if (command.equals("article write")) {
				System.out.println("제목을 입력하세요 : ");
				String title = sc.nextLine();
				System.out.println("내용을 입력하세요 : ");
				String body = sc.nextLine();
				int id = lastArticleId + 1;

				lastArticleId = id;

				System.out.printf("%d번 글이 생성되었습니다.\n", lastArticleId);

			}

			else {
				System.out.printf("%s는 존재하지않는 명령어입니다.\n", command);
			}

		}

		sc.close();
		System.out.println("== 프로그램 끝 ==");

	}

}
