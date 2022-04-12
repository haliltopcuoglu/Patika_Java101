package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Not Ortalaması Hesaplama
        Scanner ort = new Scanner(System.in);
        System.out.println("*** Ortalama Hesaplama ***");

        System.out.print("Matematik Notunuzu Giriniz : ");
        int mat = ort.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        int fiz = ort.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        int kim = ort.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        int tr = ort.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        int tar = ort.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        int mz = ort.nextInt();

        double result = (mat + fiz + kim + tr + tar + mz) / 6d;
        System.out.println("Ortalamanız : "+result+"/100");

        String gectikaldi = (result > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı.";
        System.out.println("Durumu : "+gectikaldi);
    }
}
