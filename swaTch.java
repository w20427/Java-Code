import java.util.*;
public class swaTch {
    public static void main (String [] args){
        System.out.println("Enter the button");
    Scanner sc= new Scanner(System.in);
    int button = sc.nextInt();

    switch(button){
        case 1:System.out.println("Hello");
        break;
        case 2:System.out.println("Namesty");
        break;
        case 3: System.out.println("Bonjour");
        break;
        default: System.out.println("Invalid button");

    }

    }


}
