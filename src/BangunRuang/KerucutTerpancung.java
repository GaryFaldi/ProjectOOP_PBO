package BangunRuang;

import BangunDatar.Lingkaran;

public class KerucutTerpancung extends Kerucut {
    private final Lingkaran alasKecil;
    private final double tinggi;

    public KerucutTerpancung(double jariJariAlasBesar, double jariJariAlasKecil, double tinggi) {
        super(jariJariAlasBesar, tinggi); // panggil konstruktor Kerucut
        this.alasKecil = new Lingkaran(jariJariAlasKecil); // alas atas
        this.tinggi = tinggi;
        this.nama = "Kerucut Terpancung";
    }

    @Override
    public double hitungVolume() {
        double r1 = super.alas.getJariJari(); // jari-jari alas besar
        double r2 = alasKecil.getJariJari();  // jari-jari alas kecil
        return (1.0 / 3.0) * Math.PI * tinggi * (r1 * r1 + r1 * r2 + r2 * r2);
    }

    @Override
    public double hitungLuasPermukaan() {
        double r1 = super.alas.getJariJari(); // jari-jari alas besar
        double r2 = alasKecil.getJariJari();  // jari-jari alas kecil
        double s = Math.sqrt((r1 - r2) * (r1 - r2) + tinggi * tinggi); // garis pelukis

        return Math.PI * (r1 + r2) * s + Math.PI * (r1 * r1 + r2 * r2);
    }
}
