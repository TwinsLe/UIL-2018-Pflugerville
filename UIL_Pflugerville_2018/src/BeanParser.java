import java.util.*;
import java.io.*;
public class BeanParser {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("beanparser.dat"));
        int count = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < count; i++){
            int number = 0;
            String a = sc.nextLine();
            //System.out.println(a);
            for(int j=0;j<a.length()-3;j++){
                String s = a.substring(j,j+4);
                s = s.toLowerCase();
                if(s.equals("bean")){
                    number++;
                }
            }
            System.out.println(number);
        }
    }
}
