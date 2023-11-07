package Inheritance1;

public class Cat extends Animals {
    public String catSound = "Cat goes meow";

    @Override
    public void soundIs() {
        System.out.println(catSound);
    }

    public static void main(String[] args) {
    Animals animal = new Animals();
    Cat cat = new Cat();
    animal.soundIs();
    cat.soundIs();
    }


}
