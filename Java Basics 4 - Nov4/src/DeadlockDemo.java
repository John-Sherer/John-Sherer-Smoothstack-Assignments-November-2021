public class DeadlockDemo{

    public static void main(String[] args){
        Account firstAccount = new Account("Checking",100);
        Account secondAccount = new Account("Savings", 200);

        Thread firstSwap = new AccountSwapper("Thread 1", firstAccount, secondAccount, 100, 1000);
        Thread secondSwap = new AccountSwapper("Thread 2", secondAccount, firstAccount, 100, 1000);

        firstSwap.start();
        secondSwap.start();
    }
}
