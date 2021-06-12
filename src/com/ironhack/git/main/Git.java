package com.ironhack.git.main;
import java.util.Scanner;

public class Git {
    public static void main(String[] args) {
        /*Create a program that reads from standard input a string and prints the count of the words that starts with a vowel.
        Skipping all the words that doesn't start with a vowel and print it as an error.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input the words:");
        String inputedWord = scanner.nextLine();
        wordPrinter(inputedWord);
    }
    public static void wordPrinter(String wordsString){
        String[] words = wordsString.split(" ");
        int wordsWithVowelsAtStartCount = 0;
        for (String word : words) {
            if (startsWithAVowel(word)){
                wordsWithVowelsAtStartCount++;
            }
            else {
                System.out.println(word+" doesn't start with a vowel");
            }
        }
        System.out.println("Words that start with a vowel count: "+wordsWithVowelsAtStartCount);
    }
    public static boolean startsWithAVowel(String word){
        char[] vowels = new char[]{'a', 'e', 'i', 'u', 'o', 'y'}; //Y sometimes is a vowel and sometimes it isn't
        boolean isVowelAtTheStart = false;
        for (char vowel:vowels) {
            if (word.charAt(0) == vowel){
                isVowelAtTheStart = true;
                break;
            }
        }
        return isVowelAtTheStart;
    }
}