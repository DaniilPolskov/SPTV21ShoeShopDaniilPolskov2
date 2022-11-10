package entity;

import java.util.Arrays;

public class Product {
    private String productName;
    private Client[] clients;
    private int quantity;
    private int priceProduct;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return priceProduct;
    }

    public void setPrice(int price) {
        this.priceProduct = price;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName= productName;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setAuthors(Client[] clients) {
        this.clients = clients;
    }

    public void addClient(Client client){
        Client[] newClient = Arrays.copyOf(clients, clients.length+1);
        newClient[newClient.length-1] = client;
        this.clients = newClient;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", clients=" + Arrays.toString(clients) +
                ", quantity='" + quantity + '\'' +
                ", price=" + priceProduct +
                '}';
    }
}