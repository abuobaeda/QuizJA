package javaapp;

public class RandomNumberGenerator {
    public static void generator(int[] arr){
        for (int i = 0; i < arr.length;) {
            int randNum = (int) Math.round(Math.random() * 25000);
            if (duplication(arr, randNum, i)) {
               arr[i] = randNum;
               i++;
            }
        }
    }
    
    private static boolean duplication(int[] arr, int num, int index){
        for (int i = 0; i < index; i++) {
            if (arr[i] == num) {
                return false;
            }
        }
        return true;
    }
}
