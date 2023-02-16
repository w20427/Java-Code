import java.sql.SQLOutput;
import java.util.*;
public class are {
    public static void main(String [] args){
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi=3.14;
        double area = pi*r*r;
        System.out.println(area);

    }
}
