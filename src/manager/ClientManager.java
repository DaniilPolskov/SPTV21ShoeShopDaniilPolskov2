package manager;

import entity.Client;
import entity.Product;
import java.util.Scanner;

public class ClientManager{
    private final Scanner scanner = new Scanner(System.in);
        private Client[] clients;

    public Client createClient(){
        Client client = new Client();
        System.out.println("Insert name: ");
        client.setFirstname(scanner.nextLine());
        System.out.println("Insert surname: ");
        client.setLastname(scanner.nextLine());
        System.out.println("Insert balance: ");
        client.setBalance(scanner.nextInt());
        scanner.nextLine();
        return client;
    }

    public void printListClients(Client[] clients) {
        System.out.println("Client list:");
        for (int i = 0; i < clients.length; i++) {
            Client client = clients[i];
            System.out.print(i+1+". "+"Firstname: "+client.getFirstname()+" Lastname: "+client.getLastname()+" Balance: "+client.getBalance()+" ");
        }
    }
     
    public void addMoney(Client[] clients){
        System.out.println("Select client");
        printListClients(clients);
        int turn = scanner.nextInt(); scanner.nextLine();
        System.out.println("How much money?");
        int addMoney = scanner.nextInt(); scanner.nextLine();
        int TotalMoney = clients[turn -1].getBalance()+ addMoney;
        clients[turn-1].setBalance(TotalMoney);
        System.out.println(TotalMoney+" $");
        }
    
}