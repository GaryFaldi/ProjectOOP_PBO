package BangunDatar;

public class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;
    private double sisiMiringKiri;
    private double sisiMiringKanan;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiMiringKiri, double sisiMiringKanan) {
        super("Trapesium");
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiMiringKiri = sisiMiringKiri;
        this.sisiMiringKanan = sisiMiringKanan;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiAtas + sisiBawah + sisiMiringKiri + sisiMiringKanan;
    }
}
