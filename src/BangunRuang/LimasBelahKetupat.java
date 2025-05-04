package BangunRuang;

import BangunDatar.BelahKetupat;
import BangunDatar.Segitiga;

public class LimasBelahKetupat extends BangunRuang {
    private final BelahKetupat alas;
    private final Segitiga sisiTegak;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double tinggiSegitiga) {
        super("Limas Belah Ketupat");
        this.alas = new BelahKetupat(diagonal1, diagonal2, 0);
        double sisiAlas = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
        this.sisiTegak = new Segitiga(sisiAlas, tinggiSegitiga, sisiAlas, sisiAlas, sisiAlas);
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * alas.hitungLuas() * sisiTegak.getTinggi();
    }

    @Override
    public double hitungLuasPermukaan() {
        return alas.hitungLuas() + 4 * sisiTegak.hitungLuas();
    }
}
