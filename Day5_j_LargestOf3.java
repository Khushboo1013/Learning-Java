import java.util.*;
public class Day5_j_LargestOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>B){
            if(A>C){
                System.out.println("A is the largest amoung 3 numbers.");
            }else{
                System.out.println("C is the largest amoung 3 numbers.");
            }
        }else if(B>A){
            if(B>C){
                System.out.println("B is the largest amoung 3 numbers.");
            }else{
                System.out.println("C is the largest amoung 3 numbers.");
            }
            
        }else{
            System.out.println("C is the largest amoung 3 numbers.");
        }
    }
}
