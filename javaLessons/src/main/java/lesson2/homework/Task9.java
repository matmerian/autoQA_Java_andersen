package lesson2.homework;
/*
 * Написать метод, принимающий на вход два аргумента: len и initialValue,
 * и возвращающий одномерный массив типа int длиной len,
 * каждая ячейка которого равна initialValue;
 */

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        createArray(6, 1234);
    }

    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));

    }
}