package com.company.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 19.09.2016.
 */
/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class Lesson1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int sum = 0;
        do {
            a = Integer.parseInt(reader.readLine());
            sum += a;
        } while (a != -1);

        System.out.println(sum);
    }

}
