import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Baju object = new Baju();
        object.ingf();

        System.out.print("Baju yang akan anda beli bertipe : ");
        object.jenis = scan.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        object.jmlh = scan.nextInt();

        object.display();
    }
}

class Baju {
    String jenis;
    int jmlh;
    int harga;

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void ingf() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + bajua);
        System.out.println("Baju B dengan harga " + bajub);
        System.out.println("Baju C dengan harga " + bajuc);
    }

    void hargaa() {
        if (jmlh > 100) {
            this.harga = 95000;
        } else {
            this.harga = bajua;
        }
    }

    void hargab() {
        if (jmlh > 100) {
            this.harga = 120000;
        } else {
            this.harga = bajub;
        }
    }

    void hargac() {
        if (jmlh > 100) {
            this.harga = 160000;
        } else {
            this.harga = bajuc;
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jmlh);
    }
}