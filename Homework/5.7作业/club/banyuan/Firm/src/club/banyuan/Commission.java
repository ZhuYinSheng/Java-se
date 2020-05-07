package club.banyuan;

public class Commission extends Hourly{
    private double sales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = cRate;
        sales = 0;
    }

    public void addSales(double totalSales){
        sales = totalSales;
    }

    public String toString() {
        String result = super.toString();
        result += "\n总销售额：" + sales;
        return result;
    }

    public double pay(){
        double payment = super.pay() + sales;
        sales = 0;
        return payment;
    }
}