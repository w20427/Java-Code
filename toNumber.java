import java.util.*;
public class toNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b){
            System.out.println("It is Equal");
        }
        else{
            if(a>b){
                System.out.println("A is greater");
            }
            else{
                System.out.println("A is lesser");
            }
        }

    }
}
