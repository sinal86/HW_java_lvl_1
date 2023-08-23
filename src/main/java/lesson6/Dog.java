package lesson6;

public class Dog extends Animals {
    private static int countDog = 0;

    public Dog(String name) {
        this.name = name;
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(name + " столько не пробежит");
        }
    }

    @Override
    public void sail(int distance) {
        if (distance <= 10) {
            super.sail(distance);
        } else {
            System.out.println(name + " столько не проплывёт!!!");
        }
    }
}
