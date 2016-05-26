package week15labs;

public class Dice implements Runnable {
    private int numberOfDice = 0;
    static int sum = 0;
    private int roll;
    private int count = 0;
    
    public Dice (int numberOfDice){
        this.numberOfDice = numberOfDice;
    }
    
    public void Throw() {
        roll = 1 + (int)(Math.random()*6);
    }
    
    @Override
    public void run(){
        String threadNumber = Thread.currentThread().getName();
        for (int i = 0; i < numberOfDice; i++) {
            Throw();
            count++;
            System.out.printf("Thread : %s Dice roll: %d, Count: %d \n", threadNumber, roll, count);
        }
        
    }
    
}