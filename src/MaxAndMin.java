import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxAndMin {
    static boolean stopProgramme = false;
    static Scanner reader = new Scanner(System.in);

    private static void amountOfNumbers() {

        int amountOfNumbers = 0;

        while (amountOfNumbers <= 0) {
            try {
                amountOfNumbers = reader.nextInt();
                if (amountOfNumbers > 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer value above 0: ");
                reader.next();
                continue;
            }
            System.out.println("Please enter an integer value above 0: ");
        }
        inputNumbers(amountOfNumbers);
    }

    private static void inputNumbers(int amountOfNumbers) {

        //declaring OBJECT double array so values can be null;
        Double[] inputsArray = new Double[amountOfNumbers];

        System.out.println(amountOfNumbers + " values to be sorted");

        for (int i = 0; i < inputsArray.length; i++) {
            System.out.println("Enter a value to sort: ");
            while (inputsArray[i] == null) {
                try {
                    inputsArray[i] = reader.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number: ");
                    reader.next();
                }
            }
        }
        inputValidation(inputsArray);
    }

    private static void inputValidation(Double[] inputsArray) {

        double[] validatedInputs = new double[inputsArray.length];
        for (int i = 0; i < inputsArray.length; i++) {
            System.out.print(inputsArray[i] + ", ");
            validatedInputs[i] = inputsArray[i];
        }

        boolean inputsAreInts = false;
        for (int i = 0; i < validatedInputs.length; i++) {
            if (validatedInputs[i] % 1 == 0) {
                inputsAreInts = true;

            } else {
                inputsAreInts = false;
                break;
            }
        }
        //method overloading was part of the brief, but it feels like an unnecessary overkill and creates duplicate code.
        if (inputsAreInts) {
            toValidatedIntsArray(validatedInputs);
        } else {
            sortArray(validatedInputs);
        }
    }

    private static void toValidatedIntsArray(double[] validatedInputs) {

        int[] validatedInts = new int[validatedInputs.length];
        for (int i = 0; i < validatedInputs.length; i++) {
            validatedInts[i] = (int) validatedInputs[i];
        }
        sortArray(validatedInts);
    }

    //for double data types
    private static void sortArray(double[] toSort) {
        //bubble sort method that compares adjacent values and uses a placeholder to switch where necessary
            double placeholder;
            for (int i = 0; i < toSort.length-1; i++) {
                for (int j = 0; j < toSort.length - 1; j++) {
                    if (toSort[j] > toSort[j + 1]) {
                        placeholder = toSort[j + 1];
                        toSort[j + 1] = toSort[j];
                        toSort[j] = placeholder;
                    }
                }
            }
        findMax(toSort);
        findMin(toSort);
        findProduct(toSort);
        findSum(toSort);
    }

    private static void findMax(double[] sorted) {
        System.out.print("\nThe highest value is: ");
        System.out.println(sorted[sorted.length - 1]);
    }

    private static void findMin(double[] sorted) {
        System.out.print("The lowest value is: ");
        System.out.println(sorted[0]);
    }

    private static void findProduct(double[] sorted) {
        double product = 1;
        for (int i = 0; i < sorted.length; i++) {
            product *= sorted[i];
        }
        System.out.println("The product of the array is: " + product);
    }

    private static void findSum(double[] sorted) {
        double sum = 0;
        for (int i = 0; i < sorted.length; i++) {
            sum += sorted[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }

    //for int data types
    private static void sortArray(int[] toSort) {
        //bubble sort method that compares adjacent values and uses a placeholder to switch where necessary
        int placeholder;
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    placeholder = toSort[j + 1];
                    toSort[j + 1] = toSort[j];
                    toSort[j] = placeholder;
                }
            }
        }
        findMax(toSort);
        findMin(toSort);
        findProduct(toSort);
        findSum(toSort);
    }

    private static void findMax(int[] sorted) {
        System.out.print("\nThe highest value is: ");
        System.out.println(sorted[sorted.length - 1]);
    }

    private static void findMin(int[] sorted) {
        System.out.print("The lowest value is: ");
        System.out.println(sorted[0]);
    }

    private static void findProduct(int[] sorted) {
        int product = 1;
        for (int i = 0; i < sorted.length; i++) {
            product *= sorted[i];
        }
        System.out.println("The product of the array is: " + product);
    }

    private static void findSum(int[] sorted) {
        int sum = 0;
        for (int i = 0; i < sorted.length; i++) {
            sum += sorted[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }

    private static boolean runAgain() {
        System.out.println("\nHow many values do you want to sort?\nOR: Enter 'x' to quit");

        while (!stopProgramme) {
            stopProgramme = reader.hasNext("x");
            return stopProgramme;
        }
        reader.close();
        Scanner reader = new Scanner(System.in);
        return stopProgramme;
    }

   public static void main(String[] args) {
       System.out.println("Welcome to MaxAndMin v1.0\n\nHow many numbers do you want to sort?");
        while (!stopProgramme) {
            amountOfNumbers();
            runAgain();
        }
        System.out.println("Exiting...");
    }
}
