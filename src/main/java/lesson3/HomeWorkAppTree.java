package lesson3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkAppTree {
    public static void main(String[] args) {
        System.out.println();

        createAndChangeArrays(15); /* 1.Замена "0" на "1" и наоборот.  Заполнение с помощью рандомайзера. */

        /*-------------------------------------------------------*/

        createArrays(100); /* 2. Заполнение до 100. */

        /*-------------------------------------------------------*/

        multiplicationByTwo(10); /* 3. Умножение на "2".  Заполнение с помощью рандомайзера. */

        /*-------------------------------------------------------*/

        fillingDiagonals(5, 1); /* 4. Заполнение массива по диагоналям.*/

        /*-------------------------------------------------------*/

        createArrays(10, 7); /*5. Создание массива необходимой длинны и заполнение необходимыми значениями. */

        /*-------------------------------------------------------*/

        searchMinMax(10); /* 6*. Нахождение min и max элементы. Заполнение с помощью рандомайзера. */


        /*-------------------------------------------------------*/

        sectionArray(5); /* 7**. Нахождение места равенства сторон. Заполнение с помощью рандомайзера. */

        /*-------------------------------------------------------*/

        arrayPositionShift(5, 2); /* 8***. Сдвиг массива на n позиций. Заполнение с помощью рандомайзера. */
        arrayPositionShift(5, -2);

        /*-------------------------------------------------------*/


    }

    public static void createAndChangeArrays(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int value = ThreadLocalRandom.current().nextInt(0, 2);
            array[i] = value;
        }

        System.out.println("Случайно заполненный массив");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }

        System.out.println();

        System.out.println("Изменённый массив");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println();
    }

    public static void createArrays(int size) {
        System.out.println("Результат заполнения");

        int[] array = new int[size];
        int valueArray = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = valueArray;
            valueArray++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println();
    }

    public static void multiplicationByTwo(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int value = ThreadLocalRandom.current().nextInt(0, 10);
            array[i] = value;
        }

        System.out.println("Случайно заполненный массив");
        System.out.println(Arrays.toString(array));
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.println("Изменённый массив");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void fillingDiagonals(int size, int filling) {
        System.out.println("Результат заполнения");

        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i == j || (i + j == size - 1)) {
                    array[i][j] = filling;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        System.out.println();
    }

    public static void createArrays(int len, int initialValue) {
        System.out.println("Результат заполнения");

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println();
    }

    public static void searchMinMax(int size) {
        System.out.println("Случайно заполненный массив");

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int value = ThreadLocalRandom.current().nextInt(0, 16);
            array[i] = value;
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Результат поиска");
        System.out.println("Минимальный элемент: - " + min);
        System.out.println("Максимальный элемент: - " + max);

        System.out.println();
    }

    public static void sectionArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            int value = ThreadLocalRandom.current().nextInt(0, 16);
            array[i] = value;
        }
        System.out.println("Случайно заполненный массив");
        System.out.println(Arrays.toString(array));

        int countLeft = 0;
        int countRight = 1;

        boolean is_Present = false;

        while (countRight <= (array.length - 1)) {

            int summLetf = 0;
            int summRight = 0;

            for (int i = countLeft; i >= 0; --i) {
                summLetf = summLetf + array[i];
            }

            for (int i = countRight; i < array.length; i++) {
                summRight = summRight + array[i];
            }

            countLeft++;
            countRight++;

            if (summRight == summLetf) {
                is_Present = true;
                break;
            }
        }
        System.out.println("Результат исследования: " + is_Present);
        System.out.println();
    }

    public static void arrayPositionShift(int size, int shift) {

        int[] arrayStart = new int[size];
        int[] arrayFinal = new int[size];
        int length = arrayStart.length;

        for (int i = 0; i < size; i++) {
            int value = ThreadLocalRandom.current().nextInt(0, 16);
            arrayStart[i] = value;
        }

        System.out.println("Cлучайно заполненный массив");
        System.out.println(Arrays.toString(arrayStart));

        if (shift > 0) {

            System.arraycopy(arrayStart, 0, arrayFinal, shift, length - shift);

            System.arraycopy(arrayStart, length - shift, arrayFinal, 0, shift);

        } else {

            System.arraycopy(arrayStart, -shift, arrayFinal, 0, length - (-shift));

            System.arraycopy(arrayStart, 0, arrayFinal, length - (-shift), -shift);

        }

        System.out.println("Массив сдвинут на: " + shift);
        System.out.println(Arrays.toString(arrayFinal));
        System.out.println();
    }
}

