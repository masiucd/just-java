package com.company.masiu;

public class Algo {

  public String reverseString(String s) {
    String revered = "";

    for (char c : s.toCharArray()) {

      revered = c + revered;
    }
    return revered;
  }

  public int[] bubbleSort(int[] xs) {
    for (int i = 0; i < xs.length; i++) {
      for (int j = 0; j < xs.length - 1; j++) {
        if (xs[j] > xs[j + 1]) {
          int temp = xs[j];
          xs[j] = xs[j + 1];
          xs[j + 1] = temp;
        }
      }
    }
    return xs;
  }
<<<<<<< HEAD
=======

  int factorial(int n){
    if (n < 2) {
      return  n;
    }
    return  n * factorial(n-1);
  }

>>>>>>> cbd5c77... feat primitive types in JAVA
}
