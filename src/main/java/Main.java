import com.project.db.DBService;
import com.project.db.User;
import number.A;
import number.B;
import number.C;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vector.Vector;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URI;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.reverse;
public class Main {
    public static BigInteger getFactorial(int n){
        BigInteger factorial = BigInteger.valueOf(n);
        if(n==1)
            return BigInteger.valueOf(1);
        else
            for (int i=1; i<n ; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
    }
    public static Boolean isPall(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.toString().replaceAll("[\\pP\\s]","").equalsIgnoreCase(stringBuilder.reverse().toString().replaceAll("[\\pP\\s]",""));
    }
    //private  static final String INSERT_NEW = "insert into users values(?,?,?)";
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.next();
//        System.out.println(isPall(string));
//        DBService dbService = new DBService();
//        String query = "select * from users";
//        PreparedStatement preparedStatement = null;
//        try {
//            Statement statement = dbService.getConnection().createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                User user = new User();
//                user.setId(resultSet.getInt(1));
//                user.setName(resultSet.getString(2));
//                user.setPass((resultSet.getString(3)));
//                user.setEmail(resultSet.getString(4));
//                System.out.println(user.toString());
//            }
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
        User [] users = new User[0];
        ArrayListByAna arrayListByAna = new ArrayListByAna(users);
        arrayListByAna.add(new User("Ana"),0);
        arrayListByAna.add(new User("Vova"),1);
        arrayListByAna.add(new User("Vova"),2);
        arrayListByAna.add(new User("Tamila"));
        System.out.println(arrayListByAna.toString());
        arrayListByAna.remove(arrayListByAna.getElement(3));
        System.out.println(arrayListByAna.toString());




    }
}
