
import java.util.Random;

public class program {
    
    public static void main(String[] args) {
        Random rnd = new Random();

        int i = rnd.nextInt(2000);
        System.out.println(i);

        int n = Integer.toBinaryString(i).length();
        System.out.println(Integer.highestOneBit(n));

        int c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0) c++;
            
        }
        int[] a1 = new int[c];
        c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0) a1[c++] = j;
            
        }

        c = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n != 0) c++;
            
        }
        int[] a2 = new int[c];
        c = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n != 0) a2[c++] = j;
            
        }
        
    }

    public static void print(String str) {
        System.out.println(str);
    }
}











