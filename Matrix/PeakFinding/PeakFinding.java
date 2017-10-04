package peakfinding;

import java.util.*;
import java.io.*;
/**
 *
 * @author Himanshu
 */
public class PeakFinding {
    private final int r;
    private final int c;
    private final int[][] arr;
    private int midCol;
    private int maxRowIndex;
    PeakFinding(int r, int c){
        this.r = r;
        this.c = c;
        this.arr = new int[r][c];
    }
    int findPeak(int lCol, int rCol){
        this.midCol = (lCol+rCol)/2; 
        int max = Integer.MIN_VALUE;
        this.maxRowIndex=0;
        for(int i=0; i< this.r; i++){
            if(this.arr[i][midCol]>max){
                max=this.arr[i][midCol];
                this.maxRowIndex=i;
            }
        }
        if(lCol<=rCol){
            if(c==1)
                return max;
            else if(midCol==0 && this.arr[maxRowIndex][midCol] >= this.arr[maxRowIndex][midCol+1])
                return this.arr[maxRowIndex][midCol];
            else if(midCol==c-1 && this.arr[maxRowIndex][midCol] >= this.arr[maxRowIndex][midCol-1])
                return this.arr[maxRowIndex][midCol];
            else if(midCol!=0 && midCol!=c-1 && this.arr[maxRowIndex][midCol] >= this.arr[maxRowIndex][midCol-1] && this.arr[maxRowIndex][midCol] >= this.arr[maxRowIndex][midCol+1])
                return this.arr[maxRowIndex][midCol];
            else if(midCol!=0 && this.arr[maxRowIndex][midCol-1] > this.arr[maxRowIndex][midCol])
                return findPeak(lCol, midCol-1);
            else if(midCol!=c-1 && this.arr[maxRowIndex][midCol+1] > this.arr[maxRowIndex][midCol])
                return findPeak(midCol+1, rCol);
            else
                return -1;
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter no of Columns: ");
        int c = scanner.nextInt();
        PeakFinding obj = new PeakFinding(r,c);
        System.out.println("Enter Matrix: ");
        for(int i=0; i<obj.r; i++)
            for(int j=0;j<obj.c; j++)
                obj.arr[i][j] = scanner.nextInt();
        int result = obj.findPeak(0,obj.c-1);
        System.out.println("Peak arr["+obj.maxRowIndex+"]["+obj.midCol+"]: " + result);
    }
}
