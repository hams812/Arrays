import java.util.Arrays;
public class ClassExercises{
    public static void main(String[] args){
        int[] xs = {3,7,5,-4};
        double [] ar = {0.3,0.9,2.1};
        boolean [] br = {true,false,false};
        int mr[];
        System.out.println("Array xs[]={3,7,5,-4}");
        System.out.println("Array xs[] incremented by 1= "+ Arrays.toString(incrementArray(xs)));
        System.out.println("Array ar[]={0.3,0.9,2.1}");
        System.out.println("Average of elements in array ar[]= "+ String.format("%.2f",averageArray(ar)));
        System.out.println("Array br[]={true,false,false}");
        System.out.println("Negation of elements in array br[]= "+ Arrays.toString(negateArray(br)));
        System.out.println("Array mr[] has the numbers in the range -2 to 4");
        System.out.println("Elements in the array mr[] with range between -2 and 4 are= "+ Arrays.toString(makeRange(-2,4)));
    }
        public static int[] incrementArray() {
        for (int i = 0; i < xs.length; i++) {
        xs[i] = xs[i] + 1;
        }
        return xs;
        }
    
        public static double averageArray(double[] xs) {
        double sum = 0;
        for (int i = 0; i < xs.length; i++) {
            sum += xs[i];
        }
       
        return sum/xs.length;
        }
    
        public static boolean[] negateArray(boolean[] xs) {
        for (int i = 0; i < xs.length; i++) {
            xs[i] = !xs[i];
        }
        return xs;
        }
    
        public static int[] makeRange(int a, int b) {
        int[] range = new int[b-a];
        for (int i = 0; i < range.length; i++) {
            range[i] = a + i;
        }
        return range;
        }
}