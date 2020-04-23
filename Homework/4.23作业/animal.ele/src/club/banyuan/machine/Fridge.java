package club.banyuan.machine;

import club.banyuan.animal.Elephant;
import club.banyuan.animal.Lion;

public class Fridge {
    public int heightInCM;
    public Elephant storeelephant;
    //Elephant remove;
    public Lion storelion;

    public void store(Elephant elephant){
        if(storelion != null){
            System.out.println("不能装大象，冰箱已经满了");
        }else {
            storeelephant = elephant;
            System.out.println("装大象");
        }
    }

    public void store(Lion lion){
        if(storeelephant != null){
           System.out.println("不能装狮子，冰箱已经满了");
        }else{
            storelion = lion;
            System.out.println("装狮子");
        }
    }

    public void remove(){
        storeelephant = null;
        System.out.println("大象已取出");
    }
}