public class AccountSwapper extends Thread {
    private String threadName;
    private Account firstAccount;
    private Account secondAccount;
    private int firstBusywork;
    private int secondBusywork;

    public AccountSwapper(String name, Account first, Account second, int firstBusywork, int secondBusywork){
        super();
        threadName = name;
        firstAccount = first;
        secondAccount = second;
        this.firstBusywork = firstBusywork;
        this.secondBusywork = secondBusywork;
    }

    public void run() {
        System.out.println(threadName + " reporting, seeking lock on " + firstAccount.GetName());
        try {
            Thread.sleep(firstBusywork);
        } catch(InterruptedException e){
            System.out.println(threadName + " reporting. Encountered runtime error.");
        }
        synchronized (firstAccount){
            System.out.println(threadName + " reporting, acquired lock on " + firstAccount.GetName() +
                    ", now seeking lock on " + secondAccount.GetName());
            try {
                Thread.sleep(secondBusywork);
            } catch(InterruptedException e){
                System.out.println(threadName + " reporting. Encountered runtime error.");
            }
            synchronized (secondAccount){
                System.out.println(threadName + " reporting, acquired lock on " + secondAccount.GetName() +
                        ", performing swap.");
                int swappedValue = secondAccount.GetBalance();
                secondAccount.SetBalance(firstAccount.GetBalance());
                firstAccount.SetBalance(swappedValue);
                System.out.println(threadName + " reporting, swap complete and releasing locks now.");
            }
        }
        System.out.println(threadName + " reporting, thread complete and locks released.");
    }
}
