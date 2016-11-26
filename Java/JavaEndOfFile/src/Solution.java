
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;//To count the lines
        
        //Scan until the end of input
        while(scan.hasNextLine()){
        	i++;//Count the new line
        	String s = Integer.toString(i);
        	s= s.concat(" "); //Add a space between the line# and theline
        	s = s.concat(scan.nextLine()); 
        	System.out.println(s);
        	
        }
    }
}