// First task GeekBrains
// Fix errors by Александро Гладковым
import java.util.Scanner;

public class HomeWorkApp_1{

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(Scanner in) {
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: " );
        int b = in.nextInt();
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(Scanner in){
        System.out.println("Enter value: ");
        int value = in.nextInt();
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100 ){
            System.out.println("Желтый");
            } else{
                System.out.println("Зеленый");
            }
    }

    public static void compareNumbers(Scanner in){
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: " );
        int b = in.nextInt();
        if (a >= b ){
            System.out.println(" a >= b ");
        }
        else {
            System.out.println(" a < b ");
        }
    }
}
