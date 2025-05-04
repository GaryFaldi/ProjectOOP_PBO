package BangunRuang;

import BangunDatar.LayangLayang;

public class PrismaLayangLayang extends BangunRuang {
    private final LayangLayang alas;
    private final double tinggi;

    public PrismaLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
        super("Prisma Layang-Layang");
        this.alas = new LayangLayang(diagonal1, diagonal2, sisiPendek, sisiPanjang);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * alas.hitungLuas() + 2 * (alas.getSisiPendek() + alas.getSisiPanjang()) * tinggi;
    }
}
