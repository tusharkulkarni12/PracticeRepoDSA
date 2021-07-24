package com.ds.array;

public class Main {
    //Given an array in which all numbers except two are repeated once.
    //
    // (i.e. we have 2n+2 numbers and n numbers are occurring twice and the remaining two have occurred once). Find those two numbers in the most efficient way
    public void find2Element(int [] array)
    {
        //Write your Code here
        int res = array[0];
        for(int i = 1 ; i < array.length ; i++){
            res  ^= array[i];
        }

        int most_right_bit = res & ~ (res - 1);    //.  14 -13  0010

        int a = 0 , b = 0;

        for(int i = 0 ; i< array.length ; i++){
            int x = array[i];
            if((x & most_right_bit) != 0){
                a ^= x;
            }
            else{
                b ^= x;
            }
        }

    }
    public static void main(String[] args) {
        Main t = new Main();
        int [] array = {2,4,7,9,2,4};
        t.find2Element(array);

    }
}

/* Try more Inputs

case1:
actual = find2Element([2,4,7,9,2,4])
expected = 7,9

case2:
actual = find2Element([4,5,4,5,3,2,9,3,9,8])
expected = 2,8

case3:
actual = find2Element([1,1,2,2,3,3,4,5,5,6,7,7])
expected = 6,4


*/