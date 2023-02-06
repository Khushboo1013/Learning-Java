public class Day5_h_elseif {
    public static void main(String[] args) {
        /*
          if(condion 1){

          }else if(condition 2){

          }else{

          }
        */
        int age =14;
        if(age>=18){
            System.out.println("adult");
        }else if(age>=12 && age<18){
            System.out.println("teen");
        }else{
            System.out.println("child");
        }
    }
}
