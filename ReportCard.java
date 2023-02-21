public class ReportCard{

    static double[] testScores = {71.0, 52.0, 68.0};
    static double quarterGrade = 63.7;
   
    public static void main(String[] args) {

        improveMyGrades(testScores);
        improveMyGrade(quarterGrade);
        
        System.out.println("Test Grades:");
        for (int i = 0; i < testScores.length; i++) {
            System.out.println(testScores[i]);
        }
        System.out.println("Quarter Grade:");
        System.out.println(quarterGrade);
        
    }
    
    public static double[] improveMyGrades(double[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 100.0;
        }
        return grades;
    }
    
    public static double improveMyGrade(double grade) {
        quarterGrade = 100.0;
        return grade;
    }
}
