/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sardido;

import java.util.Scanner;

public class SARDIDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Grades gr = new Grades();
//        gr.getGrade();

     //   Product pr = new Product();
     //   pr.addProduct(1011, 10, "Soap", 20);
     //   pr.viewProduct();
        
     //   Product pr1 = new Product();
     //   pr1.addProduct(1012, 50, "Cards", 0);
     //   pr1.viewProduct();

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
 
     /*Scanner sc = new Scanner(System.in);
     Account[] acc = new Account[100];
       
        int no, i, id;

        System.out.print("Enter number of Accounts: ");
        no = sc.nextInt();

        for (i = 0; i < no; i++) {
            acc[i] = new Account();
         
            boolean identi;
            boolean email1;
            boolean username;
           
            System.out.println("Enter account Details " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                id = sc.nextInt();
                identi = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println(" - ID already exists. Try again -");
                } else {
                   
                    acc[i].id = id;
                    break;
                }
            }
           
            System.out.print("First Name: ");
            String fname = sc.next();
            System.out.print("Last Name: ");
            String lname = sc.next();
           
             while (true) {
                System.out.print("Email: ");
                String email = sc.next();
                email1 = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].email.equals(email)) {
                        email1 = true;
                        break;
                    }
                }

                if (email1) {
                    System.out.println(" - Email already exists. Try again -");
                } else {
                   
                    acc[i].email = email;
                    break;
                }
            }
           
             while (true) {
                System.out.print("Username: ");
                String user = sc.next();
                username = false;

               
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].username.equals(user)) {
                        username = true;
                        break;
                    }
                }

                if (username) {
                    System.out.println(" - Username already exists. Try again -");
                } else {
                   
                    acc[i].username = user;
                    break;
                }
            }
           
            boolean passValid = false;
           
            while (!passValid) {
                System.out.print("Password: ");
                String password = sc.next();

                if (acc[i].passwordVerify(password)) {
                    acc[i].addAccount(acc[i].id, fname, lname, acc[i].email, acc[i].username, password);
                    passValid = true;  
                } else {
                    System.out.println(" - Invalid password - , Try Again ");
                }
            }
            System.out.println("");
       

        }
        System.out.println("Account Details: ");
         System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n","ID", "FirstName", "LastName", "Email", "Username", "Password");
         System.out.println("---------------------------------------------------------------------------------");
        for (i = 0; i < no; i++) {
            if(acc[i] != null){
            acc[i].viewAccount();
            System.out.println(""); */
        
        
   

       }
   }

