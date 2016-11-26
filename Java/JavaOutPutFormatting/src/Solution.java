import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();

                //Let's count the characters in the string
                int l = s1.length();
                int offset = 15 - l; //Calculate how many spacesare needed
                
                String printThis = s1;
                //Let's add the correct number of spaces
                for(int n = 0; n<offset; n++){
                	printThis = printThis.concat(" ");
                }
                //Let's translate the integer into the proper # of characters
                String intS = formatInt(x);
                printThis = printThis.concat(intS);
                System.out.println(printThis);
                
                
                
            }
            System.out.println("================================");

    }
    //This method takes an integer and turns it into a string of length 3
    //If the integer is less than 100, it will fill each space with zeros until it isof length 3
    // Ex. If x = 9, the String is"009"
    private static String formatInt(int x){
    	//I am guaranteed that x is no larger than 999
    	//Therefore, I just need to deal wih the cases that x is less than 100
    	String s = Integer.toString(x);
        int l = s.length();
        String rThis = "0";
        while(l<3){
        	//Keep adding zeros in front until the length is 3
        	s = rThis.concat(s);
        	l = s.length();
        }
        return s;
    }
}
