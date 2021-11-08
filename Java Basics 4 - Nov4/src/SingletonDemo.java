public class SingletonDemo {
    private static SingletonDemo instance = null;

    private SingletonDemo(){

    }

    public static SingletonDemo GetInstance(){
        if(instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        SingletonDemo first = SingletonDemo.GetInstance();
        SingletonDemo second = SingletonDemo.GetInstance();

        System.out.println("Acquired 1st instance with hash " + first.hashCode());
        System.out.println("Acquired 2nd instance with hash " + first.hashCode());
    }
}
