package activities.session04;

public class MultiplicationTable {

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

        System.out.print(value);

        return value;
    }
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