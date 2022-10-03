public class ShoppingCart {
    private int id;
    private Products[] products;
    private String customerName;
    private int coupon;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Products[] getProducts() {
        return products;
    }
    public void setProducts(Products[] products) {
        this.products = products;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCoupon() {
        return coupon;
    }
    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }
}
