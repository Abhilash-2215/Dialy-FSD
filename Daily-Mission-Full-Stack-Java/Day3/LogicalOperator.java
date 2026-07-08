public class LogicalOperator {
    public static void main(String[]args){
        int a =10;
        int b =20;
        boolean ll = a>10 && b<200;
        System.out.println("ambesend:"+ll);
        boolean kk= a==b || a>=20;
        System.out.println("pipe:"+kk);
        boolean mtt=!true;
        System.out.println("Not operator:"+mtt);
    }
}
