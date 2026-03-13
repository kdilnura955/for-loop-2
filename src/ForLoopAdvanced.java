public class ForLoopAdvanced {

    // Print an N×N times table
    static void timesTable(int n) {
        System.out.printf("%n=== %d × %d Times Table ===%n", n, n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.printf("%4d", i * j);
            System.out.println();
        }
    }

    // Check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    // Bubble sort using for loops
    static int[] bubbleSort(int[] arr) {
        int[] a = arr.clone();
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j+1]) { int t = a[j]; a[j] = a[j+1]; a[j+1] = t; }
        return a;
    }

    static void printDiamond(int n) {
        System.out.println("\n=== Diamond (n=" + n + ") ===");
        for (int i = 1; i <= n; i++) {
            for (int s = n-i;  s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2*i-1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int s = n-i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2*i-1); j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Primes up to 50
        System.out.print("=== Primes up to 50 === \n");
        for (int i = 2; i <= 50; i++) if (isPrime(i)) System.out.print(i + " ");
        System.out.println();

        // Bubble sort demo
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("\nUnsorted: "); for (int n : data) System.out.print(n + " ");
        int[] sorted = bubbleSort(data);
        System.out.print("\nSorted:   "); for (int n : sorted) System.out.print(n + " ");
        System.out.println();

        timesTable(5);
        printDiamond(4);
    }
}
