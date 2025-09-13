// You are a teacher creating an engaging math activity for your students by writing N numbers on the classroom whiteboard.

// You use a green pen for odd numbers.

// You use a red pen for even numbers.

// Your task is to find and return an integer value representing the number of times you need to switch from the green pen to the red pen (or vice versa) while writing these numbers in sequence.

import java.util.*;
class RedPenGreenPen {
    public static int countSwitches() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        for(int i=1;i<n;i++){
            if(numbers[i]%2!=numbers[i-1]%2){
                count++;
            }
        }
        scanner.close();
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSwitches());
    }
}