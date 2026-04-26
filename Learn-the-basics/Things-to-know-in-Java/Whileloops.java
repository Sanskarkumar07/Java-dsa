public class Whileloops {
    public static int whileLoop(int d) {
        int numDigit = d;
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += numDigit;
            numDigit += 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(whileLoop(1));
    }
}