package lesson6;

public class Animals {
    public String name;
    private static int countAnimals = 0;

    public Animals() {
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void sail(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}
