package barclayys;
import java.util.Scanner;
import java.lang.*;

/* QUESTION
You are given a non empty list of positive integers You can som any two consecutive elements to form a Single element. The result thus obtained can be reused further and this process can be repeated any number of times to convert the given list intera palindromic list of maximum length

   example input : the first line of the input consist of an integer num representing the number of elements in the list the second line consist of N space separated positive integers arr[0], arr[1] ... . .. . . arr[N-1] representing the elements of the list
 input : 6
  15 10 15 34 25 15

  output :  15 25 34 25 15

 write an algorithm to convert this list into a palindromic list of maximum length                                                                                                                 complete this code public class Solution



 */
public class Solution
{
    public static int[]  palindromicList(int[] arr)
    {
        int num = arr.length;

        // Create a temporary array to store the modified list
        int[] tempArr = new int[100];
        int tempSize = 0;

        // Start from the first element
        for (int i = 0; i < num; i++) {
            // Check if the current element can be merged with the next one
            if (i < num - 1 && arr[i] == arr[i + 1]) {
                // Merge the consecutive elements
                int mergedValue = arr[i] + arr[i + 1];
                tempArr[tempSize++] = mergedValue;

                // Skip the next element as it has already been merged
                i++;
            } else {
                // Copy the current element as it cannot be merged
                tempArr[tempSize++] = arr[i];
            }
        }

        // Create the palindromic list from the temporary array
        int[] palindromicArr = new int[tempSize * 2 - 1];
        for (int i = 0; i < tempSize; i++) {
            palindromicArr[i] = tempArr[i];
            palindromicArr[tempSize * 2 - 2 - i] = tempArr[i];
        }

        return palindromicArr;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for arr
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int idx = 0; idx < arr_size; idx++)
        {
            arr[idx] = in.nextInt();
        }

        int[] result = palindromicList(arr);
        for(int idx = 0; idx < result.length - 1; idx++)
        {
            System.out.print(result[idx] + " ");
        }
        System.out.print(result[result.length - 1]);
    }
}

