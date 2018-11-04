import java.util.*;
import java.io.*;
public class BeanTrapezoids {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("beantrapezoids.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String[] line = sc.nextLine().split(" ");
            double area = Double.parseDouble(line[2])*(Double.parseDouble(line[1])+Double.parseDouble(line[0]))/2;
            System.out.printf("%.2f",area);
            System.out.println();
        }
    }
}
