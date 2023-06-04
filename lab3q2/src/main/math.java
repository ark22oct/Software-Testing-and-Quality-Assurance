package main;

public class math {

  public static int func(int a, int b) {
    if (b > a) {
      b = b - a;
      System.out.println(b);
    } else if (a > b) {
      b = a - b;
      System.out.println(b);
    } else {
      b = 0;
      System.out.println(0);
    }
    return b;
  }
}

