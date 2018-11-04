import java.util.*;
import java.io.*;
public class DryRun {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("dryrun.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("I like "+sc.nextLine()+".");
        }
        sc.close();
    }
}
