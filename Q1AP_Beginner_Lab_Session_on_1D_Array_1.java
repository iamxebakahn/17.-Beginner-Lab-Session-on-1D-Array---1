/*Problem Description

You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .

Note:

When comparing two elements of the ArrayList(java), make sure to use .equals() method for accurate comparison.
Eg : To compare ith index with jth index use A.get(i).equals(A.get(j)).



Problem Constraints

1 <= len(A) <= 1000


1 <= A[i] <= 100




Input Format

First argument is an array of integers representing array A.



Output Format

You have to return an array of integers as per the question.



Example Input

Input 1:

A = [1, 2, 5, 1, 5, 1 ]


Example Output

Output 1:

[3, 1, 2, 3, 2, 3]


Example Explanation

Explanation 1:

Clearly, In the given array we have 1 three times, 2 one time and 5 two times. */

//Method 1

public class Q1AP_Beginner_Lab_Session_on_1D_Array_1{
    public ArrayList<Integer> solve(ArrayList<Integer> A)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<A.size();i++)
        {
            count=0;
            for(int j=0;j<A.size();j++)
            {
                if(A.get(j)==A.get(i))
                    {
                        count++;
                    }
            }
            ans.add(count);
        }

        return ans;
    }
}


import java.util.ArrayList;

//Method 2

public class Solution {
    public int[] solve(int[] A) {
        int[] res=new int[A.length];
        int count =0;
        for(int i=0;i<A.length;i++)
        {
            count=0;
            for(int j=0;j<A.length;j++)
            {
                if(A[i]==A[j])
                    count++;
            }

            res[i]=count;
        }

        return res;
    }
}
