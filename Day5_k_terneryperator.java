public class Day5_k_terneryperator {
    public static void main(String[] args) {
        /*
            Ternary Operator
            var=conditon?statement1(if true this statement execute): statement2(if false this execute);

            boolean larger=(5>3)?5:3;
            this condition is true , so the value 5 is stored in larger
            String type=(5%2==0)?"even":"odd";
        */
        int num=24;
        //ternary operator
        String type=((num%2)==0)?"even":"odd";
        System.out.println(type);
    }
}
