public class GradeReportArray {
    
    public static int[] testScores = {95, 55, 79, 99, 90, 88};
    
    public static void main(String[] args) {
        barGraph(testScores);
    }
    
    public static void barGraph(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print("Test " + (i+1) + ": " + values[i] + " ");
            for (int j = 0; j < values[i]; j+=3) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
