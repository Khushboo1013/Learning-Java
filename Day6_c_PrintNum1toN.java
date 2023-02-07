import java.util.*;
public class Day6_c_PrintNum1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int counter=1;
        while (counter<=N) {
            System.out.println(counter);
            counter++;
        }
    }
}
