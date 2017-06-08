package com.company.Javarush;

/**
 * Created by Маша on 01.06.2017.
 */
public class CheckShift {
    public static void main(String[] args) {
       Integer v = 2;
        shift(v,5);
        Integer a = new Integer(2);
        Integer b = new Integer(2);

        System.out.println(v);
        System.out.println(a.intValue() == b.intValue());
         System.out.println(a.compareTo(b));
         System.out.println(a.equals(b));
         System.out.println(a == b);
    }
    public static int shift(Integer value, Integer offset)
    {
        value += offset;
        return value;
    }

        public class Building {}
        public class Warehouse extends Building {}
        public class Shop extends Building {}
        public class SportsShop extends Shop {}


        Building b1 = new Building();
        Building b2 = new Warehouse();
    public static void selectionSort(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }



//    Warehouse w1 = b2;
//    Warehouse w2 = (Warehouse) b2;
//    Warehouse w3 = new SportsShop();
//     Shop s1 = (Shop)b1;
//       Shop s2 = new SportsShop();




}
