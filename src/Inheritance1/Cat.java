package Inheritance1;

public class Cat extends Animals {
    public String catSound = "Cat goes meow";

    @Override
    public void soundIs() {
        System.out.println(catSound);
    }




}
