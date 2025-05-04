package BangunRuang;

import BangunDatar.BelahKetupat;

public class PrismaBelahKetupat extends BangunRuang {
    private final BelahKetupat alas;
    private final double tinggi;

    public PrismaBelahKetupat(double diagonal1, double diagonal2, double tinggiPrisma) {
        super("Prisma Belah Ketupat");
        this.alas = new BelahKetupat(diagonal1, diagonal2, 0);
        this.tinggi = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        //double sisi = alas.hitungKeliling() / 4; // karena belah ketupat memiliki 4 sisi sama
        return (2 * alas.hitungLuas()) + (4 * alas.getSisi() * tinggi);
    }
}
