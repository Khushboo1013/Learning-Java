import java.util.*;
public class Day2_a {
    public static void main(String args[]){
        // comments in java - it is ignore by complier which cannot be executed
        /* - Multilibe comments
         Hello world
        */

        //-----------------------How to take input in java
        Scanner sc=new Scanner(System.in); //Scanner is a class present in util package
        
        //String input= sc.next();  //sc is scanner object it is upto me what I want too write
        //System.out.println(input); 
        
        // let's suppose we give input Khushboo Yadav, next() only gives o/p Khushboo
        
        //String name= sc.nextLine(); // for complete sentence
        //System.out.println(name);

        int num=sc.nextInt(); //for integer value
        System.out.println(num);

        /* Input Function
          next
          nextLine 
          nextInt
          nextByte
          nextFloat
          nextDouble
          nextBoolean
          nextShort
          nextLong
         */
    }
}
