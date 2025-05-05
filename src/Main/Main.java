package Main;

import BangunDatar.*;
import BangunRuang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ Bangun Datar ===================");

        // Memanggil kelas Segitiga
        BangunDatar Segitiga = new Segitiga(5, 8, 5, 5, 5);
        Segitiga.hitungLuas();
        Segitiga.hitungKeliling();

        // Memanggil kelas Persegi
        BangunDatar Persegi = new Persegi(4);
        Persegi.hitungLuas();
        Persegi.hitungKeliling();

        // Memanggil kelas PersegiPanjang
        BangunDatar PersegiPanjang = new PersegiPanjang(4, 6);
        PersegiPanjang.hitungLuas();
        PersegiPanjang.hitungKeliling();

        // Memanggil kelas JajaranGenjang
        BangunDatar JajaranGenjang = new JajaranGenjang(5, 7, 6);
        JajaranGenjang.hitungLuas();
        JajaranGenjang.hitungKeliling();

        // Memanggil kelas Trapesium
        BangunDatar Trapesium = new Trapesium(4, 6, 5, 6, 6);
        Trapesium.hitungLuas();
        Trapesium.hitungKeliling();

        // Memanggil kelas BelahKetupat
        BangunDatar BelahKetupat = new BelahKetupat(4, 4, 4);
        BelahKetupat.hitungLuas();
        BelahKetupat.hitungKeliling();

        // Memanggil kelas LayangLayang
        BangunDatar LayangLayang = new LayangLayang(3, 4, 5, 6);
        LayangLayang.hitungLuas();
        LayangLayang.hitungKeliling();

        // Memanggil kelas Lingkaran
        BangunDatar Lingkaran = new Lingkaran(7);
        Lingkaran.hitungLuas();
        Lingkaran.hitungKeliling();

        // Memanggil kelas TemberengLingkaran
        BangunDatar TemberengLingkaran = new TemberengLingkaran(7, 60);
        TemberengLingkaran.hitungLuas();
        TemberengLingkaran.hitungKeliling();

        // Memanggil kelas JuringLingkaran
        BangunDatar JuringLingkaran = new JuringLingkaran(7, 90);
        JuringLingkaran.hitungLuas();
        JuringLingkaran.hitungKeliling();

        System.out.println("");
        System.out.println("================ Bangun Ruang ===================");
        System.out.println("");

        // Memanggil kelas PrismaSegitiga
        BangunRuang PrismaSegitiga = new PrismaSegitiga(5, 8, 10, 10, 10, 9);
        PrismaSegitiga.hitungVolume();
        PrismaSegitiga.hitungLuasPermukaan();

        // Memanggil kelas LimasSegitiga
        BangunRuang LimasSegitiga = new LimasSegitiga(5, 8, 10, 10, 10, 9);
        LimasSegitiga.hitungVolume();
        LimasSegitiga.hitungLuasPermukaan();

        // Memanggil kelas PrismaPersegi
        BangunRuang PrismaPersegi = new PrismaPersegi(4, 10);
        PrismaPersegi.hitungVolume();
        PrismaPersegi.hitungLuasPermukaan();

        // Memanggil kelas LimasPersegi
        BangunRuang LimasPersegi = new LimasPersegi(4, 10);
        LimasPersegi.hitungVolume();
        LimasPersegi.hitungLuasPermukaan();

        // Memanggil kelas PrismaPersegiPanjang
        BangunRuang PrismaPersegiPanjang = new PrismaPersegiPanjang(4, 6, 10);
        PrismaPersegiPanjang.hitungVolume();
        PrismaPersegiPanjang.hitungLuasPermukaan();

        // Memanggil kelas LimasPersegiPanjang
        BangunRuang LimasPersegiPanjang = new LimasPersegiPanjang(4, 6, 10);
        LimasPersegiPanjang.hitungVolume();
        LimasPersegiPanjang.hitungLuasPermukaan();

        // Memanggil kelas PrismaJajaranGenjang
        BangunRuang PrismaJajaranGenjang = new PrismaJajaranGenjang(5, 7, 6, 10);
        PrismaJajaranGenjang.hitungVolume();
        PrismaJajaranGenjang.hitungLuasPermukaan();

        // Memanggil kelas LimasJajaranGenjang
        BangunRuang LimasJajaranGenjang = new LimasJajaranGenjang(5, 7, 6, 10, 9);
        LimasJajaranGenjang.hitungVolume();
        LimasJajaranGenjang.hitungLuasPermukaan();

        // Memanggil kelas PrismaTrapesium
        BangunRuang PrismaTrapesium = new PrismaTrapesium(4, 6, 5, 10, 6, 6);
        PrismaTrapesium.hitungVolume();
        PrismaTrapesium.hitungLuasPermukaan();

        // Memanggil kelas LimasTrapesium
        BangunRuang LimasTrapesium = new LimasTrapesium(4, 6, 5, 10, 10, 9, 9,8, 8, 8,8,8,8);
        LimasTrapesium.hitungVolume();
        LimasTrapesium.hitungLuasPermukaan();

        // Memanggil kelas PrismaBelahKetupat
        BangunRuang PrismaBelahKetupat = new PrismaBelahKetupat(4, 6, 10);
        PrismaBelahKetupat.hitungVolume();
        PrismaBelahKetupat.hitungLuasPermukaan();

        // Memanggil kelas LimasBelahKetupat
        BangunRuang LimasBelahKetupat = new LimasBelahKetupat(4, 6, 10);
        LimasBelahKetupat.hitungVolume();
        LimasBelahKetupat.hitungLuasPermukaan();

        // Memanggil kelas PrismaLayangLayang
        BangunRuang PrismaLayangLayang = new PrismaLayangLayang(3, 4, 5, 10, 4);
        PrismaLayangLayang.hitungVolume();
        PrismaLayangLayang.hitungLuasPermukaan();

        // Memanggil kelas LimasLayangLayang
        BangunRuang LimasLayangLayang = new LimasLayangLayang(3, 4, 5, 10, 4, 4);
        LimasLayangLayang.hitungVolume();
        LimasLayangLayang.hitungLuasPermukaan();

        // Memanggil kelas Tabung
        BangunRuang Tabung = new Tabung(7, 10);
        Tabung.hitungVolume();
        Tabung.hitungLuasPermukaan();

        // Memanggil kelas Kerucut
        BangunRuang Kerucut = new Kerucut(7, 10);
        Kerucut.hitungVolume();
        Kerucut.hitungLuasPermukaan();

        // Memanggil kelas KerucutTerpancung
        BangunRuang KerucutTerpancung = new KerucutTerpancung(7, 10, 5);
        KerucutTerpancung.hitungVolume();
        KerucutTerpancung.hitungLuasPermukaan();

        // Memanggil kelas Bola
        BangunRuang Bola = new Bola(7);
        Bola.hitungVolume();
        Bola.hitungLuasPermukaan();

        // Memanggil kelas TemberengBola
        BangunRuang TemberengBola = new TemberengBola(7, 60);
        TemberengBola.hitungVolume();
        TemberengBola.hitungLuasPermukaan();

        // Memanggil kelas JuringBola
        BangunRuang JuringBola = new JuringBola(7, 90);
        JuringBola.hitungVolume();
        JuringBola.hitungLuasPermukaan();

        // Memanggil kelas CincinBola
        BangunRuang CincinBola = new CincinBola(7, 10);
        CincinBola.hitungVolume();
        CincinBola.hitungLuasPermukaan();

    }
}