import java.util.*;
public class Day6_d_PrintSumOfNnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        // Print sum of First n natural number
        int sum=0;
        int i=1;
        while (i<=N) {
            sum+=i; //sum=sum+i;
            i++;
        }
        System.out.println("Sum of First n natural number = " + sum);
    }
}
