package BangunRuang;

import BangunDatar.Lingkaran;

public class JuringBola extends Bola {
    private final double tinggi; // tinggi juring dari dasar ke puncak lengkung
    private final Lingkaran alasLingkaran;

    public JuringBola(double jariJari, double tinggi) {
        super(jariJari);
        this.nama = "Juring Bola";
        this.tinggi = tinggi;
        this.alasLingkaran = new Lingkaran(jariJari); // Has-a
    }

    @Override
    public double hitungVolume() {
        double r = alasLingkaran.getJariJari();
        return (2.0 / 3.0) * Math.PI * r * r * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = alasLingkaran.getJariJari();
        double A1 = 2 * Math.PI * r * tinggi;           // bagian lengkung
        double A2 = alasLingkaran.hitungLuas();         // alas datar (lingkaran)
        return A1 + A2;
    }
}
