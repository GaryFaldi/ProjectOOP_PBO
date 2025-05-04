package BangunRuang;

import BangunDatar.JajaranGenjang;
import BangunDatar.Segitiga;

public class LimasJajaranGenjang extends BangunRuang {
    private final JajaranGenjang alas;
    private final Segitiga sisiTegak1;
    private final Segitiga sisiTegak2;
    private final Segitiga sisiTegak3;
    private final Segitiga sisiTegak4;

    public LimasJajaranGenjang(
            double alasJG, double tinggiJG, double sisiMiring,
            double alasSisi, double tinggiSisi
    ) {
        super("Limas Jajaran Genjang");
        this.alas = new JajaranGenjang(alasJG, tinggiJG, sisiMiring);

        // Misalnya sisi tegak berbentuk segitiga sama dan alasnya = sisi jajargenjang
        this.sisiTegak1 = new Segitiga(alasSisi, tinggiSisi, alasSisi, alasSisi, alasSisi);
        this.sisiTegak2 = new Segitiga(alasSisi, tinggiSisi, alasSisi, alasSisi, alasSisi);
        this.sisiTegak3 = new Segitiga(alasSisi, tinggiSisi, alasSisi, alasSisi, alasSisi);
        this.sisiTegak4 = new Segitiga(alasSisi, tinggiSisi, alasSisi, alasSisi, alasSisi);
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * alas.hitungLuas() * sisiTegak1.getTinggi();
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan = luas alas + jumlah luas sisi tegak
        return alas.hitungLuas()
                + sisiTegak1.hitungLuas()
                + sisiTegak2.hitungLuas()
                + sisiTegak3.hitungLuas()
                + sisiTegak4.hitungLuas();
    }
}
