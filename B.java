public class B {
    /**
     * This method checks loops through each number between user's range(inclusive).
     * if it's prime: number is printed out and is added to running count of prime numbers in this range.
     * @param a integer 1 of user's input
     * @param b integer 2 of user's input
     */
    public static void calcprime(int a, int b) {
        int count = 0;
        if(a < 2)
             a = 2;
        for (int i = a; i <= b; i++) {
            if (checkprime(i)) {
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0)
                    System.out.println();
            }

        }
        System.out.println();
        System.out.println(count + " prime numbers were found between " +a+ " and " + b);

    }

    /**
     * Checks if a number is prime. All numbers in user's range (inclusive) is checked to see if its prime or not.
     * @param num, each number in user's range.
     * @return boolean value of whether num is prime or not.
     */
    public static boolean checkprime(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0)
                return false;
        }
        return true;
    }
}
