package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {

    ArrayList<Integer> arr = new ArrayList<>();

    public int sumEven() {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        ArrayLists arrayLists = new ArrayLists();
        arrayLists.arr.add(1);
        arrayLists.arr.add(2);
        arrayLists.arr.add(3);
        arrayLists.arr.add(4);

        System.out.println("Sum of even numbers: " + arrayLists.sumEven());

        arrayLists.findWordsOfLength();
    }

    public static void printWordsOfLength(ArrayList<String> words, int length){
        for (String word : words){
            if (word.length() == length){
                System.out.println(word);
            }
        }
    }

    public void findWordsOfLength(){
        Scanner input = new Scanner(System.in);
       String text = "Alice was beginning to get very tired of sitting by her " +
               "\n sister on the bank and of having nothing to do";

       ArrayList<String> wordList = new ArrayList<>(Arrays.asList(text.split(" ")));
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        System.out.println("Words with " + numChars + " letters: ");
        printWordsOfLength(wordList, numChars);

        input.close();
    }



}


