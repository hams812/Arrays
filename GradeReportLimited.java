public class GradeReportLimited {

    public static void main(String[] args) {
        barGraph(87, 59, 96);
    }
    
    public static void barGraph(int test1, int test2, int test3) {
        System.out.print("Test 1: " + test1 + " ");
        for (int i = 0; i < test1; i+=4) {
            System.out.print("#");
        }
        
        System.out.println("");
        System.out.print("Test 2: " + test2 + " ");
        for (int i = 0; i < test2; i+=4) {
            System.out.print("#");
        }
        
        System.out.println("");
        System.out.print("Test 3: " + test3 + " ");
        for (int i = 0; i < test3; i+=4) {
            System.out.print("#");
        }
    }
}
