
/*
 * Ad Soyad: [Ahmet Enes Altun]
 * Ogrenci No: [250542020]
 * Tarih: [03.11.2025]
 * Aciklama: Gorev 3 - Maas Hesap
 *
 * Bu program kullanicidan ad soyad,aylık büret maaş,haftalık çalışma saati ve mesai saatini alir ve
 * MAAS BADROSU'nu çıkartır
 */


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("Ad Soyad:");
        String ad = input.nextLine();
        System.out.println("Aylık Brüt Maaş:");
        double brMaas = input.nextDouble();
        System.out.println("Haftalık Çalıma Saati:");
        int calismaSaat = input.nextInt();
        System.out.println("Mesai Saati:");
        int mesaiSaat = input.nextInt();

        double mesaiUcreti = (brMaas/160)*mesaiSaat*1.5;
        double toplamGelir = brMaas + mesaiUcreti;
        double SGK = toplamGelir * 0.14;
        double gelirVergisi = toplamGelir * 0.15;
        double damgaVergisi = toplamGelir * 0.00759;
        double toplamKesinti = SGK + gelirVergisi + damgaVergisi;
        double netMaas =toplamGelir - toplamKesinti;
        double kesintiOrani =(toplamKesinti/toplamGelir) * 100;


        System.out.println("====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.println("Calisan:" + ad);
        System.out.println("");
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas              : %.2f%n", brMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %.2f%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR           : %.2f%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (14.0%%) : %.2f%n", SGK);
        System.out.printf("Gelir Vergisi (15.0%%) : %.2f%n", gelirVergisi);
        System.out.printf("Damga Vergisi (0.76%%) : %.2f%n", damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI         : %.2f%n", toplamKesinti);
        System.out.printf("NET MAAS               : %.2f%n", netMaas);

    }
}
