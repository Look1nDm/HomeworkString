package org.example;

import java.sql.Array;
import java.sql.Struct;
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
        String ex1 = new String(reverse(example1.toCharArray())); //хочется строкой вывести, не массивом=)
        System.out.println(ex1);

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
        char[] result = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = s[(s.length - 1) - i];
        }
        return result;
    }
    // в этой задачке необходимо составить строку из двух слов в такой последовательности:
    // первая буква первого слова будет первой в новой строке
    // первая буква второго слова будет второй в новой строке
    // вторая буква первого слова будет третей в новой строке
    // вторая буква второго слова будет четвертой в новой строке
    // и т.д.
    // пример строка1 = абс, строка2 = про -> ответ апбрсо

    static String merge(String word1, String word2) {

        //я тут решила немного унифицировать, чтобы задача подходила к строкам даже сильно разной длины.
        //после того, как кончилась более короткая - просто вписываю дальше длинную подряд
        int i = 0;
        int minLenght;
        boolean is1Longer;
        if (word1.length() < word2.length()) {
            minLenght = word1.length();
            is1Longer = false;
        } else {
            minLenght = word2.length();
            is1Longer = true;
        }

        StringBuilder merge = new StringBuilder(); // <- посмотрите основные методы этого класса, из них потребуется использовать один
        do {
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(i));
            i++;
        } while (i < minLenght);

        if (is1Longer) {
            for (int j = word2.length(); j < word1.length(); j++) {
                merge.append(word1.charAt(j));
            }
        } else {
            for (int j = word1.length(); j < word2.length(); j++) {
                merge.append(word2.charAt(j));
            }
        }
        return merge.toString();
    }

    /*
    Охххх, это наверное одна из самых сложных задачек,
    Ее суть, что в метод передается строка в виде некоторой римской цифры, в ответ возвращается арабское число
    я оставил подсказку, что бы было попроще, обратите внимание на длинну обоих массивов и отталкивайтесь от нее
    Желаю удачи, Войны!
     */
    static int romanToInt(String s) {
        int[] arabicNumbers = {0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanNumbers = {"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = (romanNumbers.length - 1); j > 0; ) {
                if (s.contains(romanNumbers[j])) {
                    result += arabicNumbers[j];
                    s = s.substring(s.indexOf(romanNumbers[j]) + 1);
                    i = 0;
                } else {
                    j--;
                }
            }
        }
        return result;
    }

}