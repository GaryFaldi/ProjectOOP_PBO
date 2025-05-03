package BangunRuang;

import BangunDatar.Lingkaran;

public class Bola extends BangunRuang {
    private final Lingkaran lingkaran;

    public Bola(double jariJari) {
        super("Bola");
        this.lingkaran = new Lingkaran(jariJari);
    }

    @Override
    public double hitungVolume() {
        double r = lingkaran.getJariJari();
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = lingkaran.getJariJari();
        return 4 * Math.PI * r * r;
    }

}
