import java.util.Scanner;

public class MyCalculator {


public static double[] input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double input1 = input.nextDouble();

        System.out.println("Enter another number: ");
        double input2 = input.nextDouble();

        return new double[]{input1, input2};
}

public static void add(double[] numbersIn) {
        double input1 = numbersIn[0];
        double input2 = numbersIn[1];

        System.out.print(input1 + " + " +input2 + " = ");
        System.out.print(input1 + input2);
        System.out.println();
}

public static void sub(double[] numbers) {
        double input1 = numbers[0];
        double input2 = numbers[1];

        System.out.print(input1 + " - " +input2 + " = ");
        System.out.print(input1 - input2);
        System.out.println();
}

public static void div(double[] numbers) {
        double input1 = numbers[0];
        double input2 = numbers[1];

        System.out.print(input1 + " / " +input2 + " = ");
        System.out.print(input1 / input2);
        System.out.println();
}

public static void multi(double[] numbers) {
        double input1 = numbers[0];
        double input2 = numbers[1];

        System.out.print(input1 + " * " +input2 + " = ");
        System.out.print(input1 * input2);
        System.out.println();
}
public static void main(String[] args) {
        double[] numbers = input();
        add(numbers);
        sub(numbers);
        div(numbers);
        multi(numbers);
        }
}
