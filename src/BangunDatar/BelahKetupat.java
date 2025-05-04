package BangunDatar;

public class BelahKetupat extends BangunDatar {
    private double diagonal1;
    private double diagonal2;
    private double sisi;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        super("Belah Ketupat");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal1() { return diagonal1; }
    public double getDiagonal2() { return diagonal2; }
    public double getSisi() { return sisi; }
}
