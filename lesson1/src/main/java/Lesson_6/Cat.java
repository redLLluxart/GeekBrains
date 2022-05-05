package Lesson_6;

public class Cat extends Animal {

    private String animal = "Cat";
    public int catCount;

    public Cat(String name, int weight, int age){
        super(name, weight, age);
        catCount++;
    }

    @Override
    public void run(int howLongRun){
        int run = howLongRun > 200 ? 200 : howLongRun;
        System.out.println(animal + " " + name + " " + "ran" + " " + run);
    }

    @Override
    public void swimm(int howLongSwimm){
        System.out.println(animal + " " + "can't swim!");
    }

}
