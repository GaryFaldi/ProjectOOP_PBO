package BangunRuang;

import BangunDatar.Lingkaran;

public class KerucutTerpancung extends Kerucut {
    private final Lingkaran alasKecil;
    private final double tinggi;

    public KerucutTerpancung(double jariJariAlasBesar, double jariJariAlasKecil, double tinggi) {
        super(jariJariAlasBesar, tinggi); // panggil konstruktor Kerucut untuk alas besar dan tinggi total
        this.alasKecil = new Lingkaran(jariJariAlasKecil); // has-a Lingkaran kecil
        this.tinggi = tinggi;
        this.nama = "Kerucut Terpancung";
    }

    public double getJariJariAtas() {
        return alasKecil.getJariJari();
    }

    public double getJariJariBawah() {
        return super.getJariJari(); // dari alas besar (superclass Kerucut)
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        double r1 = getJariJariBawah();
        double r2 = getJariJariAtas();
        double t = getTinggi();
        return (1.0 / 3.0) * Math.PI * t * (r1 * r1 + r1 * r2 + r2 * r2);
    }

    @Override
    public double hitungLuasPermukaan() {
        double r1 = getJariJariBawah();
        double r2 = getJariJariAtas();
        double t = getTinggi();
        double s = Math.sqrt((r1 - r2) * (r1 - r2) + t * t); // garis pelukis

        return Math.PI * (r1 + r2) * s + Math.PI * (r1 * r1 + r2 * r2);
    }
}
