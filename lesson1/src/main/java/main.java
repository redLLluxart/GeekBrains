// main HomeWorkApp
package Lesson_6;

import java.sql.ParameterMetaData;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Richard",75, 9);
        dog1.swimm(4);
        dog1.swimm(15);
        dog1.run(500);
        dog1.run(100);
        Cat cat1 = new Cat("Barsik", 10, 2);
        cat1.run(500);
        cat1.run(50);
        cat1.swimm(23);
        System.out.println("Amount cats: " + cat1.catCount);
        System.out.println("Amount dogs: " + dog1.dogCount);
        int animalCount = cat1.catCount + dog1.dogCount;
        System.out.println("Amount animals: " + animalCount);
    }
}
