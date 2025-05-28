/*Problem Description

Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.


Problem Constraints

1 <= A.size() <= 105
1 <= A[i] <= 105


Input Format

The only argument is an Integer Array A.


Output Format

Return an Integer Array, denoting the elements that are divisible by 5 and 7 from the given list.


Example Input

Input 1:
A = [5, 7, 70, 50, 35]
Input 2:
A = [105, 57]


Example Output

Output 1:
[70, 35]
Output 2:
[105]
 */

// Method 1
class Q2AP_Beginner_Lab_Session_on_1D_Array_1 {
    public List<Integer> divisible(List<Integer> A) {
       // # YOUR CODE GOES HERE
        ArrayList<Integer> ans=new ArrayList<>();
        
        
            for(int j=0;j<A.size();j++)
            {
                if((A.get(j)%5==0) && (A.get(j)%7==0))
                    {
                        ans.add(A.get(j));
                    }
            }
            
            return ans;
    }
}

import java.util.ArrayList;
import java.util.List;

//Method 2
class DivisibilityChecker {
    public int[] divisible(int[] A) {
        //# YOUR CODE GOES HERE
        int[] res=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if((A[i]%5==0)&&(A[i]%7==0))
                {
                    res[count]=A[i];
                    count++;
                }
        }

        int[] res_arr=new int[count];
        for(int i=0;i<count;i++)
            res_arr[i]=res[i];

        return res_arr;
        
    }
}
