package lesson6;

public class Cat extends Animals {
    private static int countCat = 0;

    public Cat(String name) {
        this.name = name;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(name + " столько не пробежит!!!");
        }
    }

    @Override
    public void sail(int distance) {
        System.out.println(name + " не умеет плавать!!!");
    }
}
