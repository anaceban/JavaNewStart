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
import java.util.*;

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
    public static int[] twoSumm(int[] array,int target) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j+1; i < array.length; i++) {
                if (array[j] + array[i] == target) {
                    return new int[] {j,i};
                }
            }
        }
        return new int[]{};
    }
    public static void sort(int [] array){
        for (int j=0; j<array.length; j++) {
            int min = array[j];
            int minIndex = j;
            for (int i = j+1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            if(j != minIndex){
               int tmp = array[j];
               array[j] = array[minIndex];
               array[minIndex] = tmp;
            }
        }
    }

    public static int maxDiff(int[] array){
        return array[array.length-1] - array[0];
    }

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
        arrayListByAna.remove(3);
        System.out.println(arrayListByAna.toString());
        System.out.println(arrayListByAna.size());
        ArrayListByAna arrayListByAna1 = new ArrayListByAna();
        //arrayListByAna1.size();

//        int [] array = {2,9,8,3,4,5,9};
//        sort(array);
//        for(int i=0; i<array.length; i++){
//            System.out.print(array[i]+",");
//        }
//        System.out.println("\n"+ maxDiff(array));
//        ArrayListByAna<String> strings = new ArrayListByAna<>();
//        strings.add("Ana");
//        strings.add("A");
//        strings.removeByIndex(1);
       // strings.remove(0);
       // System.out.println(strings.size());
        LinkedListByAna<String> linkedList= new LinkedListByAna<>();
        linkedList.add("Ana");
        linkedList.add("Alex");
        System.out.println(linkedList.size());
        linkedList.remove("Ana");
        System.out.println(linkedList.size());
        System.out.println(linkedList.toString());

    }
}
