import java.util.*;
class StringBuff1
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abhi");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
         StringBuffer sb1 = new StringBuffer("roopesh");
         String str = sb1.toString();
         sb.append("lash");
         System.out.println(sb);
         System.out.println(str);
         

    }
}