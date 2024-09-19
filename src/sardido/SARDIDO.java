
package sardido;

import java.util.Scanner;

public class SARDIDO {

    
    public static void main(String[] args) {
        
        //     Grade gr = new Grade();
        //    gr.genGrade();
        //   Product pr = new Product();
        //   pr.addProduct(1011, 10, "Soap", 20);
        //   pr.viewProduct();
        //   Product pr1 = new Product();
        //   pr1.addProduct(1012, 50, "Cards", 0);
        //   pr1.viewProduct();
/*
        Scanner sc = new Scanner(System.in);
        Product[] pr = new Product[100];
        int nump, i;
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        int ttp = 0;
        for (i = 0; i < nump; i++ ){
        System.out.println("Enter details of product "+(i + 1)+": ");
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double pri = sc.nextDouble();
        System.out.print("Stock: ");
        int st = sc.nextInt();
        System.out.print("Sold: ");
        int sold = sc.nextInt();
        pr[i]= new Product();
        pr[i].addProduct(id, name, pri, st, sold);
        ttp = (int) (ttp + (pri * sold));
        }
        for (i = 0; i < nump; i++ ){
        pr[i].viewProduct();
        }
        System.out.println("Total Profit: "+ttp);
        System.out.println("Total TEP: "+ttp);
         */
                Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of accounts to register: ");
            int numberOfAccounts = scanner.nextInt();
            scanner.nextLine();
            
            Accounts accounts = new Accounts(numberOfAccounts);
            
            for (int i = 0; i < numberOfAccounts; i++) {
                System.out.println("Enter details for account " + (i + 1) + ":");
                
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();
                
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                
                System.out.print("Email: ");
                String email = scanner.nextLine();
                
                System.out.print("Username: ");
                String username = scanner.nextLine();
                
                String password;
                do {
                    System.out.print("Password: ");
                    password = scanner.nextLine();
                    if (!accounts.isPasswordValid(password)) {
                        System.out.println("Invalid password. Please try again.");
                    }
                } while (!accounts.isPasswordValid(password));
                
                Account newAccount = new Account(firstName, lastName, email, username, password);
                if (accounts.addAccount(newAccount)) {
                    System.out.println("Account added successfully.");
                } else {
                    System.out.println("Failed to add account due to duplicate information.");
                }
            }
            
            System.out.println("\nAll registered accounts:");
            accounts.viewAccounts();

            
            scanner.close();
        }
    }



    


