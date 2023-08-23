package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkAppFour {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {

        return checkHorizontalWin(symb) ||
                 checkVerticalWin(symb) ||
                 checkDiagonalsWin(symb);

    }

    private static boolean checkDiagonalsWin(char symb) {
        boolean res = true;
        for (int i = 1; i < SIZE && res; i++)
            res = map[i][i] == map[0][0] && map[0][0] == symb;
        if (res)
            return true;
        res = true;
        for (int i = 1; i < SIZE && res; i++)
            res = map[SIZE - i - 1][i] == map[SIZE - 1][0] && map[SIZE - 1][0] == symb;
        return res;
    }

    private static boolean checkHorizontalWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            boolean res = true;
            for (int j = 1; j < SIZE && res; j++)
                res = map[i][j] == map[i][0] && map[i][0] == symb;
            if (res)
                return true;
        }
        return false;
    }

    private static boolean checkVerticalWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            boolean res = true;
            for (int j = 1; j < SIZE && res; j++)
                res = map[j][i] == map[0][i] && map[0][i] == symb;
            if (res)
                return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        System.out.println("Повторите ввод!!!");
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
