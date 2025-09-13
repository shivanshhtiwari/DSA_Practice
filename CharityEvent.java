// You are organizing a charity event in a village, where you distribute chocolates to children sitting in a circle. While the distribution of chocolates follows a specific set of rules based on their position in the circle:

// The i<sup>th</sup> child receives i chocolates.

// If a child's position is adjacent to a multiple of 5, they receive an additional 2 chocolates.


import java.util.*;

class CharityEvent {
    public static int totalChocolates() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();


        int sum = n * (n + 1) / 2;

 
        for (int k = 5; k <= n; k += 5) {
            if (k - 1 >= 1) sum += 2;
            if (k + 1 <= n) sum += 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(totalChocolates());
    }
}
