/*Problem Description

You are given an ArrayList of integers. Your task is to increment each element in the ArrayList by 1.

Modify the ArrayList directly and return it.


Problem Constraints

The ArrayList will contain at least 1 and at most 100 integers.
Each integer in the ArrayList will be in the range −100 to 100.


Input Format

A single ArrayList of integers is provided as input.


Output Format

Return the modified ArrayList with each element incremented by 1.


Example Input

Input 1:
A = [20, 15, 8, 25, 21]
Input 2:
A = [-3, 0, 7]


Example Output

Output 1:
[21, 16, 9, 26, 22]
Output 2:
[-2, 1, 8]
 */
class Q6_Beginner_Lab_Session_on_1D_Array_1{
    // Method to increment all elements of the ArrayList by 1
    public ArrayList<Integer> increaseByOne(ArrayList<Integer> al) {
        
        // Write your code here

        // ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<al.size();i++)
        {
                
                   al.set(i,al.get(i)+1);

                        
        }

        
        return al;

    }
}

import java.util.ArrayList;

