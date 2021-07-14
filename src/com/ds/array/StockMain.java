package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class StockMain {
    static class Stock {

        private int buy;
        private int sell;

    }

    public static void main(String[] args) {
        int array[] = {98, 178, 250, 300, 40, 540, 690};
        findProfit(array);
    }

    private static void findProfit(int[] array) {
        List<Stock> stockList = new ArrayList<Stock>();
        int i;
        int n = array.length;
        int count = 0;
        if (n == 1) {
            return;
        }
        for (i = 0; i < n; i++) {
            Stock stk = new Stock();
            while ((i < n - 1) && (array[i + 1] <= array[i])) {
                i++;
            }
            if (i == n - 1) {
                break;
            }
            stk.buy = i++;
            //Find Local Maxima Note that the limit is (n-1) as we are comparing to previous element
            while ((i < n) && (array[i] >= array[i - 1])) {
                i++;
            }
            //Store the index of maxima
            stk.sell = i - 1;
            stockList.add(stk);

            count++;
            i--;
        }

        if (count == 0)
            System.out.println("Profit Can't be Make");
        else
            for (int j = 0; j < count; j++)
                System.out.println("Buy on day: " + stockList.get(j).buy + "Sell on day : " + stockList.get(j).sell);

        return;
    }
}