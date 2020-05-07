package club.banyuan;

public class Commission extends Hourly{
    private double sales;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
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