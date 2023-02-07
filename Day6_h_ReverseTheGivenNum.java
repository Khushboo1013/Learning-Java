public class Day6_h_ReverseTheGivenNum {
    public static void main(String[] args) {
        // Reverse the given number n=10899
        /*
         rev=(rev*10)+lastDigit
         rev=0
         rev=(0*0)+9=9
         rev=(9*10)+9=99
         rev=(99*10)+8=998
         ......
        */
        int n=10899;
        int rev=0;
        while (n>0) {
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
