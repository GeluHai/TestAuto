package com.company;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numArr[] = {27, 53, 8, 6, 45, 21, 9, 254, 98};

        String strArr[] = {"maria", "si", "vlad", "ana", "are", "mere", "pere", "si", "prune"};
        String strArr2[] = {"vlad", "are", "mere", "si", "prune", "sau", "nu"};

        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("dfg");
        list.add("edf");
        list.add("wer");
        list.add("wew");
        list.add("zoz");
        list.add("asf");
        list.add("mko");
        list.add("tyt");

        /*to do
        10. Write a Java program to swap every two adjacent nodes of a given linked list.
                    Original Linked list: 10->20->30->40->50
                    Expected Output: 20->10->40->30->50
        11. Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
                    Input: 1->2->4, 1->3->4
                    Output: 1->1->2->3->4->4
        12. Make a Map that associates the following employee IDs with names. The point here is to associate keys with values, then retrieve values later based on keys. Test several valid and invalid ID’s and print the associated name.
         */


        //1.
        System.out.println("Exercise #1");
        sortArray(numArr, strArr);
        System.out.println("\n");

        //2.
        System.out.println("Exercise #2");
        findCommonElements(strArr, strArr2);
        System.out.println("\n");

        //3.
        System.out.println("Exercise #3");
        convertToArrayList(strArr);
        System.out.println("\n");

        //4.
        System.out.println("Exercise #4");
        printAllElements(list);
        System.out.println("\n");

        //5.
        System.out.println("Exercise #5");
        reverseElements(list);
        System.out.println("\n");

        //6.
        System.out.println("Exercise #6");
        emptyList(list);
        System.out.println("\n");

        //7.
        System.out.println("Exercise #7");
        generateAndGetListEqualTo10();
        System.out.println("\n");

        //8.
        System.out.println("Exercise #8");
        gradeAverage();
        System.out.println("\n");

        //9.
        System.out.println("Exercise #9");
        collectAndReverse(1,2,3,4,5);
        System.out.println("\n");
    }

    //1. Write a Java program to sort a numeric array and a string array. Check and use available Arrays methods.
    public static void sortArray(int numArr[], String strArr[]) {
        Arrays.sort(numArr);
        System.out.println("The sorted numeric array is: " + Arrays.toString(numArr));

        Arrays.sort(strArr);
        System.out.println("The sorted string array is: " + Arrays.toString(strArr));
    }

    //2. Write a Java program to find the common elements between two arrays (string values).
    // Use two for loops to cover every element in the arrays.
    private static void findCommonElements(String strArr1[], String strArr2[]) {
        System.out.println("The original first string array is: " + Arrays.toString(strArr1));
        System.out.println("The original second string array is: " + Arrays.toString(strArr2));
        System.out.println("The common elements are: ");
        for (int i = 0; i < strArr1.length; i++) {
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i] == strArr2[j]) {
                    System.out.println(strArr1[i]);
                }
            }
        }
    }

    //3. Write a Java program to convert an array to ArrayList.
    public static void convertToArrayList(String strArr[]) {
        List<String> list = Arrays.asList(strArr);
        System.out.println(list);
    }

    //4. Write a Java program to iterate through all elements in a array list and print them.
    public static void printAllElements(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + ". " + list.get(i) + "\n");
        }
    }

    //5. Write a Java program to reverse elements in a array list. Check available methods in Collections class.
    public static void reverseElements(List<String> list) {
        System.out.println("The original is " + list);
        Collections.reverse(list);
        System.out.println("The reverse is " + list);
    }

    // 6. Write a Java program to empty an array list and write another program to test if the array list is empty.
    public static void emptyList(List<String> list) {
        System.out.println("The original is " + list);
        list.clear();
        System.out.println("The result is " + list);
        System.out.println("The size of the list is " + list.size());
    }

    //7. First, generate 10 1-100 random numbers, then put them in an array.
    // Put the numbers from the array greater than or equal to 10 into a list collection and print them to the console.
    public static void generateAndGetListEqualTo10() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("The array is " + Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                list.add(arr[i]);
            }
        }
        System.out.println("The original list is " + list);
    }

    //8. Write a application that allows the user to enter up to 20 integer grades into an array.
    // Stop the loop by typing in ‐1. Your main method should call an Average method
    // that returns the average of the grades.
    // Use the DecimalFormat class to format the average to 2 decimal places.
    public static void gradeAverage() {
        DecimalFormat df = new DecimalFormat("#.##");
        int gradesCom[] = new int[20];
        int grades[] = new int[20];
        Scanner grade = new Scanner(System.in);

        System.out.println("Enter the grades");

        for (int i = 0; i < gradesCom.length; i++) {
            gradesCom[i] = grade.nextInt();
            if (gradesCom[i] == -1) {
                break;
            } else grades[i] = gradesCom[i];
        }
        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.println("The average of the grades is: " + df.format(Arrays.stream(grades).average().getAsDouble()));
    }

    //9. Write a function that takes an arbitrary number of integers as arguments
    // and returns a collection of them stored in reverse order.
    public static void collectAndReverse(int a, int b, int c, int d, int e){
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        System.out.println("The original is " + list);
        Collections.reverse(list);
        System.out.println("The reverse is " + list);
    }

}