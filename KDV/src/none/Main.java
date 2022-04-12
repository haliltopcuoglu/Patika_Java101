package none;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar, kdvliTutar, kdvTutari, kdv = 0.18;
        System.out.println("*-*-* KDV Tutarı Hesaplama Programı *-*-*");
        System.out.print("Lütfen Tutar Giriniz: ");
        Scanner inpTutar = new Scanner(System.in);
        tutar = inpTutar.nextDouble();
        kdvTutari = tutar * kdv;
        kdvliTutar = kdvTutari + tutar;
        System.out.println("Kdv Tutarı: "+ kdvTutari);
        System.out.println("Kdv'li Tutar: "+ kdvliTutar);

    }
}
