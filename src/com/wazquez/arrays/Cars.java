package com.wazquez.arrays;

import java.util.Arrays;

public class Cars {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0]=400;
        intArray[1]=300;
        intArray[2]=200;
        intArray[3]=500;
        intArray[4]=100;
        /*for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }*/
        Arrays.stream(intArray).forEach(System.out::println);
    }
}
