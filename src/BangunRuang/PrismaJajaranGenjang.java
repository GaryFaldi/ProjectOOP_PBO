package BangunRuang;

import BangunDatar.JajaranGenjang;

public class PrismaJajaranGenjang extends BangunRuang {
    private final JajaranGenjang alas;
    private final double tinggiPrisma;

    public PrismaJajaranGenjang(double alasJG, double tinggiJG, double sisiMiring, double tinggiPrisma) {
        super("Prisma Jajaran Genjang");
        this.alas = new JajaranGenjang(alasJG, tinggiJG, sisiMiring);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan = 2 * luas alas + keliling alas * tinggi prisma
        return (2 * alas.hitungLuas()) + (alas.hitungKeliling() * tinggiPrisma);
    }
}
