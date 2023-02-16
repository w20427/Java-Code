import java.util.*;
public class ElsIf {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a == 0){
            System.out.println("Equal");
        } else if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("A is lesser");
        }

    }
}
