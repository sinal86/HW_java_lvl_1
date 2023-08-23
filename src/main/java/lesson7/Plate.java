package lesson7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        if (n <= food) {
            food = food - n;
        } else {
            System.out.println("Котейкам нужно больше еды...ХООЗЯЯЯЯЯИИИН!!!");
        }
    }

    public void addFoodToPlate(int value) {
        food += value;
    }
}
