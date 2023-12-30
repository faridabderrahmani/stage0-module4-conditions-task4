package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void main(String[] args) {

    }
    public void printGreatest(int first, int second, int third) {
        int max;
        if (first >= second && first >= third){
            max = first;
        } else if(second > first && second >= third){
            max = second;
        }
        else{
            max = third;
        }
        System.out.println(max);
    }
}
