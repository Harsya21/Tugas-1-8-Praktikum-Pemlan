package TugasCarHar;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("NAMA    : Harsya Bachtiar");
        System.out.println("NIM     : 215150700111025");
        
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider youhan = new CarRider("B ei Youhan",20,"0811111111111");
        CarRider ling = new CarRider("Ling'er",31,"08122222222222");
        CarRider xiao = new CarRider("Xiao Mi", 65, "08333333333");
        CarRider chou = new CarRider("Chou Klat", 65, "08444444444");


        CarData data = new CarData();
        data.addCar("SUV","N 111 AB","Honda");
        data.addCar("SPORT","N 222 AB","SSC Tuatara");
        data.addCar("TRUCK","N 333 AB","Suzuki");
        data.addCar("Limousine","N 444 AB","Bentley");

        data.listOfCar();

        System.out.println();
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9); 
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        arsip.Rent(xiao, data.carList.get(2), 7);
        arsip.Rent(chou, data.carList.get(2), 3);
        

        System.out.println();
        arsip.info();
    }
}
