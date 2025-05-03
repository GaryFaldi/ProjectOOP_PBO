package BangunRuang;

import BangunGeometri.Bangun;

public abstract class BangunRuang implements Bangun {
    protected String nama;  // Sama, semua bangun ruang pasti punya nama

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
}

