/*
 * Ad Soyad: [Ahmet Enes Altun]
 * Ogrenci No: [250542020]
 * Tarih: [29.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ad Soyad: ");
        String adSoyad = input.nextLine();

        System.out.println("Öğrenci Numarası: ");
        int no = input.nextInt();

        System.out.println("Yaş: ");
        int yas = input.nextInt();

        System.out.println("GPA:");
        double gpa = input.nextDouble();





        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad:" + adSoyad);
        System.out.println("Öğrenci numarası:" + no);
        System.out.println("Yaş:" + yas);
        System.out.printf("GPA: %.2f",gpa);
        System.out.println("\nDurum:Başarılı");


    }
}
