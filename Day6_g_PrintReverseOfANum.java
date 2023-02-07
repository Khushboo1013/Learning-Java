public class Day6_g_PrintReverseOfANum {
    public static void main(String[] args) {
        // Print reverse of a number n=134676;
        // Key Points = 1)last digit =num%10    2)remove last digit =num/10
        int n=134676;
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
        System.out.println();
    }
}
