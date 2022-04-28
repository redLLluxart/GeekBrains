// main HomeWorkApp
package lesson_5;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        Employee Employe1 = new Employee();
        Employe1.showData();
        System.out.println("#################################");
        Employee Employe2 = new Employee("1","2","3","4","5","6",1,5);
        Employe2.showData();
        Employee[] office = new Employee[5];
        System.out.println("#################################");
        for(int i = 0; i < office.length; i++){
            office[i] = new Employee();
            office[i].setAge((int) ( Math.random() * 100 ));
            if (office[i].getAge() > 40){
                office[i].showData();
                System.out.println("#################################");
            }
        }

    }
}
