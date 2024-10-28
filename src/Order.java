import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void tambahItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public int hitungTotalOrder() {
        int total = 0;
        for (MenuItem item : items) {
            total += item.hitungTotal();
        }
        return total;
    }

    public void tampilkanOrder() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total Harga: Rp" + hitungTotalOrder());
    }
}
