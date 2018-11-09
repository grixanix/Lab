package com.company;
import java.util.Scanner;

/*
1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
2. Вывести на экран аргументы командной строки в цикле for.
3. Вывести на экран первые 10 чисел гармонического ряда.
4. Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.
5. Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.
 */

public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 100;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.print("Enter array length 0 - 100: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i <= array.length -1; i++)
        {
            array[i] = a + (int) (Math.random() * b); // Заполняем массив рандомом
        }
        System.out.println ("Inserted array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
            }
        System.out.println();
        int sum = 0;
        System.out.print("FOR: ");
        for (int i = 0; i < size; i++) {

            sum += array[i];
        }
        System.out.print(sum); // Выводим на экран, полученную сумму

        System.out.print("\nWHILE: ");
        int i = 0;
        sum = 0;
            while(i <= array.length -1) {
            sum += array[i];
                i++;
            }
            System.out.print(sum); // Выводим на экран, полученную сумму

        System.out.print("\nDO - WHILE: ");
        sum = 0;
            do {
                for (i = 0; i < size; i++) {
                    sum += array[i];
                }
                System.out.print(sum); // Выводим на экран, полученную сумму
            }while(i <= array.length -1);
    }
}

