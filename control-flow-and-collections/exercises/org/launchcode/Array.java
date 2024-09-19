package org.launchcode;

import java.util.Arrays;

public class Array {
    public static void main (String[] args){

        int[] intArr  = {1, 1, 2, 3, 5, 8};
       for(int num : intArr){
           if(num % 2 != 0) {
               System.out.println(num);
           }

    } String phrase = "I would not, could not, in a box. \n I would not, could not with a fox. \n I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
    }

}
