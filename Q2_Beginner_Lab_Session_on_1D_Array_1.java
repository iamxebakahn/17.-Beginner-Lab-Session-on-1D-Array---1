/*Problem Description

Write a program that reads an integer array A from input and modifies the array by shifting each element to the right by one position and by shifting the last element to the first position. After performing the shifting operation, print the modified array.
**Note:** Ensure there is a space character (' ') at the end of the line.
Problem Constraints

1 <= N <= 105 1 <= A[i] <= 109
Input Format

The first line of the input is the size of the array N. The second line of the input is N integers of the array separated by space.
Output Format

Print each element of the array, followed by a space (including the last element).
Example Input

Input 1:
5
1 2 3 4 5
Input 2:
3
2 3 1 
Example Output

Output 1:
5 1 2 3 4
Output 2:
1 2 3
Example Explanation

For Input 1:
The elements 1, 2, 3 and 4 have been shifted to the right by one position and 5 has been moved to the first position.
For Input 2:
The elements 2 and 3 have been shifted to the right by one position and 1 has been moved to the first position. */
import java.lang.*;
import java.util.*;

public class Q2_Beginner_Lab_Session_on_1D_Array_1{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        
        int temp=arr[N-1];

        for(int i=N-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }

        arr[0]=temp;
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
    }
}