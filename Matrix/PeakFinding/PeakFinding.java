package peakfinding;
import java.util.*;
import java.io.*;
/**
 *
 * @author Himanshu
 */
public class PeakFinding {
    private int r;
    private int c;
    int findPeak(int[][] arr, int lCol, int rCol){
        int midCol = (lCol+rCol)/2, max = Integer.MIN_VALUE,maxRowIndex=0;
        for(int i=0; i< this.r; i++){
            if(arr[i][midCol]>max){
                max=arr[i][midCol];
                maxRowIndex=i;
            }
            System.out.println(maxRowIndex);
        }
        if(lCol<=rCol){
            if(c==1)
                return max;
            else if(midCol==0 && arr[maxRowIndex][midCol] >= arr[maxRowIndex][midCol+1])
                return arr[maxRowIndex][midCol];
            else if(midCol==c-1 && arr[maxRowIndex][midCol] >= arr[maxRowIndex][midCol-1])
                return arr[maxRowIndex][midCol];
            else if(midCol!=0 && midCol!=c-1 && arr[maxRowIndex][midCol] >= arr[maxRowIndex][midCol-1] && arr[maxRowIndex][midCol] >= arr[maxRowIndex][midCol+1])
                return arr[maxRowIndex][midCol];
            else if(midCol!=0 && /*midCol!=c-1 &&*/ arr[maxRowIndex][midCol-1] > arr[maxRowIndex][midCol])
                return findPeak(arr,lCol, midCol-1);
            else if(/*midCol!=0 &&*/ midCol!=c-1 && arr[maxRowIndex][midCol+1] > arr[maxRowIndex][midCol])
                return findPeak(arr,midCol+1, rCol);
            else
                return -1;
        }
        return -1; 
    }
    public static void main(String[] args) {
        PeakFinding obj = new PeakFinding();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        obj.r = scanner.nextInt();
        System.out.print("Enter no of Columns: ");
        obj.c = scanner.nextInt();
        int[][] arr = new int[obj.r][obj.c];
        System.out.println("Enter Matrix: ");
        for(int i=0; i<obj.r; i++)
            for(int j=0;j<obj.c; j++)
                arr[i][j] = scanner.nextInt();
        System.out.println("Peak: " + obj.findPeak(arr,0,obj.c-1));
    }
}
