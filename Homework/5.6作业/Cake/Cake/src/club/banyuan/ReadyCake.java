package club.banyuan;

public class ReadyCake extends Cake{
    private int quantity;

    public ReadyCake(int n, double r, int quantity) {
        super(n, r);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public  double calcPrice(){
        return price* quantity;
    }
}