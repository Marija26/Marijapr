package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 08.11.2016.
 */

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/
public class Array17 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<Integer> array = new ArrayList<> ();

        for (int i = 0; i < 10; i++) {
            array.add (Integer.parseInt (reader.readLine ()));

        }


        printList (array);

    }

    public static void printList(List<Integer> list) {
        List<Integer> list1 = new ArrayList<> ();
        List<Integer> list2 = new ArrayList<> ();
        List<Integer> list3 = new ArrayList<> ();
        for (Integer x : list) {
            if (x % 3 == 0)
                list1.add (x);

            if (x % 2 == 0)
                list2.add (x);


            if (x % 3 == 1 && x % 2 == 1)
                list3.add (x);





        }
        for (int i = 0; i < list.size (); i++) {


            System.out.println (list.get (i));
        }
    }
}
