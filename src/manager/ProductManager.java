package manager;


import entity.Client;
import entity.Product;
import java.util.Scanner;


public class ProductManager {
    private final Scanner scanner;
    
    public ProductManager() {
        this.scanner = new Scanner(System.in);
    }

    public Product addProduct() {
        Product product = new Product();
        System.out.println("Insert product name");
        product.setProductName(scanner.nextLine());
        System.out.println("Enter the price of the product");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Quantity of goods");
        product.setQuantity(scanner.nextInt());
        scanner.nextLine();
        return product;
    }
    public void printListProducts(Product[] products){
        System.out.println("Products: ");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf(i+1+". "+product.getProductName()+" "+product.getPrice()+" price "+product.getQuantity()+" quantity ");
        }
        System.out.println();
    }
    public Product createProduct(String productName,int priceProduct){
        Product product = new Product();
        product.setProductName(productName);
        product.setPrice(priceProduct);
        return product;
    }
    public void buyProduct(Client[] clients, Product[] products){
        System.out.println(" ");
        int buy1 = scanner.nextInt();
        System.out.println("Product list: ");
        for(int j = 0; j< products.length; j++){
            Product product;
            product = products[j];
            System.out.println(j+1+". "+product.getProductName()+" "+product.getPrice()+" price "+product.getQuantity()+" quantity ");
        }
        int buy2 = scanner.nextInt();
        int pur = clients[buy1-1].getBalance() - products[buy2-1].getPrice();
        clients[buy1-1].setBalance(pur);
        System.out.println("Account balance "+pur);
    }
}