package BangunRuang;

import BangunDatar.Trapesium;
import BangunDatar.Segitiga;

public class LimasTrapesium extends BangunRuang {
    private final Trapesium alas;
    private final Segitiga sisiTegak1;
    private final Segitiga sisiTegak2;
    private final Segitiga sisiTegak3;
    private final Segitiga sisiTegak4;

    public LimasTrapesium(double sisiAtas, double sisiBawah, double tinggiTrapesium,
                          double sisiMiring1, double sisiMiring2,
                          double alasSegitiga1, double tinggiSegitiga1,
                          double alasSegitiga2, double tinggiSegitiga2,
                          double alasSegitiga3, double tinggiSegitiga3,
                          double alasSegitiga4, double tinggiSegitiga4) {
        super("Limas Trapesium");
        this.alas = new Trapesium(sisiAtas, sisiBawah, tinggiTrapesium, sisiMiring1, sisiMiring2);
        this.sisiTegak1 = new Segitiga(alasSegitiga1, tinggiSegitiga1, alasSegitiga1, tinggiSegitiga1, Math.sqrt(Math.pow(alasSegitiga1 / 2, 2) + Math.pow(tinggiSegitiga1, 2)));
        this.sisiTegak2 = new Segitiga(alasSegitiga2, tinggiSegitiga2, alasSegitiga2, tinggiSegitiga2, Math.sqrt(Math.pow(alasSegitiga2 / 2, 2) + Math.pow(tinggiSegitiga2, 2)));
        this.sisiTegak3 = new Segitiga(alasSegitiga3, tinggiSegitiga3, alasSegitiga3, tinggiSegitiga3, Math.sqrt(Math.pow(alasSegitiga3 / 2, 2) + Math.pow(tinggiSegitiga3, 2)));
        this.sisiTegak4 = new Segitiga(alasSegitiga4, tinggiSegitiga4, alasSegitiga4, tinggiSegitiga4, Math.sqrt(Math.pow(alasSegitiga4 / 2, 2) + Math.pow(tinggiSegitiga4, 2)));
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * alas.hitungLuas() * ((sisiTegak1.getTinggi() + sisiTegak2.getTinggi() + sisiTegak3.getTinggi() + sisiTegak4.getTinggi()) / 4.0);
    }

    @Override
    public double hitungLuasPermukaan() {
        return alas.hitungLuas() + sisiTegak1.hitungLuas() + sisiTegak2.hitungLuas() + sisiTegak3.hitungLuas() + sisiTegak4.hitungLuas();
    }
}
