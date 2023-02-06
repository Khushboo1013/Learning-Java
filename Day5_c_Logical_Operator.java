public class Day5_c_Logical_Operator {
    public static void main(String[] args) {
        /*
         Logical operator
          
         &&  (Logical AND)
          Ans   |   Statement 1   |  Statement 2
          T     |    T             | T
          F     |     f             | F
          F     |     F             | T
          F      |    T             | F
          
         ||  (Logical Or)
          Ans   |   Statement 1   |  Statement 2
          T     |    T             | T
          F     |     f             | F
          T     |     F             | T
          T      |    T             | F
         !   (Logical NOT)
         true -> false
         false -> true
        */
        System.out.println((3>2)&&(4<5));
        System.out.println((3<2)&&(4<5));
        System.out.println((3<2)||(4<5));
        System.out.println((3<2)||(4>5));
        System.out.println((3>2)||(4<5));
        System.out.println(!(3>2));
    }
}
