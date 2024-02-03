package barclayys;

import java.util.Arrays;
import java.util.Scanner;

/*
Mr. Jason has captured your friend and has put a collar around his neck.
He has locked it with a given locking key. It can only be opened now with an unlocking key.
Your friend has seen the locking key but he does not know about the unlocking key. Given the locking key,
one can figure out the unlocking key which is the smallest (in magnitude) permutation of the digits ochat number and it never starts with zero.

Help your friend to write an algorithm that takes the locking key as an input and aunpurs the unlocking key
 */
public class Solution_2 {

    public static long unlockingKey(long key) {
        // Convert the key to a string for easier manipulation
        String keyStr = Long.toString(key);

        // Convert the string to a character array for sorting
        char[] keyArray = keyStr.toCharArray();

        // Sort the array in ascending order
        Arrays.sort(keyArray);

        // Find the first non-zero digit
        int nonZeroIndex = 0;
        while (keyArray[nonZeroIndex] == '0') {
            nonZeroIndex++;
        }

        // Swap the first non-zero digit with the first digit
        char temp = keyArray[0];
        keyArray[0] = keyArray[nonZeroIndex];
        keyArray[nonZeroIndex] = temp;

        // Convert the character array back to a long
        long answer = Long.parseLong(new String(keyArray));

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for key
        long key = in.nextLong();

        long result = unlockingKey(key);
        System.out.print(result);
    }

}
