public class MenuItem {

    // Declare menu items and prices
    private String cafeitem;
    private double price;

    // Setter object
    public MenuItem(String cafeitem, double price) {
        this.cafeitem = cafeitem;
        this.price = price;
    }

    // Get method for name of items
    public String getcafeitem() {
        return cafeitem;
    }

    // Get method for prices
    public double getprice() {
        return price;
    }
}