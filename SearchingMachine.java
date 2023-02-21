//SearchingMachine.java

/**
 * The searching machine fills an array with random numbers and
 * searches through the array for a value using both
 * linear search and binary search
 *
 * @version (1.0)
 */

import java.util.Random;

public class SearchingMachine
{
    static Random randomGenerator = new Random();
    
    public static int[] fillArray(int[] data){
        for(int i=0; i<data.length; i++){
            data[i] = i;
        }
        return data;
    }
    
    //fill in code for linear search
    public static boolean linearSearch(int[] data, int value){
        for(int i=0; i<data.length; i++){
            if(data[i]==value){
                return true;
            }
        }
        return false;  
    }
    
    //fill in code for binary search
    public static boolean binarySearch(int[] data, int value){
        int low=0;
        int high=data.length;
        while(high>low){
            int middle=(low+high)/2;
            if(data[middle]==value){
                return true;
            }
            if(data[middle]<value){
                low=middle+1;
            }
            if(data[middle]>value){
                high=middle-1;
            } 
        }
        return false;  
    }
    
    //Okay, let's use these methods
    public static void main(String[] args){
        int size = 99999999;
        int[] A = new int[size];
        A=fillArray(A);
        
        //Search for a value that is definitely in the array by giving size as input to randomgenerator
        int searchValue = randomGenerator.nextInt(size);
         
        //add code to start stopwatch
        Stopwatch timer1 = new Stopwatch();
        //call the linear search method by giving array A and searchValue as input
        boolean isThere1 = linearSearch(A, searchValue);
        //add code to stop stopwatch
        double time1 = timer1.elapsedTime();
        //Print the result if searchValue found or not and also print the time taken to do the linear search
        System.out.println(searchValue + ": " + isThere1);
        System.out.println("Time to search by Linear Search: (%.2f milliseconds)\n"+ time1);
        
        //Now add code to start a 2nd stopwatch     
        Stopwatch timer2 = new Stopwatch();
        //call the binary search method by giving array A and SAME searchValue as input
        boolean isThere2 = binarySearch(A, searchValue);
        //add code to stop stopwatch     
        double time2 = timer2.elapsedTime();
        //Print the result if searchValue found or not and also print the time taken to do the binary search
        System.out.println(searchValue + ": " + isThere2);
        System.out.println("Time to search by Binary Search: (%.2f milliseconds)\n"+ time2);
        /*
        //Search for a value that is likely not in the array
        int searchValue = randomGenerator.nextInt();
        //int index = 101;
        isThere = linearSearch(A,index);
        System.out.println(index + ": " + isThere);*/
    }
}