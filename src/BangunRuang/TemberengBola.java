package BangunRuang;

import BangunDatar.Lingkaran;

public class TemberengBola extends Bola {
    private final Lingkaran lingkaran;
    private final double tinggi;

    public TemberengBola(double jariJari, double tinggi) {
        super(jariJari); // Panggil konstruktor Bola (superclass)
        this.nama = "Tembereng Bola";
        this.lingkaran = new Lingkaran(jariJari); // Has-a Lingkaran
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Volume Tembereng Bola (Spherical Cap)
        double r = lingkaran.getJariJari();
        return (1.0 / 3.0) * Math.PI * tinggi * tinggi * (3 * r - tinggi);
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan Tembereng Bola (tanpa dasar)
        double r = lingkaran.getJariJari();
        return 2 * Math.PI * r * tinggi;
    }
}
