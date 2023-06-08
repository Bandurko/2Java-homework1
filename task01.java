// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить 
// в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить 
// в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах ПОПРОБУЮ НА ПОДОБИИ C#...

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

// Мне кажется, что у меня получилось решить задачу случайно. 
// Я очень многого не понимаю и не знаю...

import java.util.Arrays;
import java.util.Random;

public class task01 {

    public static void main(String[] args) {
        
    // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        // Random random = new Random();
        int i = new Random().nextInt(2001);
        // System.out.printf("Случайное целое число в диапазоне от 0 до 2000 %s!", i);
        System.out.println(i);
        int n = msb(i);
        int[] m1 = mult(i, n);
        int[] m2 = no_mult(i, n);
        System.out.println(m1); // Мне кажется он не выводит такие огромные массивы в консоль...
        System.out.println(m2); // Мне кажется он не выводит такие огромные массивы в консоль...
    }
    // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        // int n = (Integer.toBinaryString(i).length() - 1);
        public static int msb(int i) {

        int n = (Integer.toBinaryString(i).length() - 1);
        return n;            
        }
        
    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить 
    // в массив m1
    public static int[] mult(int i, int n) {

        int size_m1 = 0; // Находим размер массива m1
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0 ){
                size_m1++;
            }
        }
        
        int[] m1 = new int[size_m1];
        int index_m1 = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0){
                m1[index_m1] = j;
                index_m1++;
            }
        }
        return m1;
    }

    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить 
    // в массив m2
    public static int[] no_mult(int i, int n) {

        int size_m2 = 0; // Находим размер массива m1
        for (int k = Short.MIN_VALUE; k < i; k++){
            if ( k % i != 0 ){
                size_m2++;
            }
        }
        int[] m2 = new int[size_m2];
            int index_m2 = 0;
            for (int j = Short.MIN_VALUE; j < i; j++){
                if (j % n != 0){
                    m2[index_m2] = j;
                    index_m2++;
                }
            }
            return m2;
    }
}
