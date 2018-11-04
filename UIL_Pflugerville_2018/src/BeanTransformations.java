import java.util.*;
import java.io.*;
public class BeanTransformations {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("beantransformations.dat"));
        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            int num = Integer.parseInt(sc.nextLine());
            String binNum = Integer.toBinaryString(num);
            binNum = reverse(binNum);
            String hex = "";
            for (int j = 0; j < Math.ceil(binNum.length()/4d); j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    try {
                        if (binNum.charAt(j*4+k)=='1') {
                            count++;
                        }

                    } catch (Exception e) {

                    }
                }
                hex = Integer.toString(count)+hex;


            }
            System.out.println(Integer.parseInt(hex,16));




        }
    }
    public static String reverse(String s){
        String n = "";
        for(int i=s.length()-1;i>=0;i--){
            n += s.charAt(i);
        }
        return n;
    }
}
