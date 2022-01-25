import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArraysSumNeg {
    public static void main(String[] args) {

        int n;
        int numNeg = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        n = input.nextInt();
        int[] A = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if ( sum < 0 ) numNeg++;
            }
        }
        System.out.println("Number of sub Arrays with a negative total is: " + numNeg);
    }
}