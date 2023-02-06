public class Day5_a_operator {
    public static void main(String args[]){
        /*
          Operators - Symbols that tell compiler to perform some operation
          sum=a + b    operator (+), operand(a,b)

          Types of operator in java ---
          Arithmetic Operators(Binary/ unary)

          Binary(2 Operands)
          +,-,%,*,/ 
          Unary(1 Operand)
          ++,--
          a=a+1  ++(increament)  a++(post increment)  ++a(pre Increment)(value change , then value use)
          a=a-1  --(decrement)  a--(post decrement)(value use then value change)  --a(pre decrement)

          Relational Operators
          Logical Operators
          Bitwise Operators(Bit Manipulation)
          Assignment Operators
        */

        // lets do some arithmetic operation
        int A=20;
        int B=10;
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        System.out.println(A++);
        System.out.println(A);
        System.out.println(++A);
        System.out.println(--B);
        System.out.println(B);
        System.out.println(B++);
        System.out.println(B);

    }
}
