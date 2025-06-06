
/*Problem Description

Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C <= N - 1


Input Format

The first argument A is an array of integer.
The second and third arguments are integers B and C


Output Format

Return the array A after reversing in the given range.


Example Input

Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2


Example Output

Output 1:

[1, 2, 4, 3]
Output 2:

[6, 5, 2]


Example Explanation

Explanation 1:

We reverse the subarray [3, 4].
Explanation 2:

We reverse the entire array [2, 5, 6]. */

// Method 1
public class Q3_Beginner_Lab_Session_on_1D_Array_1{
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        
        int start=B;
        int end=C;
        int temp=0;

        while(start<end)
        {
            temp=A.get(start);
            A.set(start,A.get(end)); //A.get(start)=A.get(end);
            A.set(end,temp); //A.get(end)=temp;

            start++;
            end--;
        }

        return A;
        
    }
}


import java.util.ArrayList;


//Method 2
public class Solution {
    public int[] solve(int[] A, int B, int C) {
        // int size=0;
        // if(B==0)
        //     size=C+1;
        // else
        //     size=C-B+1;
        
        // int[] res=new int[size];

        int start=B,end=C, temp=0; 
        while(start<end)
        {
            temp=A[start];
            A[start]=A[end];
            A[end]=temp;

            start++;
            end--;

        }

        return A;

    }
}
