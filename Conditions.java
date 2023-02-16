import java.util.*;
public class Conditions {
    public static void main(String [] args){
        System.out.println("Enter the age");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{

            System.out.println("Not Adult");
        }

    }
}
