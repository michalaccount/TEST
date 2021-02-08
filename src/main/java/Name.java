/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mflasinski
 */
import java.util.*;
public class Name {
    
    public static void main(String[] args) {
        // Write your program here
        // Please answer to our survey http://oo-start.mooc.fi/english_mooc_participants/new
        // It will take less than 5 minutes!
Scanner scanner = new Scanner (System.in); 
        System.out.println("Give the first number: ");
        int number1 = Integer.valueOf(scanner.nextLine());
              System.out.println("Give the second number: ");
        int number2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        
        
        System.out.println(number1 + number2);
                System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println((double)number1/number2);

    }

}

