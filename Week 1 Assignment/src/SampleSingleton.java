import java.math.BigDecimal;
import java.sql.*;

public class SampleSingleton {
    private Connection conn;
    private static SampleSingleton instance = null;
    private SampleSingleton(){
        try {
            conn = DriverManager.getConnection("ibm_db_sa://rjz07540:xwc76jpv64jfwb%40v@dashdb-txn-sbox-yp-dal09-04.services.dal.bluemix.net:50000/BLUDB");
        }catch (SQLException e){
            System.out.println("Could not connect");
        }
    }

    public static SampleSingleton getInstance(){
        if(instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }
        return instance;
    }
}
