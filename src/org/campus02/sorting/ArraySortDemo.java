package org.campus02.sorting;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {

        int[] intArray = {72, 15, 19, 61, 43, 98, 9 , 0};

        System.out.println("intArray = " + intArray);
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));

    }

}
