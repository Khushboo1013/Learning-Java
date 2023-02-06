import java.util.*;
public class Day5_i_incomeTax_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float myIncome=sc.nextFloat();
        if(myIncome<=500000){
            System.out.println("No need to pay Income Tax");
        }else if(myIncome>500000 && myIncome<=1000000){
            System.out.println("You have to pay 20% Income Tax");
            float incometax=myIncome*.20f;
            System.out.println("My income tax :"+ incometax);
        }else{
            System.out.println("You have to pay 30% Income Tax");
            float incometax=myIncome*.30f;
            System.out.println("My income tax :"+ incometax);
        }
    }
}
