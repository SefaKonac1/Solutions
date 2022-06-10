package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        
        int lengthOfWord = 0;
        int stringSize = str.length() - 1;

        /* starts to scan end of the string cause of 
         * reducing time complextiy
         * 
         *               ANALYSIS OF THE ALGORITHM 
         *  Based on iteration operation, time complexity is O(s + w)
         *  s: space number w: word length
         *  Example : str = "__hello__world___"   PS.: _ represents space
         *  When the scanning operation starts end of the string,
         *  the for loop, only scan at as
         *  3 times for spaces, and 5 times of word character total 8 times.
         * 
         *  Besides, calculation of the analysis of the algorithm, 
         *  considering the '+' operation as a basic operator,
         *  Time Complexity is O(w).
         *  w: word length.
         *   
         *  Finally space complexity is O(1).
         *  Because It is not allocated an extra memory space, 
         *  other than some primitive variable ,for the solution.
         */
        for (int i = stringSize ; i >= 0 ; i--) {

            if(str.charAt(i) != ' ') {
                lengthOfWord = lengthOfWord + 1;
            } 
            else {
                if (lengthOfWord !=0 ) {
                    return lengthOfWord;
                }
            } 

        }
    

        
        return lengthOfWord;
    }

}
