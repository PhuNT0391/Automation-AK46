package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isVowels(String input) {
        if (input.length() != 1) throw new IllegalArgumentException("input string length must be equals 1");
        return "ueoaiUEOAI".contains(input);
    }
/** Tim phan tu lon nhat trong 1 mang
    [1,4,9,0,2,8]
    Tim index cua phan tu lon nhat
*/
public static void main(String[] args){
    int[] arr = new int[]{1,4,9,0,2,8,10,15};
    int max = Arrays.stream(arr).max().getAsInt();
    System.out.println(max);

    int min = Arrays.stream(arr).min().getAsInt();
    System.out.println(min);

//    List<Integer> list = Arrays.stream(arr).boxed().toList();
//    int maxIndex = list.indexOf(max);
//    System.out.println(maxIndex);

/**
 * Tao 1 class Student voi cac thuoc tinh
 * Name
 * ID => random 1 chuoi prefix TVN-<number>
 * Math: 0-10
 * Physic:0-10
 * Chemistry:0-10
 * Constructor: new Student(String name)
  */




}
}