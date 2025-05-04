package BangunRuang;

import BangunDatar.PersegiPanjang;

public class PrismaPersegiPanjang extends BangunRuang {
    private final PersegiPanjang alas;
    private final double tinggiPrisma;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super("Prisma Persegi Panjang");
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double p = alas.getPanjang();
        double l = alas.getLebar();
        double t = tinggiPrisma;
        return 2 * (p * l + p * t + l * t);
    }
}
