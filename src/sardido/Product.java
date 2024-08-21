
package sardido;


public class Product {
    

    int pid, stocks;
    String pname;
    double price;

    
    public void addProduct(int id, double pr, String name, int st){
            this.pid = id;
            this.pname = name;
            this.stocks = st;
            this.price = pr;
        
    }
    
    public void viewProduct(){
        
        double tep = this.price * this.stocks;
        String status = (this.stocks < 1) ? "Out-of-Stock" : "Available";
        System.out.printf("%-10d %-10s %-10d %-10.2f %-10.2f %-10s\n", this.pid, this.pname, this.stocks, this.price, tep, status);
    }
}
