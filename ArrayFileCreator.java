package javaapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;


public class ArrayFileCreator {
    public static void writeBinFile(int[] arr, String name) {
        try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(name + ".bin"));
            for (int i = 0; i < arr.length; i++) {
                writeFile.writeInt(arr[i]);
            }
            writeFile.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void search(int[] numRand, String name){
        byte[] buffer = new byte[4];
        int count = 0;
        int found = 0;
        
        try {
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(name + ".bin"));
            while (readFile.read(buffer) != -1) {
                int num = ByteBuffer.wrap(buffer).getInt();
                for (int i : numRand) {
                    if (num == i) {
                        System.out.println("Number " + num + " in index " + count);
                        found++;
                        break;
                    }
                }
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        if (found == 0) {
            System.out.println("Nothing found");
        }
    }
}
