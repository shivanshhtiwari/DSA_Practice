// You are given two integer arrays A and B of length N on which you have to perform the operation below:

// In one operation, you can swap any two elements of A or any two elements of B.

// Your task is to find and return an integer value representing the minimum possible sum of A[i] * B[i] after performing the above operation any number of times.

// Note: The operation can also be performed 0 times.


import java.util.*;
public class MinimumSum {
    public static int minimumSum() {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] A= new int[n];
        int[] B= new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            B[i]= sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        int i=0; int j=n-1;
        while(i<n && j>=0)
        {
            sum+=A[i]*B[j];
            i++;
            j--;
        }
        sc.close();
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(minimumSum());
    }
}
