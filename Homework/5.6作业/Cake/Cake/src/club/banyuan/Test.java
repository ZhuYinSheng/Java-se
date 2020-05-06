package club.banyuan;

public class Test {
    public static Cake[] BuildCake()
    {
        Cake[] cakes = new Cake[10];
        cakes[0] = new OrderCake(1, 10, 6);
        cakes[1] = new OrderCake(2, 12, 6);
        cakes[2] = new OrderCake(3, 14, 7);
        cakes[3] = new OrderCake(4, 16, 8);
        cakes[4] = new OrderCake(5, 18, 9);
        cakes[5] = new ReadyCake(6, 20, 10);
        cakes[6] = new ReadyCake(7, 22, 11);
        cakes[7] = new ReadyCake(8, 24, 12);
        cakes[8] = new ReadyCake(9, 26, 13);
        cakes[9] = new ReadyCake(10, 28, 14);
        return cakes;
    }
    public static void AllCakesPrice(Cake[] cakes){
        double CakesPrice = 0;
        for (int i = 0; i <cakes.length ; i++) {
            CakesPrice += cakes[i].calcPrice();
        }
        System.out.println("所有蛋糕的总价为"+CakesPrice);
    }

    public static void cakePriceAndQuantity(Cake[] cakes){
        double AllMadeCakePrice = 0;
        int AllReadyMadeCakeQuantity = 0;
        for (int i = 0; i <cakes.length ; i++) {
            if(cakes[i] instanceof OrderCake)
                continue;
            AllMadeCakePrice += cakes[i].calcPrice();
            AllReadyMadeCakeQuantity += ((ReadyCake)cakes[i]).getQuantity();
        }
        System.out.println("准备做好的蛋糕总价是"+AllMadeCakePrice+",总数是"+AllReadyMadeCakeQuantity);
    }

    public static void showExpensiveCakeInformation(Cake[] cakes){
        int temp = 0;
        for (int i = 0; i < cakes.length ; i++) {
            if(cakes[temp].calcPrice() <= cakes[i].calcPrice())
            {temp = i;}
        }
        if(cakes[temp] instanceof OrderCake){
            System.out.println("id:"+((OrderCake)cakes[temp]).id);

            System.out.println("price:"+((OrderCake)cakes[temp]).price);

            System.out.println("weightInKG:"+((OrderCake)cakes[temp]).getWeightInKG());
        }else{
            System.out.println("id:"+((ReadyCake)cakes[temp]).id);

            System.out.println("price:"+((ReadyCake)cakes[temp]).price);

            System.out.println("quantity:"+((ReadyCake)cakes[temp]).getQuantity());
        }
    }

    public static void main(String[] args) {
        Cake[]cakes = BuildCake();
        AllCakesPrice(cakes);
        cakePriceAndQuantity(cakes);
        showExpensiveCakeInformation(cakes);
    }

}