// Write a program to check whether a number is prime or not. Calculate
// its time complexity with proper explanation.

public class ques1 {
    public static void main(String[] args) {
        int n = 11;

        System.out.println(isPrime(n));
    }
    

    public static boolean isPrime(int n) {

        if (n == 1 ) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) {
                
                return false;
            }
        }
        return true;
    }
}