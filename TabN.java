import java.util.*;
public class TabN {
    public static void main(String [] args){
        System.out.println("Enter the value of n to print table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
        System.out.println(n*i);

        }
    }
}
