public class BufferDemo {

    public static void main(String[] args){
        int[] buffer = new int[10];
        Producer producer = new Producer(buffer,100);
        Consumer consumer = new Consumer(buffer,200);

        producer.start();
        consumer.start();
    }
}
