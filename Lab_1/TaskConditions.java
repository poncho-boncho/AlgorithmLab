package Lab_1;

import java.util.Scanner;

public class TaskConditions {
    private int emblemUP;
    private int emblemDOWN;
    private int step;
    private int move;
    private int resultEmblUP;

    public void setEmblemUP(int emblemUP) {
        this.emblemUP = emblemUP;
    }

    public void setEmblemDOWN(int emblemDOWN) {
        this.emblemDOWN = emblemDOWN;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setResultEmblUP(int resultEmblUP) {
        this.resultEmblUP = resultEmblUP;
    }

    public void askN(){
        System.out.println("Введите количество монет гербави вверх (N):");
    }
    public void askM(){
        System.out.println("Введите количество монет гербави вниз (M):");
    }
    public void askS(){
        System.out.println("Введите шаг переворачивания монеты (S)");
    } public void askK(){
        System.out.println("Введите количество ходов (K)");
    }
    public void askL(){
        System.out.println("Введите кол-во оставшихся (L)");
    }
   /* static void coinGeneration(){
        System.out.println("Введите количество монет гербави вверх (N):");
        int emblemUP = in.nextInt();
        System.out.println("Введите количество монет гербави вниз (M):");
        int emblemDOWN = in.nextInt();
        System.out.println("Введите шаг переворачивания монеты (S)");
        int step = in.nextInt();
        System.out.printf("гербми вверх=%d гербами вниз=%d шаг=%d", emblemUP, emblemDOWN,step);
    }

    */
}
