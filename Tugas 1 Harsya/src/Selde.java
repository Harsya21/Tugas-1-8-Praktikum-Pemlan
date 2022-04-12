import java.io.*;
import java.util.*;

public class Selde {

    public static void main(String[] args) {
        
        Scanner hrs = new Scanner(System.in);
        
        int inputan = hrs.nextInt();

        if (inputan == cek(inputan)) {
            System.out.printf("%d adalah selde.\n", inputan);
        } else {
            System.out.printf("%d bukan selde.\n", inputan);
        }
    }

    public static int cek(int inputan) {
        
        int balik = 0;
        
        while (inputan != 0) {
            balik   = balik * 10;
            balik   = balik + inputan % 10;
            inputan = inputan / 10;
        }
        
        return balik;
    }
}