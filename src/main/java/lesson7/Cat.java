package lesson7;

public class Cat {
    final String name;
    final int appetite;
    boolean is_Satiety = false;
//    boolean is_Sleeping = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {

            plate.decreaseFood(appetite);
            is_Satiety = true;
            System.out.println(name + " покушал. Котейка спит =)");
    }

//    private void hungryAfterSlip() {
//        if (!is_Satiety) {
//            is_Sleeping = true;
//        }
//        if (!is_Sleeping) {
//            is_Satiety = false;
//        }
//    }
}
