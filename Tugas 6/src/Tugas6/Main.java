package Tugas6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("NAMA : Harsya Bachtiar");
        System.out.println("NIM  : 215150700111025\n");

        Manusia manusia1 = new Manusia("Aku", "275345313", true, true);
        Manusia manusia2 = new Manusia("Kamu", "954162919", true, true);
        Manusia manusia3 = new Manusia("Dia", "143584192", false, false);

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Yoga", "24282891", true, false, "195150701111025", 3.8);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Nisa", "19272498", false, false, "205150201111019", 3.95);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Anggi", "44347831", false, false, "215150301111023", 4.00);

        Pekerja pekerja1 = new Pekerja("Reyhan", "759264917", true, true, 10, 21, "571265839165");
        Pekerja pekerja2 = new Pekerja("Isna", "285798151", false, false, 7, 19, "985637112899");
        Pekerja pekerja3 = new Pekerja("Bima", "983789161", true, true, 5 , 23, "565728119275");
        Pekerja pekerja4 = new Pekerja("Daniel", "645378163", true,true, 8, 25, "285647191562");

        Manajer manajer1 = new Manajer("Uzumaki Saburo", "351744719563", true, false, 6, 20, "541839265901", 2000);
        Manajer manajer2 = new Manajer("Adinda Amelina", "351746189987", false, true, 9, 25, "728197481002", 1200);
        Manajer manajer3 = new Manajer("Karina lintang.", "351709312251", false, true, 10, 22, "904629104517", 1800);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();

        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);
        
        listMahasiswaFilkom.add(mhs1);
        listMahasiswaFilkom.add(mhs2);
        listMahasiswaFilkom.add(mhs3);

        listPekerja.add(pekerja1);
        listPekerja.add(pekerja2);
        listPekerja.add(pekerja3);
        listPekerja.add(pekerja4);

        listManajer.add(manajer1);
        listManajer.add(manajer2);
        listManajer.add(manajer3);

        System.out.println("");
        System.out.println("=> Data Manusia");
        listManusia.toString();
        System.out.println("=================================================\n");
        System.out.println("");
        System.out.println("=> Data Pekerja");
        listPekerja.toString();
        System.out.println("=================================================\n");
        System.out.println("");
        System.out.println("=> Data Manajer");
        listManajer.toString();
        System.out.println("=================================================\n");
        System.out.println("");
        System.out.println("=> Data Mahasiswa Filkom");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Total Manusia          : " + listManusia.size());
        System.out.println("Total Pekerja          : " + listPekerja.size());
        System.out.println("Total Manajer          : " + listManajer.size());
        System.out.println("Total Mahasiswa Filkom : " + listMahasiswaFilkom.size());
        System.out.println("---------------------------");

        
    }
}
