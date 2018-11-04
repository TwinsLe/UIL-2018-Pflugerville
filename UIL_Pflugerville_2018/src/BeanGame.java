import java.util.*;
import java.io.*;
public class BeanGame {
    static int[] weights;
    static int totalweight;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("beangame.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for(int a=0;a<n;a++){
            String[] data = sc.nextLine().split(" ");
            totalweight = Integer.parseInt(data[1]);
            String[] nums = sc.nextLine().split(" ");
            weights = new int[nums.length];
            for(int i=0;i<weights.length;i++){
                weights[i] = Integer.parseInt(nums[i]);
            }

            //first is weight, second is index
            boolean[][] possible = new boolean[totalweight+1][weights.length+1];
            for(int i=0;i<possible[0].length;i++){
                possible[0][i] = true;
            }
            for(int i=1;i<possible.length;i++){
                for(int j=1;j<possible[0].length;j++){
                    possible[i][j] = possible[i][j-1];
                    if(i-weights[j-1] >= 0){
                        possible[i][j] = possible[i][j] || possible[i-weights[j-1]][j-1];
                    }
                }
            }
            boolean poss = false;
            for(int i=0;i<possible[0].length;i++){
                poss = poss || possible[totalweight][i];
            }
            if(poss){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
