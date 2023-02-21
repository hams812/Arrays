public class MultipleOf7{
    public static void main(String[] args){
    boolean[] multiplesOfSeven = new boolean[1000]; //this array has 1000 elements, all set to the default value of false.

    //Values in large arrays are usually set using a for loop:

    for (int i = 0; i < multiplesOfSeven.length; i+=7) {
        	multiplesOfSeven[i] = true;
    }
    System.out.println(multiplesOfSeven[700]); //prints true to console
    System.out.println(multiplesOfSeven[701]); //prints false to console
    }
}
