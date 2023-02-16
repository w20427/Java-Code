import java.util.*;
public class Nam {
    public static void main (String [] args){
        System.out.println("Enter the button");
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();

        if(button == 1){
            System.out.println("Hello");
        } else if (button==2) {
            System.out.println("Namesty");
        }
        else if(button == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid button");
        }
    }
}

