package homeworktest;

/**
 * E-Commerce Application Project 
 * @author Ahmet Furkan Akdamar
 * 190316068   / II. Education
 */

import java.util.Scanner;



public class HomeworkTest {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Press 1 for login, press 2 for registration.");
        User u = new User("Ahmet Furkan", "Akdamar" , "afa@hotmail.com", "akdamar46", "afa123456","Tekirdağ/Süleymanpaşa", 0);
        int op = input.nextInt();
        if(op == 1 ) {

            System.out.println("Enter email: ");
            String email = input.next();
            System.out.println("Enter password: ");
            String password = input.next();
            u.login(email,password);


        }
        else if (op == 2 ){
            System.out.println("Enter name: ");
            String name = input.next();
            System.out.println("Enter surname: ");
            String surname = input.next();
            System.out.println("Enter email: ");
            String email = input.next();
            System.out.println("Enter username: ");
            String username = input.next();
            System.out.println("Enter password: ");
            String password = input.next();
            System.out.println("Enter address: ");
            String address = input.next();
            u = new User (name, surname, email, username, password, address, 0);
            System.out.println("Registration completed successfully.");
        }
        
        while (true){
            System.out.println("\n*****************************************************************************************************************");
            System.out.println("\nChoose your operation: ");
            System.out.println("\n1-Post ");
            System.out.println("2-View own profile");
            System.out.println("3-Exit\n");
            int choosedOp = input.nextInt();
            if (choosedOp == 1 ){
                System.out.println("Enter your post: ");
                String p = input.next();
                makePost(u,p);
                System.out.println("\nYour post has been successfully shared.");
            }
            else if (choosedOp == 2 ){
                u.viewProfile();
            }
            else if (choosedOp == 3 ){
                u = null;
                
                break;
            }


        }
        System.out.println("\nProgram terminated.");

    }
    
    public static void makePost (User u, String p) {
            u.addPost(p);

    }
    
}
