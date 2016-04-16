package exercise.algorithm;

/**
 * Created by tingfang.liu on 2016/4/14.
 */
public class FFF {
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : n + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i <40; i++) {
            System.out.println(i + "        " + tableSizeFor(i));
        }
    }
}
