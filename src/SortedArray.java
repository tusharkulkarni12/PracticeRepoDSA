import java.util.Scanner;

public class SortedArray {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String []args)
    {
       // int size = sc.nextInt();
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
        public static int[] getIntegers(int size)
        {
            int[] array = new int[size];
            for(int i = 0;i< array.length;i++)
            {
                array[i] = sc.nextInt();
            }
            return array;
        }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0 ; i<array.length;i++)
        {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for(int i =0 ;i< sortedArray.length -1;i++)
            {
                if(sortedArray[i] < sortedArray[i+1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] myIntegers) {
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " contents " + myIntegers[i]);
        }
    }
//        public static int[]  SortedIntegers(int size)
//        {
//            return
//        }

}