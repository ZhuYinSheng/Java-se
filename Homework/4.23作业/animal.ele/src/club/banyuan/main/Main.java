package club.banyuan.main;

import club.banyuan.animal.Elephant;
import club.banyuan.machine.Fridge;
import club.banyuan.animal.Lion;

public class Main {

    public static Lion createLion(int heightInCM) {  
        Lion lion = new Lion();
        lion.heightInCM = heightInCM;
        return lion;
    }
    public static void main(String[] args){     
        Elephant elephant = new Elephant();
        elephant.heightInCM = 300;

        Fridge fridge = new Fridge();
        fridge.heightInCM = 500;
        fridge.store(elephant);
        fridge.remove();

        Lion lion = createLion(100);
        fridge.store(lion);

        fridge.store(elephant);
    }
}