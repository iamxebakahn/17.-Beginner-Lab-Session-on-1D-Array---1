/*Problem Description

Write a program that reads an integer array Arr[] from input and modifies the array by shifting each element to the left by one position and by shifting the first element to the last position. Print the modified array.

Note: Ensure there is a space character (' ') at the end of the line.


Problem Constraints

1 <= Arr.length <= 100000
-100000 <= Arr[i] <= 100000


Input Format

The first line of the input is the size of the array N. The second line of the input is N integers of the array separated by space.


Output Format

Print a single line that is the elements of the modified array separated by space.


Example Input

5
1 2 3 4 5


Example Output

2 3 4 5 1 */
import java.lang.*;
import java.util.*;

public class Q4AP_Beginner_Lab_Session_on_1D_Array_1{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        
        int temp=arr[0];

        for(int i=0;i<N-1;i++)
            arr[i]=arr[i+1];

        arr[N-1]=temp;

        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");

    }
}