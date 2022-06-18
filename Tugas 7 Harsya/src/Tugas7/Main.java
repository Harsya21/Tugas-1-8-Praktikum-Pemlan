package Tugas7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("NAMA    : Harsya Bachtiar");
        System.out.println("NIM     : 215150700111025\n");

        Pegawai peg1 = new PegawaiTetap("Dhimas", "256583211846", 2000000);
        Pegawai peg2 = new PegawaiTetap("Bimo", "259147291648", 1500000);
        Pegawai peg3 = new PegawaiTetap("Faris", "253185649942", 1000000);
       
        Pegawai peg4 = new PegawaiHarian("Andre", "672317873195", 7000, 40);
        Pegawai peg5 = new PegawaiHarian("Kresna", "678324112412", 8000, 35);
        Pegawai peg6 = new PegawaiHarian("Aldo", "673894518418", 10000, 37);
 
        Pegawai peg7 = new Sales("Lidya", "392146173849", 80, 50000);
        Pegawai peg8 = new Sales("Shinta", "391472859714", 50, 60000);
        Pegawai peg9 = new Sales("Lila", "391478192648", 65, 65000);

        ArrayList <Pegawai> list = new ArrayList<Pegawai>();
        
        list.add(peg1);
        list.add(peg2);
        list.add(peg3);
        list.add(peg4);
        list.add(peg5);
        list.add(peg6);
        list.add(peg7);
        list.add(peg8);
        list.add(peg9);

        for(Pegawai i : list){
            i.toString();
        }

        
    }
    
}
