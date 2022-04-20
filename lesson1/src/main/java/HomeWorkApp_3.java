//Third task GeekBrains

import java.util.Arrays;

public class HomeWorkApp_3 {
    public static void main(String[] args) {
        //int[] array = new int[100]; // First and second task

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1} ; // Third task and Sixth task

        //int[][] array = new int[6][6]; // Fourth task

        /*for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*2);
        }
        System.out.println(Arrays.toString(array));
        replacement(array);
        System.out.println(Arrays.toString(array));*/ // First task

        /*fill_array(array);
        System.out.println(Arrays.toString(array));*/ // Second task

        /*System.out.println(Arrays.toString(array));
        LessThenSix(array);
        System.out.println(Arrays.toString(array));*/ // Third task

        /*FillArrayDiagElements(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }*/ // Fourth task

        //System.out.println(Arrays.toString(ReturnFillArray(5,999))); // Fifth task

        System.out.println(SearchMax(array));
        System.out.println(SearchMin(array));
    }

    public static void Replacement(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] > 0 ? 0 : 1;
        }
    }
    public static void FillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
    }
    public static void LessThenSix(int[] array){
        for (int i =0; i < array.length; i++){
           array[i] =  array[i] < 6 ? array[i]*2 : array[i];
        }
    }
    public static void FillArrayDiagElements(int[][] array){
        for (int i = 0; i < array.length; i++){
            array[i][i] = 1;
            array[i][array.length-1-i] = 1;
        }
    }
    public static int[] ReturnFillArray(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
    public static int SearchMax(int[] array){
        int maximum = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
    public static int SearchMin(int[] array){
        int minimum = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
