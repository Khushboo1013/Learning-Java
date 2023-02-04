public class Day3_b_TypePromotion {
    public static void main(String args[]){
        /*
           Type Promotion in Expressions
           1) Java automatically promotes each byte , Short, or Char operand to int when evaluating anexpression.
           2) If one operand is long, float or double the whole expression is promted to long , float or double respectively.
        */
        char a='c';
        char b='f';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);  //Type Promotion in int
        System.out.println(a); // no type promotion
        //char c=b-a;  // it shows error because now b-a are int and we put it into c which is char

        short s=4;
        byte d=26;
        char h='h';
        byte bt=(byte)(s+h+d);
        System.out.println(bt); // the output we get does not make any sence but exist ( here we are doing lossy conversion int to byte)

        /*
         wrong
         byte b=5;
         b=b*2;  (b*2 is an expression and in this its alll converted into int)
         byte a=b*2;
        */  

        /*
           // right
           byte b=5;
           b=(byte)(b*2);
        */
    }
}
