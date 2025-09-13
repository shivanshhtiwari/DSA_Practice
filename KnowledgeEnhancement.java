// Alex is a high school student who loves reading and has a summer break coming up.
// Alex has a list of books that he wants to read, with each book’s estimated reading time stored in an array A.
// Alex has N hours available during the break for reading.

// Your task is to help Alex find and return an integer value representing the maximum number of books Alex can read without exceeding their total available reading hours.

import java.util.*;
public class KnowledgeEnhancement {
    public static int maxBooks() {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] A= new int[n];
        int hours= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            A[i]= sc.nextInt();
        }
        Arrays.sort(A);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]<=hours)
            {
                c++;
                hours-=A[i];
            }
        }
        sc.close();
        return c;
    }
    public static void main(String[] args) {
        System.out.println(maxBooks());
    }
}