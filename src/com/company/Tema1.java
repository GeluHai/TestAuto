package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tema1 {

    public static void main(String[] args) {
        //1
        System.out.println("Exercise #1");
        CheckOddEven(2);
        CheckOddEven(3);
        CheckOddEven(4);
        System.out.println("\n");

        //2
        System.out.println("Exercise #2");
        SumAverageInt();
        System.out.println("\n");

        //3
        System.out.println("Exercise #3");
        PerfectSquare(4);
        PerfectSquare(5);
        System.out.println("\n");

        //4
        System.out.println("Exercise #4");
        SumProductMinMax();
        System.out.println("\n");

        //5
        System.out.println("Exercise #5");
        ReverseInteger();
        System.out.println("\n");

        //6
        System.out.println("Exercise #6");
        CountVowelsDigits();
        System.out.println("\n");

        //7
        System.out.println("Exercise #7");
        AddToArray(99, 5);
        System.out.println("\n");

        //8
        System.out.println("Exercise #8");
        RemoveFromArray(8);
        System.out.println("\n");

        //9
        System.out.println("Exercise #9");
        int arr[] = {90, 12, 34, 13, 1, 4, 6};
        bubbleSort(arr);
        System.out.println("\n");

        //10
        System.out.println("Exercise #10");
        int arr2[] = {90, 12, 34, 13, 1, 4, 6};
        arrayAverageMinusMinMax(arr2);
        System.out.println("\n");
    }

    //1. Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
    // or “Even Number” otherwise. The program shall always print “bye!” before exiting.
    public static void CheckOddEven(int number) {
        if (number % 2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");
        System.out.println("bye!");
    }

    //2. Write a program called SumAverageInt to produce the sum of 1, 2, 3, ..., to 100.
    // Also compute and display the average.
    public static void SumAverageInt() {
        float sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of 1+2+3+...+100 is: " + sum);
        float average = sum / 100;
        System.out.println("The average of 1 to 100 is: " + average);
    }

    //3. Write a program to test if a given number is a perfect square or not.
    public static void PerfectSquare(double number) {
        if ((Math.sqrt(number) - Math.floor(Math.sqrt(number))) == 0)
            System.out.println(number + " is a perfect square");
        else
            System.out.println(number + " is NOT a perfect square");
    }

    //4. Write a program called SumProductMinMax that prompts user for three integers.
    // The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers;
    // and print the results.
    public static void SumProductMinMax() {
        Scanner values = new Scanner(System.in);

        System.out.println("Enter three integers (on 3 different lines)");

        int value1 = values.nextInt();
        int value2 = values.nextInt();
        int value3 = values.nextInt();

        // Output input by user
        System.out.println("The sum is " + (value1 + value2 + value3));
        System.out.println("The product is " + (value1 * value2 * value3));
        System.out.println("The Max value is " + Math.max(value1, Math.max(value2, value3)));
        System.out.println("The Min value is " + Math.min(value1, Math.min(value2, value3)));
    }

    //5. Write a program that prompts user for a positive integer.
    // The program shall read the input as int; and print the "reverse" of the input integer.
    // (input: 12345 reverse: 54321)
    public static void ReverseInteger() {
        Scanner values = new Scanner(System.in);

        System.out.println("Enter positive integer");

        int value1 = values.nextInt();

        int reverse = 0;

        while (value1 != 0) {
            int remainder = value1 % 10;
            reverse = reverse * 10 + remainder;
            value1 = value1 / 10;
        }
        System.out.println("The reverse of the positive integer is: " + reverse);
    }

    //6. Write a program called CountVowelsDigits, which prompts the user for a String,
    // counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and
    // digits (0-9) contained in the string, and prints the counts.
    public static void CountVowelsDigits() {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter a string with vowels and digits");

        String string = str.nextLine();

        //my first answer
        /*
        int countString = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                countString++;
            }
        }

        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                countDigits++;
            }
        }
        */

        //more optimal option using char
        /*
        int countString = 0;
        int countDigits = 0;

        String allVowels = "aeiou";

        for (int i = 0; i < string.length(); ++i) {
            if (Character.isDigit(string.charAt(i))) {
                countDigits++;
            } else if (allVowels.contains("" + string.charAt(i))) {
                countString++;
            }
        }
        */

        //the most efficient answer
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Pattern.matches("[aeiou]|[0-9]", Character.toString(ch))) {
                count++;
            }
        }

        System.out.println("Number of digits and vowels in the given sentence is " + count);


        //System.out.println("Number of vowels in the given sentence is " + countString);
        //System.out.println("Number of digits in the given sentence is " + countDigits);
    }

    //7. Write a program to insert an element (specific position) into an array.
    public static void AddToArray(int numberToAdd, int position) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The original array is " + Arrays.toString(arr));
        arr[position] = numberToAdd;
        System.out.println("The array is " + Arrays.toString(arr));
    }

    //8. Write a program to remove all occurrences of a specified value in a given array of integers
    // and return the new array. There can be duplicates in the array.
    public static void RemoveFromArray(int numberToRemove) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The original array is " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToRemove) {
                arr[i] = 0;
            }
        }

        System.out.println("The array is " + Arrays.toString(arr));
    }

    //9. Write a program to sort an array of given integers using the Bubble sorting Algorithm.
    // The principle of bubble sort is to scan the elements from left-to-right,
    // and whenever two adjacent elements are out-of-order, they are swapped.
    public static void bubbleSort(int arr[]) {
        System.out.println("The original array is " + Arrays.toString(arr));
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The bubble sorted array is " + Arrays.toString(arr));
    }

    //10. Write a program to compute the average value of an array of integers
    // except the largest and smallest values.
    public static void arrayAverageMinusMinMax(int arr[]) {
        System.out.println("The original array is " + Arrays.toString(arr));
        System.out.println("The min value of the array is " + Arrays.stream(arr).min());
        System.out.println("The max value of the array is " + Arrays.stream(arr).max());
        System.out.println("The average value of the array is " + Arrays.stream(arr).average());

        int copyArr[] = new int[arr.length - 2];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == Arrays.stream(arr).max().getAsInt() || arr[i] == Arrays.stream(arr).min().getAsInt()) {
                continue;
            } else copyArr[j++] = arr[i];
        }
        System.out.println("The new array is " + Arrays.toString(copyArr));
        System.out.println("The average value of the array without the min and max values is " + Arrays.stream(copyArr).average());
    }
}
