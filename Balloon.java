// Aaron goes to a shop to purchase balloons. The store owner has arranged the packets of balloons in the form of an array A where each packet has a certain number of balloons.
// Also, the cost of corresponding packets is displayed alongside in array B.

// Aaron wants to purchase 2 balloon packets within his budget of X.

// Your task is to help Aaron find and return an integer value representing the maximum number of balloons he can get by purchasing any 2 packets within his budget X.


import java.util.*;

class Balloon {
    public static int maxBalloons() {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   // number of packets
        int X = sc.nextInt();   // budget
        
        int[] A = new int[n];   // balloons in each packet
        int[] B = new int[n];   // cost of each packet
        
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int maxBalloons = 0;

        // check all pairs of packets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = B[i] + B[j];
                if (cost <= X) {
                    int balloons = A[i] + A[j];
                    maxBalloons = Math.max(maxBalloons, balloons);
                }
            }
        }

        sc.close();
        return maxBalloons;
    }

    public static void main(String[] args) {
        System.out.println(maxBalloons());
    }
}
