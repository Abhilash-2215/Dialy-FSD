public class Method {

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void displayMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 10 prime? " + isPrime(10));
        System.out.println("Reverse of 1234: " + reverseNumber(1234));
        displayMessage("Hello Abhi, welcome to Java methods!");
    }
}
