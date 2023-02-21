import java.lang.*;
import java.util.*;

public class SearchLesson{
    
public static void main(String[] args){
    int test[]={2,3,4,5,2};
    System.out.println("\n");
    searchA(test,4);
    System.out.println("\n");
    searchB(test,4);  
    System.out.println("\n");
    Arrays.sort(test);
    System.out.println("The sorted array is"+ Arrays.toString(test));
}
    
//Algorithm A
public static boolean searchA(int[] A, int v){
    for(int i=0; i<A.length; i++){
        if(A[i] == v){
                System.out.println(v+" is found in the array A");
                return true;
        }
    }
        System.out.println(v+" is not found in the array A");
        return false;
}


//Algorithm B
public static boolean searchB(int[] B, int v){
    boolean b = false;
    for(int i=0; i<B.length; i++){
        if(B[i] == v){
            b = true;
            System.out.println(v+" is found in the array B");
        }
        else{
            System.out.println(v+" is not found in the array B");
        }
    } 
    return b;
}
}

