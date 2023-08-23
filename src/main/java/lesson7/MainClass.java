package lesson7;

public class MainClass {
    public static void main(String[] args) {

        Plate plate = new Plate(100);

        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Чешир", 7);
        cats[2] = new Cat("Тучка", 3);
        cats[3] = new Cat("Тапок", 6);

        plate.info();

        boolean is_FullPlate = true;
        while (is_FullPlate) {
            for (Cat cat : cats) {
                if (cat.appetite <= plate.food) {
                    cat.eat(plate);
                    plate.addFoodToPlate(2);
                    plate.info();
                } else {
                    System.out.println(cat.name + " не покушал, еда закончилась!!!");
                    is_FullPlate = false;
                }
            }
        }



    }
}
