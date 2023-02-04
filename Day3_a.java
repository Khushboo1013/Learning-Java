import java.util.*;
public class Day3_a {
    public static void main(String args[]){
        /*
           Type casting -it is that converion which java don't allow but we do forcefully
           (narrowing conversion, explicit conversion)
           e.g , float a =25.0;
                 int b=a;   (data loss )
           int marks=(int)(99.99f)
        */
        Scanner sc= new Scanner(System.in);
        float a=25.23f;
        // int b=a; // lossy conversion
        int b=(int)a;
        System.out.println(b);

        // type conversion char to int
        char ch='b';
        int num=ch;
        System.out.println(num);
    }
}
