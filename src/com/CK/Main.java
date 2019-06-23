package com.CK;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
    }

    public static void  printArray(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);;
        }
    }
}
