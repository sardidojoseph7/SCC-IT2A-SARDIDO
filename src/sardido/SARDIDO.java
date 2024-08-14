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
        Scanner input = new Scanner(System.in);
        
        String name;
        int math,science,english,computer,tm;
        float totalAve;
       
        System.out.print("Enter your full name: ");
        name = input.nextLine();
        System.out.print("Enter your Marks in: ");
        System.out.print("Math: ");
        math = input.nextInt();
        System.out.print("Science: ");
        science = input.nextInt();
        System.out.print("English: ");
        english = input.nextInt();
        System.out.print("Computer: ");
        computer = input.nextInt();
        
        System.out.println("-----------------------------------\n");
        System.out.println("Grade Detail");
        System.out.println("-----------------------------------\n");
        
        tm = math+science+english+computer;
        totalAve = tm/4;
        
        System.out.println("Name: "+name);
        
        System.out.println("Total Marks: "+tm);
        System.out.println("Total Average: "+totalAve);
        float test = totalAve;
        System.out.println(String.format("%.2f",test));
        
       
        if(totalAve >=75){
            System.out.println("You Passed");
        }else{
            System.out.println("You Failed");
        }
    }
    
}
