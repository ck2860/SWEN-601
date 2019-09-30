/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package activities.session04;

public class MultiplicationTable {
    /**
     * the function would be called and printed an array of multiplications.
     * The array is created with 10 columns and 10 rows.
     * the nested for loops are used to fill the array as the first column then next row then column, etc..
     * @return the 2D array.
     */

    public static int [][] table() {
        int row = 0;
        int col = 0;
        int [][] value = new int [10][10];

        //System.out.print("Row is "+value.length);
        //System.out.print("Col is "+value[row].length);

        for (row = 0; row < value.length; row++){
            for (col = 0; col < value.length; col++){
                value[row][col] = (row+1)*(col+1);
            }
        }

//        System.out.print(value);
        return value;
    }
    /**
     * The array is created.
     * The nested for loops is used to print the table.
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
        int[][] table = table();
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }
}