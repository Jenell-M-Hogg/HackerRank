import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i = 1; i<=10; i++){
        	int m = N*i;
        	String s =String.format("%d x %d = %d", N,i,m);
        	System.out.println(s);
        }
        in.close();
    }
}

