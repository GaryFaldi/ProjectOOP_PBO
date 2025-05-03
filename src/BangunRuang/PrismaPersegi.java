package BangunRuang;

import BangunDatar.Persegi;

public class PrismaPersegi extends BangunRuang {
    private final Persegi alas;      // has-a Persegi
    private final double tinggiPrisma;

    public PrismaPersegi(double sisi, double tinggiPrisma) {
        super("Prisma Persegi");
        this.alas = new Persegi(sisi); // komposisi
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double kelilingAlas = alas.hitungKeliling();
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }
}
