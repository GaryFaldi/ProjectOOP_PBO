package BangunRuang;

import BangunDatar.Segitiga;

public class PrismaSegitiga extends BangunRuang {
    private final Segitiga alas;
    private final double tinggiPrisma;

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitiga,
                          double sisiA, double sisiB, double sisiC,
                          double tinggiPrisma) {
        super("Prisma Segitiga");
        this.alas = new Segitiga(alasSegitiga, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        // Volume = luas alas * tinggi prisma
        return alas.hitungLuas() * tinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas permukaan = 2 * luas alas + keliling alas * tinggi prisma
        return (2 * alas.hitungLuas()) + (alas.hitungKeliling() * tinggiPrisma);
    }
}
