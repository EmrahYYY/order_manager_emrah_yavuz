package service;

public class Products {
    int id, order_id, amount, price_per_unit;
    String product_name;


    public Products(int id, int order_id, int amount, int price_per_unit, String product_name) {
        this.id = id;
        this.order_id = order_id;
        this.amount = amount;
        this.price_per_unit = price_per_unit;
        this.product_name = product_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(int price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", amount=" + amount +
                ", price_per_unit=" + price_per_unit +
                ", product_name='" + product_name + '\'' +
                '}';
    }
}
