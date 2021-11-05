import java.util.Random;

public class Producer extends Thread{
    private int[] buffer;
    private int computationTime;

    public Producer(int[] buffer, int computationTime){
        this.buffer = buffer;
        this.computationTime = computationTime;
    }

    public void run(){
        Random numberGenerator = new Random();
        while(true){
            // Stall for a bit
            try{
                Thread.sleep(computationTime);
            }catch (InterruptedException e){
                System.out.println("Error, thread was interrupted");
            }

            // We treat the buffer as FIFO stack, adding the next integer at leftmost nonzero position
            int index = 0;
            while(index < buffer.length && buffer[index] != 0){
                index ++;
            }
            if(index < buffer.length){
                int randomInsert = numberGenerator.nextInt(10);
                System.out.println("Adding integer " + randomInsert + " at position " + index);
                buffer[index] = randomInsert;
            }
        }
    }
}
