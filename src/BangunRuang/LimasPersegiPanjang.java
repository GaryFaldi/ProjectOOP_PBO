package BangunRuang;

import BangunDatar.PersegiPanjang;

public class LimasPersegiPanjang extends BangunRuang {
    private final PersegiPanjang alas;
    private final double tinggiLimas;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas) {
        super("Limas Persegi Panjang");
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        // Volume = (1/3) * luas alas * tinggi
        return (1.0 / 3.0) * alas.hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan = luas alas + jumlah luas 4 sisi tegak
        double panjang = alas.getPanjang();
        double lebar = alas.getLebar();

        // Asumsikan sisi tegak berbentuk segitiga dengan tinggi sama (tinggiLimas)
        double luasSegitigaDepanBelakang = 2 * (0.5 * panjang * tinggiLimas);
        double luasSegitigaSamping = 2 * (0.5 * lebar * tinggiLimas);

        return alas.hitungLuas() + luasSegitigaDepanBelakang + luasSegitigaSamping;
    }
}
