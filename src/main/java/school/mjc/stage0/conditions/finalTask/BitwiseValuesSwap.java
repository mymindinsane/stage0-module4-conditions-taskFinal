package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        if (first != second){
            first ^= second;
            second ^= first;
            first ^= second;
            System.out.println(first + "\n" + second);
        }
    }
}
