package org.example;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        /*
        Задания будут идти по степени сложности ну и интересности, если у вас не получится
        решить за один вечер или день, не переживайте, это на несколько дней
        само собой если будут возникать вопросы - обращайтесь
         */
        String example1 = "!ондохсоверП !ьтажред каТ";
        String example2 = "Увсвеплчлс ен!";
        String example3 = " а с оуиоьвро";
        // чет понастальгировал)))

        // для первого задания
        System.out.println(Arrays.toString(reverse(example1.toCharArray())));

        // вывод на экран ответа второго задания
        System.out.println(merge(example2, example3));
        // вывод ответа третьего
        System.out.println(romanToInt("MMXXV"));
    }
    /*
    В этом методе нужно написать алгоритм переворота строки в обратном порядке
    тоже самое, что делали с массивом чисел, просто перевернуть фразы
    обратите внимание, что метод у себя в параметре принимает не строку.
    И возвращет тоже не строку (за забудьте при выводе)
     */
    static char[] reverse(char[] s) {
        // писать логику тут
        return null;
    }
    // в этой задачке необходимо составить строку из двух слов в такой последовательности:
    // первая буква первого слова будет первой в новой строке
    // первая буква второго слова будет второй в новой строке
    // вторая буква первого слова будет третей в новой строке
    // вторая буква второго слова будет четвертой в новой строке
    // и т.д.
    // пример строка1 = абс, строка2 = про -> ответ апбрсо
    static String merge(String word1, String word2) {
        int i = 0;
        StringBuilder merge = new StringBuilder(); // <- посмотрите основные методы этого класса, из них потребуется использовать один
        // писать логику тут
        return null;
    }

    /*
    Охххх, это наверное одна из самых сложных задачек,
    Ее суть, что в метод передается строка в виде некоторой римской цифры, в ответ возвращается арабское число
    я оставил подсказку, что бы было попроще, обратите внимание на длинну обоих массивов и отталкивайтесь от нее
    Желаю удачи, Войны!
     */
    static int romanToInt(String s) {
        int[] arabicNumbers = {0,1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanNumbers = {"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int result = 0;
        // тут писать саму логику
        return result;
    }
}