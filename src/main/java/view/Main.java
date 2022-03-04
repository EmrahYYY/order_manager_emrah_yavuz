package view;

import dao.ConnectionManager;
import service.Products;
import service.Table;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int caunt = 1;

    public static void main(String[] args) throws SQLException {


        ConnectionManager cm = new ConnectionManager();


        addOrder(cm);

       addProduct(cm);


        System.out.println("Showing an order  ***********************************************");

        ResultSet resultSet = cm.statement.executeQuery("SELECT * FROM order_table WHERE order_client like 'Patric'");

        List<Table> tables = new ArrayList<>();

        printListOrder(resultSet, tables);

        System.out.println("Show a list of orders not sent  ***********************************************");

        ResultSet resultSet2 = cm.statement.executeQuery("SELECT * FROM order_table WHERE is_send like false ");

        List<Table> tables2 = new ArrayList<>();

        printListOrder(resultSet2, tables2);


        System.out.println(" Update 1 order that has not been sent, to sent  ***********************************************");

        try {


            cm.statement.execute("UPDATE order_table\n" +
                    "        SET is_send = true\n" +
                    "        WHERE order_client = 'Manuel'");


            ResultSet resultSet3 = cm.statement.executeQuery("SELECT * order_table where order_client = 'Manuel'");

            List<Table> tables3 = new ArrayList<>();

            printListOrder(resultSet3, tables3);


        } catch (Exception e) {
        } finally {

            cm.statement.close();

        }


        System.out.println(" Delete the last order and it's products ***********************************************");

        try {


            cm.statement.execute("DELETE  FROM order_products WHERE id = 56820" + " DELETE  FROM order_table WHERE id = 56820");

            System.out.println("SELECT * order_table where order_client = 'Manuel'".isEmpty());

        } catch (Exception e) {
        } finally {

            cm.statement.close();

        }


    }

    private static void addProduct(ConnectionManager cm) throws SQLException {
        PreparedStatement ps2 = cm.connection.prepareStatement("INSERT INTO order_products " +
                "( order_id, product_name , amount , price_per_unit )" +
                " VALUES (?,?,?,?)");
        ps2.setInt(1, 56864);
        ps2.setString(2, "Coca colaa");
        ps2.setInt(3, 55);
        ps2.setBigDecimal(4, null);

        ps2.executeUpdate();

        ps2.setInt(1, 56865);
        ps2.setString(2, "Fanta");
        ps2.setInt(3, 55);
        ps2.setBigDecimal(4, null);

        ps2.executeUpdate();
        ps2.setInt(1, 56866);
        ps2.setString(2, "Ayran");
        ps2.setInt(3, 55);
        ps2.setBigDecimal(4, null);

        ps2.executeUpdate();
        ps2.setInt(1, 56867);
        ps2.setString(2, "Sprite");
        ps2.setInt(3, 55);
        ps2.setBigDecimal(4, null);

        ps2.executeUpdate();
    }

    private static void addOrder(ConnectionManager cm) throws SQLException {

        PreparedStatement ps = cm.connection.prepareStatement("INSERT INTO order_table" +
                "(   order_number ,    order_client ,  " +
                "  order_delivery_address , order_delivery_postalcode,    order_delivery_city , " +
                "   is_vat_free  ,    is_send,    order_date )" +
                " VALUES (?,?,?,?,?,?,?,?)");

        ps.setString(1, "ORD-20222" + caunt++);
        ps.setString(2, "Patric");
        ps.setString(3, "Korte Straat");
        ps.setInt(4, 1);
        ps.setString(5, "Antwerp");
        ps.setBoolean(6, true);
        ps.setBoolean(7, true);
        ps.setDate(8, Date.valueOf("2022-01-04"));


        ps.executeUpdate();

        ps.setString(1, "ORD-20222" + caunt++);
        ps.setString(2, "Emrah");
        ps.setString(3, " korte Straat 2");
        ps.setInt(4, 1);
        ps.setString(5, "Brugge");
        ps.setBoolean(6, true);
        ps.setBoolean(7, true);
        ps.setDate(8, Date.valueOf("2022-01-04"));


        ps.executeUpdate();

        ps.setString(1, "ORD-20222" + caunt++);
        ps.setString(2, "Bart");
        ps.setString(3, "Korte Straat 16");
        ps.setInt(4, 1);
        ps.setString(5, "Brussel");
        ps.setBoolean(6, false);
        ps.setBoolean(7, false);
        ps.setDate(8, Date.valueOf("2022-01-04"));


        ps.executeUpdate();

        ps.setString(1, "ORD-20222" + caunt++);
        ps.setString(2, "Manuel");
        ps.setString(3, "korte Straat 2");
        ps.setInt(4, 1);
        ps.setString(5, "Gent");
        ps.setBoolean(6, false);
        ps.setBoolean(7, false);
        ps.setDate(8, Date.valueOf("2022-01-04"));


        ps.executeUpdate();


    }

    private static void printListProduct(ResultSet resultSet1, List<Products> products) throws SQLException {
        while (resultSet1.next()) {

            Products products1 = new Products(resultSet1.getInt("Id"), resultSet1.getInt("order_id"),
                    resultSet1.getInt("amount"), resultSet1.getInt("price_per_unit"),
                    resultSet1.getString("product_name"));

            products.add(products1);


        }
        products.forEach(System.out::println);
    }

    private static void printListOrder(ResultSet resultSet, List<Table> tables) throws SQLException {

        while (resultSet.next()) {

            Table table = new Table(resultSet.getInt("Id"), resultSet.getInt("order_delivery_postalcode"),
                    resultSet.getString("order_number"), resultSet.getString("order_client"),
                    resultSet.getString("order_delivery_address"), resultSet.getString("order_delivery_city"),
                    resultSet.getString("order_date"), resultSet.getBoolean("is_vat_free"), resultSet.getBoolean("is_send"));

            tables.add(table);
        }

        tables.forEach(System.out::println);
    }

}
