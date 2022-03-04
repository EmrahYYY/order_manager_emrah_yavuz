package service;

public class Table {

    int id, order_delivery_postalcode;
    String order_number, order_client, order_delivery_address, order_delivery_city, order_date;
    boolean is_vat_free, is_send;


    public Table(int id, int order_delivery_postalcode, String order_number, String order_client,
                 String order_delivery_address, String order_delivery_city, String order_date,
                 boolean is_vat_free, boolean is_send)
    {
        this.id = id;
        this.order_delivery_postalcode = order_delivery_postalcode;
        this.order_number = order_number;
        this.order_client = order_client;
        this.order_delivery_address = order_delivery_address;
        this.order_delivery_city = order_delivery_city;
        this.order_date = order_date;
        this.is_vat_free = is_vat_free;
        this.is_send = is_send;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_delivery_postalcode() {
        return order_delivery_postalcode;
    }

    public void setOrder_delivery_postalcode(int order_delivery_postalcode) {
        this.order_delivery_postalcode = order_delivery_postalcode;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getOrder_client() {
        return order_client;
    }

    public void setOrder_client(String order_client) {
        this.order_client = order_client;
    }

    public String getOrder_delivery_address() {
        return order_delivery_address;
    }

    public void setOrder_delivery_address(String order_delivery_address) {
        this.order_delivery_address = order_delivery_address;
    }

    public String getOrder_delivery_city() {
        return order_delivery_city;
    }

    public void setOrder_delivery_city(String order_delivery_city) {
        this.order_delivery_city = order_delivery_city;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public boolean isIs_vat_free() {
        return is_vat_free;
    }

    public void setIs_vat_free(boolean is_vat_free) {
        this.is_vat_free = is_vat_free;
    }

    public boolean isIs_send() {
        return is_send;
    }

    public void setIs_send(boolean is_send) {
        this.is_send = is_send;
    }


    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", order_delivery_postalcode=" + order_delivery_postalcode +
                ", order_number='" + order_number + '\'' +
                ", order_client='" + order_client + '\'' +
                ", order_delivery_address='" + order_delivery_address + '\'' +
                ", order_delivery_city='" + order_delivery_city + '\'' +
                ", order_date='" + order_date + '\'' +
                ", is_vat_free=" + is_vat_free +
                ", is_send=" + is_send +
                '}';
    }
}
