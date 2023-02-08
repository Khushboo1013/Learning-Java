public class Day6_j_LoopTerminator {
    public static void main(String[] args) {
        // Break Statement - To exit the loop
        for(int i=1;i<=5;i++){ 
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }
}
