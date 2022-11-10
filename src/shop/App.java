package shop;


import entity.Client;
import entity.History;
import entity.Product;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import manager.ClientManager;
import manager.HistoryManager;
import manager.ProductManager;


public class App {
    private Product[] products;
    private Client[] clients;
    private History[] histories;    
    private final ClientManager ClientManager;
    private final ProductManager ProductManager;
    private HistoryManager HistoryManager;    

    public App() {
        this.products = new Product[0];
        this.clients = new Client[0];
        this.histories = new History[0];
        ClientManager = new ClientManager();
        ProductManager = new ProductManager();
        
    }

    public void run() throws ParseException{
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Task list: ");
            System.out.println("0. Exit");
            System.out.println("1. Add shoes");
            System.out.println("2. Product list");
            System.out.println("3. Add client");
            System.out.println("4. List of registered clients");
            System.out.println("5. Purchase by the buyer of goods");
            System.out.println("6. List registered clients");
            System.out.println("7. Add money to the buyer");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" ");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("0. Exit");
                    break;
                case 1:
                    System.out.println("1. Add shoes");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = ProductManager.addProduct();
                    break;
                case 2:
                    System.out.println("2. Product list");
                    ProductManager.printListProducts(products);
                    break;
                case 3:
                    System.out.println("3. Add client");
                    this.clients =  Arrays.copyOf(this.clients, this.clients.length+1);
                    this.clients[this.clients.length-1] = ClientManager.createClient();
                    break;
                case 4:
                    System.out.println("4. List of registered buyers");
                    ClientManager.printListClients(clients);
                    break;
                case 5:
                    System.out.println("5. Client buy a product");
                    ClientManager.printListClients(clients);
                    ProductManager.buyProduct(clients, products);
                    break;
                case 6:
                    System.out.println("6. Shop history");
                    addHistory(HistoryManager.takeOnProduct(products, clients));
                    break;
                case 7:
                    System.out.println("7. Adding money to a client:");
                    ClientManager.addMoney(clients);
                    break;
            }
            System.out.println(" ");
        }while(repeat);
        System.out.println("EXIT");
    }   
        private void addHistory(History histories) {
            this.histories = Arrays.copyOf(this.histories, this.histories.length+1);
            this.histories[this.histories.length - 1] = histories;   
        }
    }
