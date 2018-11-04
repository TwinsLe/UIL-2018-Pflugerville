import java.util.*;
import java.io.*;
public class BeanDoodle {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("beandoodle.dat"));
        int n = sc.nextInt();
        for(int a=0;a<n;a++){
            int line = sc.nextInt();
            int gridsize = 4*line-3;
            String[][] grid = new String[gridsize][gridsize];
            for(String[] arr : grid){
                Arrays.fill(arr," ");
            }
            int iterations = (gridsize-1)/4+1;
            int startcorner = -2;
            for(int i=1;i<=iterations;i++){
                startcorner += 2;
                for(int k=0;k<gridsize;k++){
                    grid[startcorner][startcorner+k] = "#";
                    grid[startcorner+k][startcorner] = "#";
                    grid[startcorner+gridsize-1-k][startcorner+gridsize-1] = "#";
                    grid[startcorner+gridsize-1][startcorner+gridsize-1-k] = "#";
                }
                gridsize -= 4;
            }
            for(String[] arr : grid){
                for(String s : arr){
                    System.out.print(s);
                }
                System.out.println();
            }
            if(a != n-1){
                System.out.println();
            }
        }
    }
}
