package BangunRuang;

import BangunDatar.Persegi;
import BangunDatar.Segitiga;

public class LimasPersegi extends BangunRuang {
    private final Persegi alas;
    private final Segitiga sisiTegak;

    public LimasPersegi(double sisiAlas, double tinggiSisiTegak) {
        super("Limas Persegi");
        this.alas = new Persegi(sisiAlas);
        this.sisiTegak = new Segitiga(sisiAlas, tinggiSisiTegak, sisiAlas, sisiAlas, sisiAlas ); // sisi-sisinya disamakan
    }

    @Override
    public double hitungVolume() {
        double luasAlas = alas.hitungLuas();
        double tinggiLimas = sisiTegak.getTinggi();
        return (1.0 / 3.0) * luasAlas * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        return alas.hitungLuas() + 4 * sisiTegak.hitungLuas();
    }
}
