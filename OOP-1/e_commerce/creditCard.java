
package e_commerce;

/**
 * E-Commerce Application Project 
 * @author Ahmet Furkan Akdamar
 * 190316068   / II. Education
 */

public class creditCard {
    private String creditCardNumber;
    private String creditCardUser;
    private int securityCode;
    private String expirationDateOfCC; //Expiration Date Of The Credit Cards

    
    
    public creditCard(String creditCardNumber, String creditCardUser, int securityCode, String expirationDateOfCC){
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDateOfCC = expirationDateOfCC;

    }
    
    
    public void writeAttributesCard(){
        System.out.println("\n" + "Credit Card Number: " + this.creditCardNumber + "\n" + "Credit Card User: " + this.creditCardUser + "\n" +
                "Security Code: " + this.securityCode + "\n" + "Expiration Date Of The Credit Cards: " + this.expirationDateOfCC + "\n" );

    }

    
     //Getter and Setter methods
    
    public String getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public String getCreditCardUser() {
        return this.creditCardUser;
    }

    public int getSecurityCode() {
        return this.securityCode;
    }

    public String getExpirationDateOfCC() {
        return this.expirationDateOfCC;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDateOfCC(String expirationDateOfCC) {

        this.expirationDateOfCC = expirationDateOfCC;
    }
}






