import java.util.*;
import java.io.*;
public class BeanChecker {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("beanchecker.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String[] line = sc.nextLine().split(" ");
            if((line[0].indexOf("e")>=0 || line[0].indexOf("E")>=0) && Integer.parseInt(line[1])%2==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
