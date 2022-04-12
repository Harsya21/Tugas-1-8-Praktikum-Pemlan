import java.io.*;
import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        
        Scanner hrs = new Scanner(System.in);

        String teksSebelum = hrs.nextLine();
        int N = hrs.nextInt();

        System.out.println(pergeseran(teksSebelum, N));
    }

    public static String pergeseran(String input, int N) {
        
        char huruf = ' ';
        String teksSesudah = "";

        for (int i = 0; i < input.length(); i++) {
            huruf = input.charAt(i);
            if (huruf >= 'a' && huruf <= 'z') {
                huruf = (char) (huruf + N);

                if (huruf > 'z') {
                    huruf = (char) (huruf - 26);
                }
                teksSesudah = teksSesudah + huruf;
            }

            else if (huruf >= 'A' && huruf <= 'Z') {
                
                huruf = (char) (huruf + N);

                if (huruf > 'Z') {
                    huruf = (char) (huruf - 26);
                }
                
                teksSesudah = teksSesudah + huruf;
        
            } else {
                
                teksSesudah = teksSesudah + huruf;
            }

        }
        return teksSesudah;

    }
}