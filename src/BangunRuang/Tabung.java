package BangunRuang;

import BangunDatar.Lingkaran;

public class Tabung extends BangunRuang {
    private final Lingkaran alas;
    private final double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super("Tabung");
        this.alas = new Lingkaran(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        double r = alas.getJariJari();
        return Math.PI * r * r * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = alas.getJariJari();
        return 2 * Math.PI * r * (r + tinggi);
    }
}
