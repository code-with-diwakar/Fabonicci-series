// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class fabonicci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int n1=0;
        int n2=1;
       int sum=0;
        for(int i=0;i<=n;i++){
            System.out.println(n1+"");
             sum=n1+n2;
             n1=n2;
             n2=sum;
        }
    }
}
