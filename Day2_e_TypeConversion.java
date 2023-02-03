import java.util.*;
public class day2_e_TypeConversion {
    
    public static void main(String args[]){
            /*
              Type Conversion means type change    it is implicit(apne aap)
              Conversion happens when:
              a)type compatible     int=float but float!=int
              b)destination type > source type
    
              byte->short->int->float->long->double
            */
            //int a=12;
            //long b=a;
            //System.out.println(b);
        Scanner sc=new Scanner(System.in);
        float num=sc.nextInt();
        // int num=sc.nextFloat();   ---It start showing error
        System.out.println(num);
    }
}
    

