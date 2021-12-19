package com.sisbutsig.tddbyexample.primenumbers1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Prime numbers are numbers that have only 2 factors: 1 and themselves
 *
 * 0 and 1 are not prime 2 is prime. Other even numbers are all not prime.
 * Negative numbers are not prime
 * 
 */
public class GivenAPrimeNumbers {
  @Test
  public void isPrimeShouldReturnFalseForNonPrimeNumbers() {
    assertFalse(PrimeNumbers.isPrime(-10));
    assertFalse(PrimeNumbers.isPrime(-1));
    assertFalse(PrimeNumbers.isPrime(0));
    assertFalse(PrimeNumbers.isPrime(1));
    assertFalse(PrimeNumbers.isPrime(4));
  }

  @Test
  public void isPrimeShouldReturnTrueForPrimeNumbers() {
    assertTrue(PrimeNumbers.isPrime(2));
    assertTrue(PrimeNumbers.isPrime(3));
    assertTrue(PrimeNumbers.isPrime(5));
    assertTrue(PrimeNumbers.isPrime(7));
    assertTrue(PrimeNumbers.isPrime(11));
  }
}
