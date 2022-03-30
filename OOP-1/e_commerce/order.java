
package e_commerce;

/**
 * E-Commerce Application Project 
 * @author Ahmet Furkan Akdamar
 * 190316068   / II. Education
 */

public class order {
    private users orderingUser;
    private product orderedProduct;
    private creditCard paymentCard; // The credit card objects to which the payment is made.



    public order (users orderingUser, product orderedProduct, creditCard paymentCard ){
        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.paymentCard = paymentCard;

    }

    //Getter and Setter methods

    public users getOrderingUser() {

        return this.orderingUser;
    }

    public product getOrderedProduct() {

        return this.orderedProduct;
    }

    public creditCard getPaymentCard() {
        return this.paymentCard;
    }

    public void setOrderingUser(users orderingUser) {

        this.orderingUser = orderingUser;
    }

    public void setOrderedProduct(product orderedProduct) {

        this.orderedProduct = orderedProduct;
    }

    public void setPaymentCard(creditCard paymentCard) {

        this.paymentCard = paymentCard;
    }

    
    
    
    public void accessToMethods(users user1, product product1){
        System.out.println("\n----------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                            Getting access...");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
        product1.controlStock(user1);
        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");
        user1.orderingProduct(product1,user1);
    }

}








