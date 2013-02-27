package com.my.story;


import java.util.ArrayList;


public class ArrayOfPrimeNumbers {
 
  private int number;
 
  public ArrayOfPrimeNumbers(int number) {
    this.number = number;
  }
  
  public int getNumber() {
    return number;
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
  
  private boolean primeNumberCheckUp(int numberForCheck) {
	  boolean result = true;
	  if (numberForCheck != 1 || numberForCheck != 2 || numberForCheck != 3) {
	    for (int currentNumber = 2; currentNumber < numberForCheck; currentNumber++) {
	      if (numberForCheck % currentNumber == 0) {
	        result = false;
	      }
	    }
	  }
	  return result;
	}
  
    private Integer[] getAllPrimeNumbers (int numberForCheck){
	  ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	  for (int currentNumber = 1; currentNumber <= numberForCheck; currentNumber++) {
	    if (this.primeNumberCheckUp(currentNumber)) {
	      primeNumbers.add(currentNumber);
	    }
	  }
	  Integer[] result = (Integer[]) primeNumbers.toArray(new Integer[0]);
	  return result;
	}
	 
	public int[] getIntArray(){
	  Integer[] arrayOfPrimeNumbers = (Integer[]) getAllPrimeNumbers(this.number);
	    int[] result = new int[arrayOfPrimeNumbers.length];
	    for (int currentNumber = 0; currentNumber<result.length; currentNumber++){
	      result[currentNumber] = arrayOfPrimeNumbers[currentNumber].intValue();
	    }
	    return result;
	}
	 
	public Integer[] getIntegerArray(){
	  return this.getAllPrimeNumbers(this.number);
	}
}
