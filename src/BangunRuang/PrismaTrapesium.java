package BangunRuang;

import BangunDatar.Trapesium;

public class PrismaTrapesium extends BangunRuang {
    private final Trapesium alas;
    private final double tinggiPrisma;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double tinggiTrapesium, double sisiMiring1, double sisiMiring2, double tinggiPrisma) {
        super("Prisma Trapesium");
        this.alas = new Trapesium(sisiAtas, sisiBawah, tinggiTrapesium, sisiMiring1, sisiMiring2);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * alas.hitungLuas() + alas.hitungKeliling() * tinggiPrisma;
    }
}
