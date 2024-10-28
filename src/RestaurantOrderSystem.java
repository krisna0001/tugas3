public class RestaurantOrderSystem {
    private Order order;

    public RestaurantOrderSystem() {
        this.order = new Order();
    }

    public void tambahItemKeOrder(String nama, int harga, int jumlah) {
        MenuItem item = new MenuItem(nama, harga, jumlah);
        order.tambahItem(item);
    }

    public void cetakNota() {
        System.out.println("===== NOTA PEMESANAN =====");
        order.tampilkanOrder();
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        RestaurantOrderSystem system = new RestaurantOrderSystem();

        // Tambahkan item ke order
        system.tambahItemKeOrder("Nasi Goreng", 20000, 2);
        system.tambahItemKeOrder("Ayam Bakar", 30000, 1);
        system.tambahItemKeOrder("Teh Manis", 5000, 3);

        // Cetak nota
        system.cetakNota();
    }
}
