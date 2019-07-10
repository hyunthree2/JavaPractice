package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        String [] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
        String [] answers = {"아이유", "원빈", "자료구조"};
        Scanner scanner = new Scanner(System.in);

        int choose = 0;
        int questionsNum = 0;

        do {
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.print("메뉴 선택 => ");

            choose = scanner.nextInt();

            switch(choose) {
                case 1:
                    questionsNum = new Random().nextInt(3);
                    System.out.print(questions[questionsNum]+" ");
                    String answer = scanner.next();
                    if(answers[questionsNum].equals(answer)) System.out.println("정답입니다!");
                    else System.out.println("틀렸습니다!");
                    break;

                case 2:
                    StringBuilder sb = new StringBuilder();
                    System.out.println("<< 정답 출력 >>");
                    for (int i=0; i<3; i++)
                    {
                        sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
                    }
                    System.out.print(sb);
                    break;

                case 9:
                    System.out.println("Bye~");
                    break;

                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }

        } while (choose != 9);
    }
}
