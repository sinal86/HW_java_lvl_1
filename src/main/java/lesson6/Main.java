package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Dog dogTuzik = new Dog("Тузик");
        Dog dogSharik = new Dog("Шарик");
        Dog dogChernish = new Dog("Черныш");
        Cat catPushok = new Cat("Пушок");

        Animals animals = new Animals();

        System.out.println("Всего кошек: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());
        System.out.println("Всего питомцев: " + Animals.getCountAnimals());

        System.out.println();

        dogBobik.run(100);
        dogSharik.sail(100);

        System.out.println();

        catPushok.run(100);
        catPushok.sail(0);
    }
}
