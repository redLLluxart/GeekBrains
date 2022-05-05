package Lesson_6;

public class Dog extends Animal {

    private String animal = "Dog";
    public int dogCount;

    public Dog(String name, int weight, int age){
        super(name, weight, age);
        dogCount++;
    }

    @Override
    public void run(int howLongRun){
        int run = howLongRun > 500 ? 500 : howLongRun;
        System.out.println(animal + " " + name + " " + "ran" + " " + run);
    }

    @Override
    public void swimm(int howLongSwimm){
        int swimm = howLongSwimm > 10 ? 10 : howLongSwimm;
        System.out.println(animal + " " + name + " " + "swam" + " " + swimm);
    }
}
