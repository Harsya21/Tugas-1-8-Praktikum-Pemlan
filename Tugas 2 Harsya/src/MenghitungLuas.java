import java.io.*;
import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int menu = scn.nextInt();

        if(menu == 1) {
            Persegi persegi = new Persegi(scn.nextInt());
            persegi.luasPersegi();
        }
        else 
        if(menu == 2) {
            Segitiga segitiga = new Segitiga(scn.nextInt(), scn.nextInt());
            segitiga.luasSegitiga();
        }
        else 
        if(menu == 3) {
            int scn2 = scn.nextInt();
            Lingkaran lingkaran = new Lingkaran(scn2);
            if (scn2 % 7 == 0) {
                lingkaran.luasLingkaranSatu();
            }else
                lingkaran.luasLingkaranDua();
        }
        else
            System.out.println("Input yang anda masukan tidak sesuai");

    }

}

class Persegi {
    int sisi;

    Persegi(int sisi){
        this.sisi = sisi;
    }

    public int luasPersegi(){
        int luas = sisi * sisi;
        System.out.println(luas);
        return luas;
    }
}

class Segitiga {
    int alas;
    int tinggi;

    Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;

    }

    public int luasSegitiga(){
        int luas = (alas * tinggi) / 2;
        System.out.println(luas);
        return luas;
    }
}

class Lingkaran {
    int r;

    Lingkaran(int r) {
        this.r = r;
    }

    public int luasLingkaranSatu() {
        int luas = (int) (22 / 7 * r * r);
        System.out.println((double) luas);
        return luas;
    }

    public int luasLingkaranDua() {
        int luas = (int) (3.14 * r * r);
        System.out.println((double) luas);
        return luas;
    }
}
