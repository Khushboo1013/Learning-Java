import java.util.*;
public class Day5_l_PassFail {
    public static void main(String[] args) {
        // By using ternary operator
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String result=(marks>33)?"Pass":"Fail";
        System.out.println(result);
    }
}
