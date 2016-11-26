import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); //The number of queries
        String printThis = ""; //Use this to print results
        for(int i=0;i<t;i++){
        	// Get the parameters for each query
            int a = in.nextInt(); 
            int b = in.nextInt(); 
            int n = in.nextInt();
            printThis = ""; //Result value
            
            
            for(int j = 0; j<n; j++){
            	
            	int expo = (int) (Math.pow(2, j)); //Calculate the power of 2
            	a = a + expo*b; //Calculate the new term in the sum, add to the cumulative total
            	printThis = printThis.concat(Integer.toString(a)); //Add t othe current query
            	printThis = printThis.concat(" ");// Add a space
            }
            System.out.println(printThis);
            
            
            
        }
        in.close();
    }
}
