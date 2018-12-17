/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primepalindrome;

public class PrimePalindrome{
  //Create main method to initiate the numbers starting from one
    public static void main(String[] args){ 
        int number = 100000;
	int count = 1;
        System.out.println("Prime Palindromes: ");
	for (int i = 0; i < number; i++){
            if(isPrime(i) == true && isPalindromic(i) == true && i != 0 && i != 1){
                System.out.print(i + "\n");
                count++;
            }
        }
    }
    public static boolean isPalindromic(int number){
        String reverse = new StringBuilder(Integer.toString(number)).reverse().toString();
        int palindrome = Integer.parseInt(reverse);
        if( number == palindrome){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean isPrime(int number){
        for (int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}