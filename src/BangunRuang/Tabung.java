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

    public double getJariJari() {
        return alas.getJariJari();
    }

    @Override
    public double hitungVolume() {
        double r = getJariJari();
        return Math.PI * r * r * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = getJariJari();
        return 2 * Math.PI * r * (r + tinggi);
    }
}
