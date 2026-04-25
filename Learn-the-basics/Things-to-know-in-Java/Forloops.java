public class Forloops {
  public static int forLoop(int low, int high) {
    int sum = 0;
    for (int i = low; i <= high; i++) {
        sum += i;
    }

    return sum;
  }   

  public static void main (String[] args) {
    System.out.println(forLoop(3, 7));
  }
}
