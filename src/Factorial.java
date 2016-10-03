/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vera AA
 */
public class Factorial {
    

   static int n;

    static int Factorial(int n){
      if (n==0) {return 1;}
      else {return n*Factorial(n-1);}
    }
    static int Fibonacci(int n){
      if (n<2) {return n;}
      else {return Fibonacci(n-1)+Fibonacci(n-2);}
    }
 public static void main(String[] args){
    System.out.printf("%d %n",Factorial(5));
    System.out.printf("%d %n",Fibonacci(20));
  }
}
