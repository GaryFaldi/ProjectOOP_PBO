package BangunRuang;

import BangunDatar.Lingkaran;

public class CincinBola extends Bola {
    private final Lingkaran lingkaranDalam;
    private final double jariJariLuar; // dari Bola (super)
    private final double jariJariDalam;

    public CincinBola(double jariJariLuar, double jariJariDalam) {
        super(jariJariLuar); // jari-jari luar untuk Bola
        this.nama = "Cincin Bola";
        this.jariJariLuar = jariJariLuar;
        this.jariJariDalam = jariJariDalam;
        this.lingkaranDalam = new Lingkaran(jariJariDalam); // Has-a Lingkaran dalam
    }

    public double hitungLuasCincin() {
        double luasLuar = Math.PI * jariJariLuar * jariJariLuar;
        double luasDalam = lingkaranDalam.hitungLuas();
        return luasLuar - luasDalam;
    }

    public double getJariJariDalam() {
        return jariJariDalam;
    }

    public Lingkaran getLingkaranDalam() {
        return lingkaranDalam;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Misal kita anggap luas permukaan cincin bola adalah selisih permukaan 2 bola
        double luasLuar = 4 * Math.PI * Math.pow(jariJariLuar, 2);
        double luasDalam = 4 * Math.PI * Math.pow(jariJariDalam, 2);
        return luasLuar - luasDalam;
    }

    @Override
    public double hitungVolume() {
        // Volume cincin bola = volume bola luar - volume bola dalam
        double volumeLuar = (4.0 / 3.0) * Math.PI * Math.pow(jariJariLuar, 3);
        double volumeDalam = (4.0 / 3.0) * Math.PI * Math.pow(jariJariDalam, 3);
        return volumeLuar - volumeDalam;
    }
}
