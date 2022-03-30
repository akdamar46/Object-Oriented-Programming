
package e_commerce;

/**
 * E-Commerce Application Project 
 * @author Ahmet Furkan Akdamar
 * 190316068   / II. Education
 */

import java.util.ArrayList;

public class users {
    private String userName;
    private String name;
    private String surName;
    private String dateOfBirth;
    private String password;
    private String eMail;
    private String homeAddress;
    private String workAddress;
    ArrayList <product> productsOrdered;
    ArrayList <product> favoriteProducts;
    ArrayList <creditCard> savedCards;
    private int productCount; //The product count to be purchased


    public users (String userName, String name, String surName, String dateOfBirth,
                  String password, String eMail, String homeAddress, String workAddress, int productCount){
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.eMail = eMail;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.productsOrdered = new ArrayList<product>();
        this.favoriteProducts = new ArrayList<product>();
        this.savedCards = new ArrayList<creditCard>();
        this.productCount = productCount;
    }
    
    
    public void writeAttributesUser(){
        System.out.println("\n" + "Name: " + this.name + "\n" + "Surname: " + this.surName + "\n" + "Username: " + this.userName+ "\n" +
                "Password: " + this.password + "\n" + "Email: " + this.eMail + "\n" + "Birthday: " + this.dateOfBirth + "\n" +
                "Home Address: " + this.homeAddress + "\n" + "Work Address: " + this.workAddress + "\n");
    }

    
     //Getter and Setter methods
    
    public String getName() {

        return this.name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getUserName(){

        return this.userName;
    }
    public void setUserName(String userName){

        this.name = userName;
    }
    public String getSurName(){

        return this.surName;
    }
    public void setSurName(String surName){

        this.surName = surName;
    }
    public String getDateOfBirth(){

        return this.dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){

        this.dateOfBirth = dateOfBirth;
    }
    public String getPassword(){

        return this.password;
    }
    public void setPassword(String password){

        this.password = password;
    }
    public String geteMail(){

        return this.eMail;
    }
    public void seteMail(String eMail){

        this.eMail = eMail;
    }
    public String getHomeAddress(){

        return this.homeAddress;
    }
    public void setHomeAddress(String homeAddress){

        this.homeAddress = homeAddress;
    }
    public String getWorkAddress(){

        return this.workAddress;
    }
    public void setWorkAddress(String workAddress){

        this.workAddress = workAddress;
    }
    
    public int getProductCount() {
        return this.productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
    
    
    
    
    public void addCards (creditCard c){
        savedCards.add(c);
        System.out.println("\nThe card you selected has been added to Saved Cards.\n");
    }

    
    

    public void addProductFavorites (product p){
        favoriteProducts.add(p);
        System.out.println("\nThe product you selected has been added to your favorites.\n");

    }


    

    public void orderingProduct (product p, users u){
        System.out.println("\nThe total number of products to be purchased is " + productCount + ".\n");
        if (p.controlStock(u)) {
            System.out.println("We make your purchase...");
            for (int i = 0; i < productCount; i++) {
                productsOrdered.add(p);

            }
            System.out.println("Your purchase is complete. The number of products remaining in the seller is " + p.getProdStockInf() + ". Thank you for choosing us.\n");
        }
        else
            System.out.println("Please try again when the product you want to order is in stock.");

    }

    
   


}


