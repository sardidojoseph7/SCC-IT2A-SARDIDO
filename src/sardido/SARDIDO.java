package sardido;

import java.util.Scanner;

public class SARDIDO {

    
    public static void main(String[] args) {
        
        // GRADES //
        
           Grade gr = new Grade();
           gr.genGrade();
      
        // PRODUCT //
        
         //   Product pr = new Product();
         //   pr.Product();

         
            // ACCOUNT //
/*
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
*/

    }
}
    