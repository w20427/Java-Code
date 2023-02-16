import java.util.*;
public class SumOFn {
    public static void main(String [] args){
        // Sum of first n natural number

        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println(sum);


    }
}
