import java.util.Scanner;
// Первое задание GeekBrains
public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);
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

    public static void printColor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = in.nextInt();
        if (value <= 0){
            System.out.println("Красный");
        } else if (0 < value && value <= 100 ){
            System.out.println("Желтый");
            } else if (value > 100){
                System.out.println("Зеленый");
            }
    }

    public static void compareNumbers(){
        Scanner in = new Scanner(System.in);
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
