package BangunRuang;

import BangunDatar.Lingkaran;
import BangunDatar.Segitiga;

public class Kerucut extends BangunRuang {
    private final Lingkaran alas;
    private final Segitiga tinggi;

    public Kerucut(double jariJari, double tinggi) {
        super("Kerucut");
        this.alas = new Lingkaran(jariJari);
        this.tinggi = new Segitiga(0, tinggi, 0, 0, 0); // has-a Segitiga (alasnya 0, karena kita hanya butuh tinggi)
    }

    @Override
    public double hitungVolume() {
        double r = alas.getJariJari();
        double t = tinggi.getTinggi();
        return (1.0 / 3.0) * Math.PI * r * r * t;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = alas.getJariJari();
        double t = tinggi.getTinggi();
        double s = Math.sqrt(r * r + t * t); // garis pelukis
        return Math.PI * r * (r + s);
    }

    public double getJariJari() { return alas.getJariJari();}
}
