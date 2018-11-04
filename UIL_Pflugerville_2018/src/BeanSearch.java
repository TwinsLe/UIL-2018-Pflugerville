import java.util.*;
import java.io.*;
import java.util.concurrent.ExecutionException;

public class BeanSearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("beansearch.dat"));

        int lines = Integer.parseInt(sc.next());
        for (int i = 0; i < lines; i++) {
            int y = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            sc.nextLine();

            char[][] grid = new char[y][x];

            for (int j = 0; j < y; j++) {
                String newLine = sc.nextLine();
                for (int k = 0; k < x; k++) {
                    grid[j][k] = newLine.charAt(k);
                }
            }


            int bankSize = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < bankSize; j++) {
                String word = sc.nextLine();
                boolean found = false;
                for (int k = 0; k < y; k++) {
                    for (int l = 0; l < x; l++) {
                        //up
                        int yPos = k;
                        int xPos = l;
                        String checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                yPos--;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //right
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                xPos++;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //down
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                yPos++;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //left
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                xPos--;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //upleft
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                yPos--;
                                xPos--;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //upright
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                yPos--;
                                xPos++;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //downright
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                yPos++;
                                xPos++;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }
                        //downleft
                        yPos = k;
                        xPos = l;
                        checker = "";
                        try {
                            for (int m = 0; m < word.length(); m++) {
                                checker+=grid[yPos][xPos];
                                yPos++;
                                xPos--;
                            }
                            if (word.equals(checker)) {
                                found = true;
                                break;
                            }
                        } catch ( Exception e ) {

                        }

                    }
                }

                if (found) {
                    System.out.println("FOUND");
                } else {
                    System.out.println("NOT FOUND");
                }
            }

        }
    }
}
