package lesson2.homework;

import java.util.Scanner;

/*
 * Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 18));

        //method 2
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(checkSum(a,b));
        */

    }

    public static boolean checkSum(int a, int b) {
        return a + b > 10 && a + b <= 20;

    }

}
