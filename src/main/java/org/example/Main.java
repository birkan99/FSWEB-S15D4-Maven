package org.example;


import java.util.LinkedList;

public class Main {

    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        StringBuilder cleanText = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanText.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();

        while (decimal > 0){
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal /2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int digit : binaryList){
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }

}