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

    public double getPanjang() {
        return alas.getPanjang();
    }

    public double getLebar() {
        return alas.getLebar();
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double p = getPanjang();
        double l = getLebar();
        double t = getTinggiPrisma();
        return 2 * (p * l + p * t + l * t);
    }
}
