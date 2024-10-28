public class MenuItem {
    private String nama;
    private int harga;
    private int jumlah;

    public MenuItem(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return nama + " x" + jumlah + " - Rp" + hitungTotal();
    }
}
