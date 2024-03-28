//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{   
    public: 
    //Function to return a list of integers denoting spiral traversal of matrix.
    vector<int> spirallyTraverse(vector<vector<int> > matrix, int r, int c) 
    {
        // code here 
        int startrow = 0;
        int startcolumn = 0;
        int endrow = r - 1;
        int endcolumn = c - 1;
        vector<int> ans;

        while (startrow <= endrow && startcolumn <= endcolumn){
            //top
            for (int j = startcolumn; j<=endcolumn; j++){
                ans.push_back(matrix[startrow][j]);
            }
            //right
            for (int i = startrow+1; i<=endrow; i++){
                ans.push_back(matrix[i][endcolumn]);
            }
            //bottom
            for (int j = endcolumn-1; j>=startcolumn; j--){
                if (startrow == endrow){
                    break;
                }
                ans.push_back(matrix[endrow][j]);
            }
            //left
            for (int i = endrow-1; i>= startrow+1; i--){
                if (startcolumn == endcolumn){
                    break;
                }
                ans.push_back(matrix[i][startcolumn]);
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--) 
    {
        int r,c;
        cin>>r>>c;
        vector<vector<int> > matrix(r); 

        for(int i=0; i<r; i++)
        {
            matrix[i].assign(c, 0);
            for( int j=0; j<c; j++)
            {
                cin>>matrix[i][j];
            }
        }

        Solution ob;
        vector<int> result = ob.spirallyTraverse(matrix, r, c);
        for (int i = 0; i < result.size(); ++i)
                cout<<result[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends
