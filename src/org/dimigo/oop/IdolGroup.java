package org.dimigo.oop;

public class IdolGroup {
    public static void main(String[] args) {
        String [] groupname = {"방탄", "2NE1", "걸스데이"};
//        String [][] memberName = new String[2][];
//        memberName[0] = new String[5];
//        memberName[0] = new String[4];
//        memberName[0] = new String[4];

        String[][] memberName = {
                {"정국", "지민", "뷔", "슈가", "진"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };

//        int n = 0;
//        for(String[] arr : memberName) {
//            System.out.println("<<"+groupname[n]+">>");
//            for(String value : arr) {
//                System.out.print(value + "\n");
//            }
//            n++;
//            System.out.println();
//        }

        for (int i = 0; i < groupname.length; i++)
        {
            System.out.println("<<"+groupname[i]+">>");
            for (int j = 0; j < memberName[i].length; j++)
            {
                System.out.println(memberName[i][j]);
            }
            System.out.println();
        }

    }
}
