//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int pos = -1; // Initialize position to -1 indicating not found
        int n = s.length();
        int m = x.length();

        for (int i = 0; i <= n - m; i++) {
            // Check if the substring starting at i matches x
            int j =0;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break; // If mismatch found, break the loop
                }
            }
            if (j == m) {
                // If the loop completed without breaking, it means all characters matched
                pos = i; // Set the position to the start of the match
                break; // Exit the loop, as first occurrence is found
            }
        }
        return pos;
    }
}
