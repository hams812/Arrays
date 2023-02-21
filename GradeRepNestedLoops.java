
/**
 * Write a description of class GradeRepNestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeRepNestedLoops
{
    public static void main(String[] args) {
        barGraph(87, 59, 96);
    }
public static void barGraph(int test1, int test2, int test3) {
    for(int i=1;i<=3;i++){
        System.out.print("Test "+i+":");
        for(int j=0;j<test1;j+=4){
            System.out.print("#");
        }
        System.out.println(" ");
    }
}
}
