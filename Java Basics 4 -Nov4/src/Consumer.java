public class Consumer extends Thread{
    private int[] buffer;
    private int computationTime;

    public Consumer(int[] buffer, int computationTime){
        this.buffer = buffer;
        this.computationTime = computationTime;
    }

    public void run(){
        while(true){
            // Stall for a bit
            try{
                Thread.sleep(computationTime);
            }catch (InterruptedException e){
                System.out.println("Error, thread was interrupted");
            }

            // We treat the buffer as FIFO stack, looking for the rightmost nonzero element to consume
            int index = 0;
            while(index < buffer.length && buffer[index] != 0){
                index ++;
            }
            index --; // If we leave the loop, it's because we just passed the rightmost element. Go back to it
            if(index > 0){
                System.out.println("Consuming integer " + buffer[index] + " at position " + index);
                buffer[index] = 0;
            }
        }
    }
}
