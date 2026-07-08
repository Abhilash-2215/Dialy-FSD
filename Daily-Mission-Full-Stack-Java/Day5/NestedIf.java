

public class NestedIf {
    public static void main(String[] args) {
        String area="kuppam";
        int age=25;
        if(area.equals("kuppam")){
            if(age>18){
                System.out.println("you can vote");
            }
            else{
                System.out.println("you are eligible for vote");
            }
        }
    }
    
}
