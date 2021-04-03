/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String str = "&ncisd*";
        boolean check = findUnique(str);
        System.out.print(check);
    }

    static boolean findUnique(String str) {
        int size = str.length();
        boolean[] arr = new boolean[128];
        if(size <= 0) return true;

        for(int i = 0; i < size; i++) {
            int val = str.charAt(i);
            if(arr[val]) {
                return true;
            }
            arr[val] = true;
        }
        return false;
    }
}
