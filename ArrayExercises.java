public class ArrayExercises{
    public static void main(String [] args){
    int [] xs = {3,7,-10,9,9,2};
    System.out.println("int [] xs = {3,7,-10,9,9,2}");
    System.out.println("The maximum integer in the given array is: "+getMax(xs));
    }
    
    public static int getMax(int[] xs) {
    int max = 0;
    for (int i = 0; i < xs.length; i++) {
        if (xs[i] > max) {
            max = xs[i];
        }
    }
    return max;
    }
}
