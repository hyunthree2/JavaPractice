package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        long  salary = 1700000L;
        int worker = 3, branch = 1500;

        long ingeonbi = salary * 12 * worker * branch;

        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 :"+"%,d원",salary);
        System.out.printf("\n점포 내 직원 수 :"+"%d명", worker);
        System.out.printf("\n점포 수 :"+"%,d개\n", branch);

        System.out.printf("\n연간 인건비 :"+"%,d원", ingeonbi);
    }
}