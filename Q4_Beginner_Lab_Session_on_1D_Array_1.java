/*Problem Description

Given a dynamic array A.
Return a Dynamic Array that has all even numbers from A.

Note :
Dynamic Array in JAVA: ArrayList
Dynamic Array in C++: vector
Dynamic Array in Python: List



Problem Constraints

0 < A.length <= 10000
-100000 <= A[i] <= 100000


Input Format

Single Argument integer dynamic array A[].


Output Format

Return Integer Dynamic Array of all even numbers.


Example Input

Input 1 :
A[] : 8 54 79 62 33 59 14 19 20 27

Input 2 :
A[] : 31 38 36 45 48 47 44 26


Example Output

Output 1 :
8 54 62 14 20

Output 2 :
38 36 48 44 26


Example Explanation

Explanation 1 :
Array is [8 54 79 62 33 59 14 19 20 27],
Even elements in the array are: 8 54 62 14 20

Explanation 2 :
Array is [31 38 36 45 48 47 44 26],
Even elements in the array are: 38 36 48 44 26 */

//Method 1

public class Q4_Beginner_Lab_Session_on_1D_Array_1{
    public int[] solve(int[] A) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                al.add(A[i]);
            }

        }

        int[] ans=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            ans[i]=al.get(i);
        }

        return ans;
    }
}


import java.util.ArrayList;

//Method 2
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<A.size();i++)
        {
                if(A.get(i)%2==0)
                {
                   result.add(A.get(i));

                }          
        }

        
        return result;
    }
}

