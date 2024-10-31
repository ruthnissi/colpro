public class Seller extends User{
    private String product;
    
        public void addProduct (String productName) {
                System.out.println("Seller menggunakan produk " + productName);
                this.product = productName;        
        }    
}
