/*Problem Description

You are given an integer array, A. Modify this array by increasing each element by 1.

The function should directly modify the original array A and should not return any value.


Problem Constraints

The Array contains at least 1 and at most 100 integers.
Each integer in the Array will be in the range −100 to 100.


Input Format

An Array (A), consists of Integers.


Output Format

No need to Return anything in the Function.


Example Input

Input 1:
A = [10, 5, 30, 18, 12]
Input 2:
A = [-8, 3, 15]


Example Output

Output 1:
[11, 6, 31, 19, 13]
Output 2:
[-7, 4, 16] */



class Q7_Beginner_Lab_Session_on_1D_Array_1{
    public static void incrementArray(int[] A) {
        // Your Code goes here
        // Do not create any new array, Modify the variable A
        
        // No need to return anything!
        for(int i=0;i<A.length;i++)
            A[i]=A[i]+1;

        //for(int i=0;i<A.length;i++)
          //  System.out.print(A[i]+" ");
                        
        

    
    }
}


