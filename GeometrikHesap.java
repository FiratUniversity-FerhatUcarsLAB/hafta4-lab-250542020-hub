/*
 * Ad Soyad: [Ahmet Enes Altun]
 * Ogrenci No: [250542020]
 * Tarih: [03.11.2025]
 * Aciklama: Gorev 2 - Geometrik Hesap
 *
 * Bu program kullanicidan Daire yarı çapı alir ve
 * duzenli bir formatta ekrana yazdirir.
 */


import java.util.Scanner;

public class Main{
    public static void main(String[] args ){
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarı çapı giriniz(cm):");
        double yariCap = input.nextDouble();
        System.out.println("SONUCLAR:");
        System.out.println("--------");
        System.out.printf("Daire Alani      :" + "%.2f cm^2\n", PI * yariCap * yariCap);
        System.out.printf("Daire Cevresi    :" + "%.2f cm\n", 2 * PI * yariCap);
        System.out.printf("Daire Capi       :" + "%.2f cm\n", 2 * yariCap);
        System.out.printf("Kure Hacmi       :" + "%.2f cm^3\n", 4.0/3.0 * PI * yariCap * yariCap * yariCap);
        System.out.printf("Kure Yuzey Alani :" + "%.2f cm^2\n", 4 * PI * yariCap * yariCap);

    }
}
