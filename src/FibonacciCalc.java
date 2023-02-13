import java.math.BigInteger;
public class FibonacciCalc {

    private static void fibonacci(int maxNumber) {

        BigInteger previousNumber = BigInteger.valueOf(0);
        BigInteger nextNumber = BigInteger.valueOf(1);

        System.out.print("Fibonacci Series of "+ maxNumber +" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            BigInteger sum = previousNumber.add(nextNumber);
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }

    public static void main(String[] args) {
        fibonacci(100);
    }
}