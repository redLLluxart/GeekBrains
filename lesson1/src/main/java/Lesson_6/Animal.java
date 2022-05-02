package Lesson_6;

public abstract class Animal {

    public int animalCount;
    protected String name;
    protected int weight;
    protected int age;

    public Animal(String name, int weight, int age) {
        animalCount++;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract void run(int howLongRun);

    public abstract void swimm(int howLongSwimm);

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
