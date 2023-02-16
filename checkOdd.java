import java.util.*;
public class checkOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number to check it is odd or even");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        if(x%2==0){
            System.out.println("It is Even");
        }
        else{
            System.out.println("It is Odd");
        }
    }
}
