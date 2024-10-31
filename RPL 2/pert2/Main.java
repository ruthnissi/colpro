//Konsep OOP, inheritance, polymorphism

public class Main {
    public static void main(String[] args) {

User user = new User(); //pembentukan objek

        user.login();
        user.logout();
        
Buyer buyer = new Buyer(); //pembentukan objek
 
        buyer.login();
        buyer.logout();
        
Seller seller = new Seller();
        seller.addProduct("Mie Ayam merah");       
    }    
}
