package Main;

import BangunDatar.*;
import BangunRuang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ Bangun Datar ===================");

        // Polymorphism - Lingkaran
        BangunDatar lingkaran = new Lingkaran(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();

        System.out.println("");

        // Polymorphism - Persegi
        BangunDatar persegi = new Persegi(3);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        System.out.println("");

        // Polymorphism - Persegi Panjang
        BangunDatar persegiPanjang = new PersegiPanjang(3,7);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();

        System.out.println("");

        // Polymorphism - Segitiga
        BangunDatar segitiga = new Segitiga(3,4,5,5, 5);
        segitiga.hitungLuas();
        segitiga.hitungKeliling();

        System.out.println("");

        // Polymorphism - Layang - Layang
        BangunDatar layangLayang = new LayangLayang(3,4,5,6);
        layangLayang.hitungLuas();
        layangLayang.hitungKeliling();

        System.out.println("");
        System.out.println("================ Bangun Ruang ===================");
        System.out.println("");

        //Inisiasi LimasPersegi
        LimasPersegi LimasPersegi = new LimasPersegi(5, 5);
        LimasPersegi.hitungVolume();
        LimasPersegi.hitungLuasPermukaan();

        System.out.println("");

        //Inisisasi LimasPersegiPanjang
        LimasPersegiPanjang LimasPersegiPanjang = new LimasPersegiPanjang(4,6,8);
        LimasPersegiPanjang.hitungVolume();
        LimasPersegiPanjang.hitungLuasPermukaan();

        System.out.println("");

        //inisiasi Bola
        Bola bola = new Bola(7);
        bola.hitungVolume();
        bola.hitungLuasPermukaan();

        System.out.println("");

        //Insiasi Tabung
        Tabung tabung = new Tabung(7, 10);
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();

        System.out.println("");

        //Inisiasi Kerucut
        Kerucut kerucut = new Kerucut(7, 10);
        kerucut.hitungVolume();
        kerucut.hitungLuasPermukaan();

        System.out.println("");

        //Inisiasi JuringBola
        JuringBola juringBola = new JuringBola(7,180);
        juringBola.hitungVolume();
        juringBola.hitungLuasPermukaan();

        System.out.println("");
        LimasSegitiga limasSegitiga = new LimasSegitiga(5,10,6,6, 6, 12);
        limasSegitiga.hitungVolume();
        limasSegitiga.hitungLuasPermukaan();

        System.out.println("");
        PrismaSegitiga prismaSegiTiga = new PrismaSegitiga(5,6,5,5,5, 8);
        prismaSegiTiga.hitungVolume();
        prismaSegiTiga.hitungLuasPermukaan();

        System.out.println("");
        LimasBelahKetupat LimasBelahKetupat = new LimasBelahKetupat(6, 4, 8);
        LimasBelahKetupat.hitungVolume();
        LimasBelahKetupat.hitungLuasPermukaan();

        System.out.println("");
        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung (6,3,2);
        kerucutTerpancung.hitungVolume();
        kerucutTerpancung.hitungLuasPermukaan();

        System.out.println("");
        TemberengBola temberengBola = new TemberengBola(7, 3);
        temberengBola.hitungVolume();
        temberengBola.hitungLuasPermukaan();

        System.out.println("");
        TemberengBola TemberengBola = new TemberengBola(7, 3); // contoh: jari-jari = 7, tinggi = 3
        TemberengBola.hitungVolume();
        TemberengBola.hitungLuasPermukaan();

    }
}