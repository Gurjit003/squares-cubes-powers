/*
 * Gurjit Singh
 * Friday October 11th - 2019
 * This program displays squares, cubes, and powers
 */

package cubes.squares.powers;
import java.util.Scanner;
/**
 *
 * @author gusin5788
 */
public class CubesSquaresPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        int number = 0;
        int number2 = 0;
        
        while (true) {
        System.out.println("Cubes, Squares, and Powers Program");
        System.out.println("");
        
        System.out.println("Please enter your choice:");
        System.out.println("1 - To find the value of a number squared.");
        System.out.println("2 - To find the value of a number cubed.");
        System.out.println("3 - To find the value of a number to any power.");
        System.out.println("4 - To exit the program.");
        System.out.println("");
        
        choice = input.nextInt();
        
        System.out.println("");
        
        switch (choice) {
            case 1:
                System.out.println("Enter the value of a number you would like to square:");
                number = input.nextInt();
                System.out.println("");
                System.out.println("The product is: " + number * number);
                System.out.println("--------------------");
                break;
            case 2:
                System.out.println("Enter the value of a number you would like to cube:");
                number = input.nextInt();
                System.out.println("");
                System.out.println("The product is: " + number * number * number);
                System.out.println("--------------------");
                break;
            case 3:
                System.out.println("Enter the value of the base:");
                number = input.nextInt();
                System.out.println("");
                System.out.println("Enter the value of the exponent:");
                number2 = input.nextInt();
                System.out.println("");
                double result = Math.pow(number,number2);
                System.out.println("The product is: " + result);
                System.out.println("--------------------");
                break;
        }
            if (choice == 4) {
                System.out.println("You have chosen to exit, goodbye!");
                System.out.println("");
                break;
            }  
        }
      
    }
    
}
