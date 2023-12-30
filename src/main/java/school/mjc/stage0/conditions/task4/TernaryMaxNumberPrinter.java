package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String[] args) {

    }
    public void printGreatest(int first, int second, int third) {
        int max = first >= second || first >= third ? first:
                second >= first || second >= third ? second : third;
        System.out.println(max);
    }
}
