package BangunDatar;

import BangunGeometri.Bangun;

public abstract class BangunDatar implements Bangun {
    protected String nama;  // Semua bangun datar pasti punya nama

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}

