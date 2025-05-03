package BangunRuang;

import BangunDatar.Segitiga;

public class LimasSegitiga extends BangunRuang {
    private final Segitiga alas;
    private final double tinggiLimas; // tinggi limas, bukan tinggi segitiga

    public LimasSegitiga(double alasSegitiga, double tinggiSegitiga,
                         double sisiA, double sisiB, double sisiC,
                         double tinggiLimas) {
        super("Limas Segitiga");
        this.alas = new Segitiga(alasSegitiga, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * alas.hitungLuas() * tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasSisiTegak1 = 0.5 * alas.getSisiA() * tinggiLimas;
        double luasSisiTegak2 = 0.5 * alas.getSisiB() * tinggiLimas;
        double luasSisiTegak3 = 0.5 * alas.getSisiC() * tinggiLimas;

        return alas.hitungLuas() + luasSisiTegak1 + luasSisiTegak2 + luasSisiTegak3;
    }

}
