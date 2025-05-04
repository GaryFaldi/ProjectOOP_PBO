package BangunDatar;

public class LayangLayang extends BangunDatar {
    private double diagonal1;
    private double diagonal2;
    private double sisiPendek;
    private double sisiPanjang;

    public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
        super("Layang-Layang");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiPendek + sisiPanjang);
    }

    public double getDiagonal1() { return diagonal1; }
    public double getDiagonal2() { return diagonal2; }
    public double getSisiPendek() { return sisiPendek; }
    public double getSisiPanjang() { return sisiPanjang; }
}
