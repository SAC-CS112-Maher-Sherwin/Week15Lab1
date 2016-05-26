package week15labs;

public class Week15Labs {

    public static void main(String[] args) {
       
        System.out.println("Start");
        
        for (int i = 1; i < 2; i++) {
            Runnable T1 = new Dice(25);
            Thread W1 = new Thread(T1);
            W1.setName(String.valueOf(1));
            W1.start();
            
            Runnable T2 = new Dice(25);
            Thread W2 = new Thread(T2);
            W2.setName(String.valueOf(2));
            W2.start();
        }
        
        System.out.println("Complete");

    }
    
}