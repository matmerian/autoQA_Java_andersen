package lesson2.homework;

/*
 * Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.
 */

public class Task2 {
    public static void main(String[] args) {
        checkNumber(-25);

        //method 2
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive or negative number: ");
        int a = scanner.nextInt();
        checkNumber(a);
        */
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}
