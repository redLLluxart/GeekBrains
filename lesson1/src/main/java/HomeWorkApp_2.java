// Second Task GeekBrains

public class HomeWorkApp_2 extends Exception{

    public static boolean checkSumm(int a, int b){
        if (a + b >= 10 && a + b <= 20){
            return true;
        }
        else{
            return false;
        }
    }

    public static void checkSign_Str(int a){
        if (a >= 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }

    public static boolean checkSign_bool(int a){
        if (a >= 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void repeat(int a, String str){
        for (int i = 1; i <= a; i++){
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year){
        if (year < 0){
            System.out.println("Error! The year cannot be negative");
            return false;
        }
        if (year % 4 == 0 & year % 100 != 0){
            return true;
        }
        else{
            if (year % 400 == 0){
                return true;
            }
            return false;
        }
    }

}
