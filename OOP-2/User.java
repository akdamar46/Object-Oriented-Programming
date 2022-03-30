
package homeworktest;
import java.io.*;
import java.util.ArrayList;


/**
 * E-Commerce Application Project 
 * @author Ahmet Furkan Akdamar
 * 190316068   / II. Education
 */

public class User {
    private String name;
    private String surname;
    private String email;
    private String userName;
    private String password;
    private String address;
    private File userFile;
    private File postFile;
    private ArrayList<String> posts;
    
    public User(String name, String surname, String email, String userName, String password, String address, int mode){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.posts = new ArrayList<String>();
        this.userFile = new File(email + ".txt");
        this.postFile = new File (email + "_post.txt");
        try{
            if (!userFile.exists()){
                userFile.createNewFile();

            }
            if(!postFile.exists()){
                postFile.createNewFile();
            }

            if(mode == 0){
                
                signUp();
            
            }
            else{
                viewProfile();
                
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void addPost(String post) {
        try {
            posts.add(post);
            FileOutputStream fos = new FileOutputStream(this.postFile,true);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(post);
            bw.newLine();
            bw.close();
        }
        catch (Exception e){
                System.out.println(e.getMessage());
            }
        
    }
    
    public void login(String email, String password){
        if(email.equals(this.email) && password.equals(this.password) ){
            System.out.println("User successfully logged in.");
        }
        else
            System.out.println("Wrong email or password. Failed to login.");
        
    }
    
    public void viewProfile(){
        try {
            System.out.println("\nMy user information: \n");
            FileReader frUser = new FileReader(this.userFile);
            BufferedReader bfrUser = new BufferedReader(frUser);
            String view = bfrUser.readLine();
            while (view != null ){
                System.out.println(view);
                view = bfrUser.readLine();
            }
            bfrUser.close();

            System.out.println("\n*****************************************************************************************************************\n");
            System.out.println("My shared posts: \n");
            FileReader frPost = new FileReader(this.postFile);
            BufferedReader bfrPost = new BufferedReader(frPost);
            String viewPost = bfrPost.readLine();
            while (viewPost != null ){
                System.out.println(viewPost);
                viewPost = bfrPost.readLine();
            }
            bfrPost.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
       
    }
    
    public void signUp(){
        try{
            FileOutputStream fos = new FileOutputStream(this.userFile,true);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            String infos = this.name + ", " + this.surname + ", " + this.email + ", " + this.userName + ", " + this.password + ", " + this.address;
            bw.write(infos);
            bw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
     public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
