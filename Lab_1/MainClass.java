package Lab_1;

import java.util.Scanner;

public class MainClass {



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        TaskConditions rules = new TaskConditions();
        rules.askN();
        rules.setEmblemUP(in.nextInt());
        rules.askM();
        rules.setEmblemDOWN(in.nextInt());
        rules.askS();
        rules.setStep(in.nextInt());
        rules.askK();
        rules.setMove(in.nextInt());
        rules.askL();
        rules.setResultEmblUP(in.nextInt());

        Coin coin0 = new Coin("Орел");
        Coin coin1 = new Coin("Решка");
        Coin coin2 = new Coin("Решка");
        Coin coin3 = new Coin("Орел");
        // coinGeneration();
        coin0.information();
        coin1.information();
        coin3.information();
        //PullCoins pull = new PullCoins(emblem)
    }
}
