/*Problem Description

Write a program that returns the list of positive elements that are present in the given list.


Input Format

The only argument is the given list of elements


Output Format

Return a list consisiting of the elements that are positive from the given list.


Example Input

-99 4 -2 -3 6 70 -8 14


Example Output

4 6 70 14 */

//Method 1

import java.util.ArrayList;
public class Q3AP_Beginner_Lab_Session_on_1D_Array_1{
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> al= new ArrayList<>();

        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>0)
            {
                al.add(A.get(i));
            }
        }

        return al;

    }
}
//Method 2

import java.util.ArrayList;

public class Solution {
    public int[] solve(int[] A) {
        int count=0;
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0)
                {
                    res[count]=A[i];
                    count++;
                }
        }

        int[] new_res=new int[count];
        for(int i=0;i<count;i++)
            new_res[i]=res[i];

        return new_res;

    }

}


