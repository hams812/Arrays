import java.util.Arrays; 

public class PrimeSieve {
    public static boolean[] sieve = new boolean[100];

    public static void main(String[] args) {        
        Arrays.fill(sieve, true); //set all values to true
        sieve[0] = false;
        sieve[1] = false;

        //sieve algorithm = setting all nonprime numbers to false
        for (int i = 2; i < sieve.length; i++) {
            for (int j = 2*i; j < sieve.length; j=j+i) { //4,6,8,10...then i=3,6,9,12, then so on
                sieve[j] = false;
            }
        }
        //collecting all primes to print to console
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {// if element is true it will print that index which will be a prime number
                System.out.println(i);
            }
        }
        
        int[] primes = collectPrimes();
        
        printPrimeFactors(132, primes);
    }

    public static int[] collectPrimes() {
        //count the primes before making the array
        int count = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                count++; // 1st we are counting how many such prime numbers are there 
            }            // to determine what size array we need
        }
        int[] primes = new int[count];// defines an array of that size

        //fill the array with only prime numbers
        int n = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                primes[n] = i;
                n++;
            }
        }

        return primes;
    }
/*
    public static void printPrimeFactors(int n, int[] primes) {
        System.out.println("Prime factorization of " + n + ":");
        
        for (int i = 0; i < primes.length; i++) {
            int exponent = 0;
            while (n % primes[i] == 0) {
                exponent++;
                n = n / primes[i];
            }
            if (exponent != 0) {
                System.out.println(primes[i] + ": " + exponent);
            }
        }
    }*/
    public static void printPrimeFactors(int n, int[] primes) {
        System.out.println("Prime factorization of " + n + ":"); //heading
        
        for (int i = 0; i < primes.length; i++) {
           int exponent = 0;
            while (n % primes[i] == 0) {
               exponent++; //2^2 ,3^1, 11^1
                n = n / primes[i];
            }
            if (exponent != 0) {
                System.out.println(primes[i] + ": " + exponent);
            }
            
        }
    }
}
