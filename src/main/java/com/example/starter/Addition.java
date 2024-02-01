package com.example.starter;

public class Addition {

  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;
    Addition addition = new Addition();
    int addedNumber = addition.add(number1, number2);
    System.out.println("added Number is: "+addedNumber);


  }

  public int add(int number1,int  number2){
    return number1 +number2;
  }
  public int sub(int number1,int number2){
    return number1+number2;
  }
}
