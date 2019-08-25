public class Exercise1 {
    public static void main (String[] args) {
        byte byteValue=126;
        short shortValue=1234;
        int intValue=98;
        long longValue=78738483L;
        float floatValue=8778.232f;
        double doubleValue=232.2322323d;
        boolean booleanValue=true;
        char charValue=66;

        System.out.println(byteValue);
        System.out.println("Dimensiunea ocupata este " + 8 + "biti");

        System.out.println(shortValue);
        System.out.println("Dimensiunea ocupata este " + 16 + "biti");

        System.out.println(intValue);
        System.out.println("Dimensiunea ocupata este " + 32 + "biti");

        System.out.println(longValue);
        System.out.println("Dimensiunea ocupata este " + 64 + "biti");

        System.out.println(floatValue);
        System.out.println("Dimensiunea ocupata este " + 32 + "biti");

        System.out.println(doubleValue);
        System.out.println("Dimensiunea ocupata este " + 64 + "biti");

        System.out.println(booleanValue);
        System.out.println("Dimensiunea ocupata este " + 1 + "biti");

        System.out.println(charValue);
        System.out.println("Dimensiunea ocupata este " + 16 + "biti");
    }
}
