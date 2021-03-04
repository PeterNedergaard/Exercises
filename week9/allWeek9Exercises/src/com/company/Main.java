package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[9][1];
    private static String[][] sentences = new String[9][1];

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");
            //System.out.println(text[i].length);

            i++;
        }

        //printWordsWithDoubleConsonant();
        //printLongestSentence();
        //printPartOfWord("Elefant",2,6);
        printIfPalindrome("Den laks skal ned");

    }

    ////////////
    // Task 1 //
    ////////////

    private static void printWordsWithDoubleConsonant() {
        char prevChar = ' ';

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                for (char c : s.toCharArray()) {
                    if (charIsConsonant(c)) {
                        if (c == prevChar) {
                            System.out.println(s);
                        }
                    }
                    prevChar = c;
                }
                prevChar = ' ';
            }
        }
    }

    private static boolean charIsConsonant(char c) {
        char k = Character.toLowerCase(c); //Makes sure that upper case vowels still gets sorted out
        if (Character.isLetter(c) && k != 'a' && k != 'e' && k != 'i' && k != 'o' && k != 'u' && k != 'y' && k != 'æ' && k != 'ø' && k != 'å') {
            return true;
        } else {
            return false;
        }

    }


    ////////////
    // Task 2 //
    ////////////

    private static void printLongestSentence() throws IOException{
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            sentences[i] = scan.nextLine().split("\\. ");
            i++;
        }

        int longestSentenceIndex = 0;
        int longestSentenceLength = 0;
        for (int j = 0; j < sentences.length; j++){
            if(sentences[j].length > longestSentenceLength){
                longestSentenceIndex = j;
                longestSentenceLength = sentences[j].length;
            }
        }
        System.out.println(Arrays.toString(sentences[longestSentenceIndex]));

    }


    ////////////
    // Task 3 //
    ////////////

    private static void printPartOfWord(String word, int indexStartChar, int partLength){
        int endChar = indexStartChar + partLength;

        try {
            String result = word.substring(indexStartChar, endChar);
            System.out.println(result);

        } catch (StringIndexOutOfBoundsException e) {
            if(endChar > word.length() && indexStartChar < word.length()){
                System.out.println("Ending character is too large\nPrinting word from starting character to word end instead");

                System.out.println(word.substring(indexStartChar));
            }

            if(indexStartChar > word.length()){
                System.out.println("Starting character is larger than the word itself");
            }
        }
    }



    ////////////
    // Task 4 //
    ////////////

    private static void printIfPalindrome(String sentence){
        char[] toChars = sentence.toCharArray();
        char[] toCharsReversed = new char[toChars.length];
        boolean ispalindrome = false;

        for (int i = 0; i < toChars.length; i++){
            toCharsReversed[i] = toChars[toChars.length-i-1];

            if(Character.toLowerCase(toChars[i]) != Character.toLowerCase(toCharsReversed[i])){
                ispalindrome = false;
            } else {
                ispalindrome = true;
            }
        }
        if(ispalindrome){
            System.out.println("The sentence is a palindrome:");
            System.out.println(sentence);
        } else {
            System.out.println("The sentence is not a palindrome");
        }
    }







    /*private static void printWordsOfLength(int l) {

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == l) {
                    //for (int j = 0; j < s.length(); j++) {
                    //char c = s.charAt(j);
                    if (!s.contains(".") || !s.contains(",")) {
                        System.out.println(s);
                    }
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                    System.out.println(s);
                }
            }
        }
    } */
}
