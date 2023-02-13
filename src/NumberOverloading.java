public class NumberOverloading {
    private static int sumNum(int x, int y) {
        return x + y;

    }
    private static double sumNum(double x, double y) {
    return(Math.round( x + y));
    }
    private static long sumNum(long x, long y) {
        return x + y;
    }
    public static void main(String[] args) {
        int sumIntNum = sumNum(3, 7);
        double sumDoubleNum = sumNum(Math.PI, 12.65);
        long sumBigNum = sumNum(384834213, 239348933);

        System.out.println(sumIntNum);
        System.out.println(sumDoubleNum);
        System.out.println(sumBigNum);
    }
}
