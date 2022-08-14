package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        if(array == null ||  array.length == 0 ) return 0;
        int sum = 0;

        for(int num : array) {
            if ((num % 2) == 0) sum +=num;
        }
        return sum;
       /// throw new UnsupportedOperationException();
    }
}
