public class Exercise6 {
    public static void main(String[] args) {
        int a, b, c, max;
        max = 0;
        a = 900;
        b = 870;
        c = 970;

        if (a>b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b>c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("maximul este " + max);

        //pentru egalitate
        if (max == a) System.out.println("a e max" + " si e egal cu " + a);
        if (max == b) System.out.println("b e max" + " si e egal cu " + b);
        if (max == c) System.out.println("c e max" + " si e egal cu " + c);
    }
}
