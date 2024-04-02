//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n,q));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        // bad time complexity
        // long count = 0;
        // if (n*2 < q){
        //     count = 0;
        // }
        // else{
        //     long[][] matrix = new long[(int)n][(int)n];
        //     for (long i = 0; i<n; i++){
        //         for (long j = 0; j<n; j++){
        //             matrix[(int)i][(int)j] = i+j+2;
        //             if (q == i+j+2){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        
        // for O(1) time complexity
        long count = 0;
        if (n*2 < q){
            count = 0;
        }
        else{
            count = n - Math.abs(n+1-q);
        }
        
        return count;
    }
};
