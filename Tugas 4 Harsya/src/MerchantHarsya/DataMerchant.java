package MerchantHarsya;

import java.util.*;

public class DataMerchant {

    static Scanner in = new Scanner(System.in);
    static Merchant merch[] = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant newMerch[] = new Merchant[merch.length + 1];
        System.arraycopy(merch, 0, newMerch, 0, merch.length);
        newMerch[merch.length] = merchant;
        return newMerch;
    }

    public static void tampilData() {
        for (Merchant mch1 : merch) {
            System.out.println("====Tampilan Data Merchant UB Food=====");
            System.out.println("Nama Merhcant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga Makanan   : " + String.format("%.0f", mch1.getHargaMakanan()));
        }
    }

    public static Merchant cariMerchant(String name) {
        for (Merchant merchant : merch)
            if (merchant.getNamaMerchant().equalsIgnoreCase(name))
                return merchant;
        return null;
    }
    
    public static void updateMerchant(Merchant merchant) {
        System.out.print("Nama Merchant : ");
        merchant.setNamaMerchant(in.nextLine());
        System.out.print("Nama Produk   : ");
        merchant.setNamaProduk(in.nextLine());
        System.out.print("Harga Makanan : ");
        merchant.setHargaMakanan(in.nextDouble());
    }

    public static void tampilMerchant(Merchant merchant) {
        System.out.println("====Tampilan Data Merchant UB Food=====");
        System.out.println("Nama Merhcant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga Makanan   : " + String.format("%.0f", merchant.getHargaMakanan()));
    }
    
}
