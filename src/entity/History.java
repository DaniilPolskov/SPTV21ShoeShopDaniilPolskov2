package entity;

public class History {
    private Product product;
    private Client client;
    private History History;

    public History() {
    }

    public Product product() {
        return product;
    }

    public History setProduct(Product product) {
        this.product = product;
        return this;
    }

    public Client client() {
        return client;
    }

    public History setBuyer(Client client) {
        this.client = client;
        return this;
    }



    @Override
    public String toString() {
        return "History{" +
                "product=" + product +
                "client=" + client +
                '}';
    }
}
