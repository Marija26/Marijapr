package com.company.OOP.Task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 30.01.2017.
 */
/* Singleton pattern Lazy initialization.
1. Создать интерфейс Planet, в нём создать 3 переменные:
    String SUN = "sun";
    String MOON = "moon";
    String EARTH = "earth";
2. В отдельных файлах создать три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
4. В классе Solution создать переменную static Planet thePlanet;
4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
6. В методе main вывести на экран значение переменной thePlanet.
*/
public class Task01 {
    public static void main(String[] args) throws IOException {
        System.out.println (thePlanet);


    }
    static {


        try {
            readKeyFromConsoleAndInitPlanet ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    static Planet thePlanet;

    static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine ();
        if (s.equals (Planet.EARTH)) {
            thePlanet = Earth.getInstance ();
        }
        else if(s.equals (Planet.MOON)){
            thePlanet = Moon.getInstatnce ();
        }
        else if(s.equals (Planet.SUN)){
            thePlanet = Sun.getInstatnce ();
        }
        else{}





    }

}
