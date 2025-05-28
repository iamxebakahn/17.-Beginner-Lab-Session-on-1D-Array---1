
/*Problem Description

Given a number A, create an array of size A which contains all elements in increasing order from 1 to A.


Problem Constraints

1 <= A <= 105


Input Format

The Only Argument is an Integer A


Output Format

Return an Integer Array, which contains 1 to N, in increasing order.


Example Input

Input 1:
A = 5
Input 2:
A = 1


Example Output

Output 1:
[1, 2, 3, 4, 5]
Output 2:
[1]


Example Explanation

Explanation 1:
A = 5, the array should hold: {1, 2, 3, 4, 5}
Explanation 2:
A = 1, the array should hold only, {1}.
 */

 //Method 1

public class Q5_Beginner_Lab_Session_on_1D_Array_1{
    public ArrayList<Integer> num(int A) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=A;i++)
            res.add(i);
        
        return res;


    }
}


import java.util.ArrayList;


//Method 2
public class Solution {
    public int[] num(int A) {
        int[] ans=new int[A];
        for(int i=0;i<A;i++)
            ans[i]=i+1;

        return ans;
    }
}

