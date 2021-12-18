package com.sisbutsig.tddbyexample.primenumbers1;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public final class PrimeNumbers {
  private PrimeNumbers() {
  }

  public static boolean isPrime(int num) {
    return num > 1 && IntStream.range(2, num)
                               .noneMatch(isFactorOf(num));
  }

  private static IntPredicate isFactorOf(int num) {
    return factor -> num % factor == 0;
  }
}
