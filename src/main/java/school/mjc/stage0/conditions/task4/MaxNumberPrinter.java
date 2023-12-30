package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(25, 65, 25);
    }
    public static void printGreatest(int first, int second, int third) {
        int max ;
        if (first >= second && first >= third){
            max = first;
        } else if(second > first && second > third){
            max = second;
        }
        else{
            max = third;
        }
        System.out.println(max);
    }
}
