package javaapp;

public class JavaApp {
    public static void main(String[] args) {
        ArrayCreator arrCre = new ArrayCreator();
        int[] number = new int[10];
        
        // Array 1
        System.out.println("Array1 creation is started");
        RandomNumberGenerator.generator(arrCre.arrOne);
        System.out.println("Array1 creation is ended\n");
        
        // Array 2
        System.out.println("Array2 creation is started");
        RandomNumberGenerator.generator(arrCre.arrTwo);
        System.out.println("Array2 creation is ended\n");
        
        // Create Array 1
        System.out.println("Array1 creation is started");
        ArrayFileCreator.writeBinFile(arrCre.arrOne, "array1");
        System.out.println("Array1 creation is ended\n");
        // Create Array 2
        System.out.println("Array2 creation is started");
        ArrayFileCreator.writeBinFile(arrCre.arrTwo, "array2");
        System.out.println("Array2 creation is ended\n");
        
        // Generate 10 random number
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) Math.round(Math.random() * 25000);
        }
        
        // Serach in Arrays 1
        System.out.println("Searching in Array 1: ");
        ArrayFileCreator.search(number, "array1");
        // Serach in Arrays 2
        System.out.println("Searching in Array 2: ");
        ArrayFileCreator.search(number, "array2");
        
    }
}
