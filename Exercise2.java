public class Exercise2 {
    public static void main(String[] args) {
        int val = 123;

        int rest = val%9;
        int lastDigit = val%10;

        //System.out.println(rest);
        //System.out.println(lastDigit);

        System.out.println(rest * lastDigit * 2);
        System.out.println(val%9 * (val%10 * 2));
    }
}
