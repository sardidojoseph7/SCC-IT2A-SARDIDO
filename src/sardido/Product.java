package sardido;

public class Product {
    
    int pid, stocks, sold;
    String pname;
    double price;

    
    public void addProduct(int pid, String name, double price, int stocks, int sold) {
        this.pid = pid;
        this.pname = name;
        this.stocks = stocks;
        this.price = price;
        this.sold = sold;
    }
    
    
    public void viewProduct() {
        double totalValue = this.price * this.sold;
        String status = (this.stocks > 0) ? "Available" : "Out of Stock";
        
        System.out.printf("%-10d %-20s %-10.2f %-10d %-10.2f %-15s\n", this.pid, this.pname, this.price, this.sold, totalValue, status);
    }
}