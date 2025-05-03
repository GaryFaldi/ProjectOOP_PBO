package BangunDatar;

public class JuringLingkaran extends Lingkaran {
    private double sudutDerajat;

    public JuringLingkaran(double jariJari, double sudutDerajat) {
        super(jariJari); // Panggil constructor Lingkaran
        this.nama = "Juring Lingkaran"; // Ubah nama karena sekarang ini Juring
        this.sudutDerajat = sudutDerajat;
    }

    @Override
    public double hitungLuas() {
        return (sudutDerajat / 360.0) * super.hitungLuas(); // Luas Juring
    }

    @Override
    public double hitungKeliling() {
        double panjangBusur = (sudutDerajat / 360.0) * super.hitungKeliling();
        return panjangBusur + 2 * jariJari;
    }
}
