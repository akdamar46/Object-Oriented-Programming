
package e_commerce;

/**
 * E-Commerce Application Project 
 * @author Ahmet Furkan Akdamar
 * 190316068   / II. Education
 */

public class product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int prodStockInf;    // Product Stock Information
    private double productWeight;
    private String prodDescriptionInf;      // Product Description Information


     public product (String productName, String productColor, String productCategory, int prodStockInf, double productWeight,
                    String prodDescriptionInf){
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.prodStockInf = prodStockInf;
        this.productWeight = productWeight;
        this.prodDescriptionInf = prodDescriptionInf;
    }
     
     
    public void writeAttributesProduct(){
        System.out.println("\n" + "Product Name: " + this.productName + "\n" + "Product Color: " + this.productColor + "\n" +
                "Product Category: " + this.productCategory + "\n" + "Product Stock Information: " + this.prodStockInf + "\n" +
                "Product Weight: " + this.productWeight + "\n" + "Product Description Information: " + this.prodDescriptionInf + "\n" );


    }

    
    //Getter and Setter methods
    
    public String getProductName(){

        return this.productName;
    }

    public String getProductColor(){

        return this.productColor;
    }

    public String getProductCategory(){

        return this.productCategory;
    }

   public int getProdStockInf(){

        return this.prodStockInf;
    }

    public double getProductWeight(){

        return this.productWeight;
    }

    public String getProdDescriptionInf(){

        return this.prodDescriptionInf;
    }

    public void setProductName(String productName){

        this.productName = productName;
    }

    public void setProductColor(String productColor){

        this.productColor = productColor;
    }

    public void setProductCategory(String productCategory){

        this.productCategory = productCategory;
    }

    public void setProdStockInf(int prodStockInf){

        this.prodStockInf = prodStockInf;
    }

    public void setProductWeight(double productWeight){

        this.productWeight = productWeight;
    }

    public void setProdDescriptionInf(String prodDescriptionInf) {

        this.prodDescriptionInf = prodDescriptionInf;
    }

    
    
    
    public boolean controlStock (users u){
        if (this.prodStockInf >= u.getProductCount()) {
            System.out.println("The number of products you want to order is available in our stock.");
            this.prodStockInf = this.prodStockInf - u.getProductCount();
            return true;
        }
        else {
            System.out.println("The number of products you want to order is not available in our stocks. The number of products in our stock is " +
                    this.prodStockInf + " pieces.");
            return false;
        }
    }








}


