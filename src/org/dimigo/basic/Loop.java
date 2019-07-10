package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int[] power = {100, 100, 100, 100};
        String[] name = {"마법사", "영주", "기사", "농민"};
        Scanner scanner = new Scanner(System.in);

        int choose = 0;
        int character = 0;

        do {

            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.print("메뉴 입력 => ");

            choose = scanner.nextInt();

            switch (choose) {

                case 1:
                    character = new Random().nextInt(4);
                    System.out.println(name[character]+"(으)로 설정되었습니다.");
                    break;

                case 2:
                    power[character] += 10;
                    System.out.printf("%s 공격력이 증가되었습니다. 현재 공격력 : %d\n", name[character], power[character]);
                    break;

                case 3:
                    power[character] -= 10;
                    System.out.printf("%s 공격력이 감소되었습니다. 현재 공격력 : %d\n", name[character], power[character]);
                    break;

                case 9:
                    System.out.println("이제 공부하세요!");
                    scanner.close();
                    break;

                default:
                    System.out.println("없는 메뉴입니다!");
                    break;
            }

        } while(choose != 9);
    }
}
