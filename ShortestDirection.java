//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String s = in.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.shortestPath(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String shortestPath (String S)
    {
        // your code here
        int x = 0;
        int y = 0;
        for (int i = 0; i<S.length(); i++){
            char dir = S.charAt(i);
            if (dir == 'N'){
                y++;
            }
            else if (dir == 'S'){
                y--;
            }
            else if (dir == 'E'){
                x++;
            }
            else {
                x--;
            }
        }
        StringBuilder result = new StringBuilder();
        if (y > 0) {
            result.append(String.join("", Collections.nCopies(y, "N")));
        }
        if (x > 0) {
            result.append(String.join("", Collections.nCopies(x, "E")));
        }
        if (y < 0) {
            result.append(String.join("", Collections.nCopies(-y, "S")));
        }
        if (x < 0) {
            result.append(String.join("", Collections.nCopies(-x, "W")));
        }
        
        char[] resultChars = result.toString().toCharArray();
        Arrays.sort(resultChars);
        return new String(resultChars);
        
    }
}
