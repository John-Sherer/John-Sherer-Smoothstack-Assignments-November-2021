public class Account{
    private int balance;
    private String name;
    public Account(String name, int balance){
        this.balance = balance;
        this.name = name;
    }
    public int GetBalance(){
        return balance;
    }
    public void SetBalance(int balance){
        this.balance = balance;
    }
    public String GetName(){
        return name;
    }
}