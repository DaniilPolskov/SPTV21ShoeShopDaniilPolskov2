/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Client;
import entity.History;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HistoryManager {
    private final Scanner scanner;
    private History History;

    public HistoryManager() {
        scanner = new Scanner(System.in);
    }
    
    public History takeOnProduct(Product[] products, Client[] clients) {
        System.out.println("List registered clients:");
        for (int i = 0; i < clients.length; i++) {
        System.out.println(i+1+". "+clients[i].getFirstname()+" "+clients[i].getLastname());
    }
        return History;
    }
}