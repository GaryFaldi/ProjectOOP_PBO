package BangunDatar;

public class Segitiga extends BangunDatar {
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(double tinggi) {
        super("Segitiga");
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    public double getTinggi() { return tinggi; }
}
