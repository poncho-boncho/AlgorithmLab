package Lab_1;

public class Coin {
    String side;
    private static int coinCount;
    int numberCoin;

   public Coin(String side){
        this();
        this.numberCoin=coinCount;
        this.side=side;
    }
   public Coin(){
        coinCount++;
    }


    void information(){
        System.out.printf("side - %s number %d \n ",side, numberCoin);
    }
}
