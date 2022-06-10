package cz.acamar.tasks;

import java.util.PriorityQueue;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {

        int headIndex = 0;
        int tailIndex = input.length - 1;
        int[] sortedArray = new int[input.length];

        int COEFFICIENT = 2;

        /*
         * 
         * 
         *               ANALYSIS OF THE ALGORITHM 
         *  Based on loop iteration operation, time complexity is O(n)
         *  because all array is scanned by only one time.
         *  n: length of input string.
         *  Space complexity is O(n), because this method uses an extra
         *  storage area where kept sortedSquareOfArray (plus some integer variable).
         *     
         */



        for(int i = input.length - 1; i >= 0 ; i--){

            int squareOfHeadValue = (int) Math.pow(input[headIndex], COEFFICIENT);
            int squareOfTailValue = (int) Math.pow(input[tailIndex], COEFFICIENT);
            
            if(squareOfHeadValue > squareOfTailValue) {
                sortedArray[i] = squareOfHeadValue;
                headIndex++;
            } else if (squareOfHeadValue < squareOfTailValue) {
                sortedArray[i] = squareOfTailValue;
                tailIndex--;
            } else {

                if(tailIndex != headIndex) {
                    sortedArray[i] = squareOfHeadValue;
                    sortedArray[--i] = squareOfTailValue;
                    headIndex++;
                    tailIndex--;
                } else {
                    sortedArray[i] = squareOfHeadValue;
                }

            }
        }

        return sortedArray;
    }
}
