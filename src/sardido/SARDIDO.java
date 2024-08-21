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

        Product pr = new Product();
        pr.addProduct(1011, 10, "Soap", 20);
        pr.viewProduct();
        
        Product pr1 = new Product();
        pr1.addProduct(1012, 50, "Cards", 0);
        pr1.viewProduct();

        
    }
    
}
