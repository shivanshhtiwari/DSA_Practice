// Jim has a password which is represented by a string S containing English alphabets [a-z] in lower case and numbers [0-9].
// The distance between two characters can be calculated as the difference between their respective indices.

// Your task is to find and return an integer value representing the maximum distance between two non-similar characters within the given password S.

// Note: The distance between two alphabets which are adjacent to each other is 1.

import java.util.*;
public class TheDistance {
    public static int maxDistance() {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int maxDistance=0;
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<s.length();j++) {
                while(s.charAt(i)!=s.charAt(j)) {
                    maxDistance=Math.max(maxDistance,Math.abs(i-j));
                    break;
                }
            }
        }
        sc.close();
        return maxDistance;
    }
    public static void main(String[] args) {
        System.out.println(maxDistance());
    }
}