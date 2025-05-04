package BangunRuang;

import BangunDatar.LayangLayang;
import BangunDatar.Segitiga;

public class LimasLayangLayang extends BangunRuang {
    private final LayangLayang alas;
    private final Segitiga sisiMiring1;
    private final Segitiga sisiMiring2;

    public LimasLayangLayang(double diagonal1, double diagonal2,
                             double sisiA, double sisiB,
                             double tinggiSisiMiring1, double tinggiSisiMiring2) {
        super("Limas Layang-Layang");

        this.alas = new LayangLayang(diagonal1, diagonal2, sisiA, sisiB);

        // Asumsikan sisiA dan sisiB adalah dua sisi segitiga tegak (sisi miring samping)
        this.sisiMiring1 = new Segitiga(sisiA, tinggiSisiMiring1, sisiA, sisiA, sisiA);
        this.sisiMiring2 = new Segitiga(sisiB, tinggiSisiMiring2, sisiB, sisiB, sisiB);
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * alas.hitungLuas() * ((sisiMiring1.getTinggi() + sisiMiring2.getTinggi()) / 2);
    }

    @Override
    public double hitungLuasPermukaan() {
        return alas.hitungLuas() + 2 * sisiMiring1.hitungLuas() + 2 * sisiMiring2.hitungLuas();
    }
}
