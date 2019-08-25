public class Exercise3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 17;

        System.out.println(a & b);
        //Se aplica "si" pe valorile lor in biti: 1010 & 10001
        //de la dreapta la stanga: 0 si 1 = 0;, 1 si 0 = 0; 0 si 0 = 0; 1 si 0 = 0; 0 si 1 = 0;
        //rezultatul = 00000 = 0;

        System.out.println(a | b);
        //Se aplica "si" pe valorile lor in biti: 1010 & 10001
        //de la dreapta la stanga: 0 sau 1 = 1;, 1 sau 0 = 1; 0 sau 0 = 0; 1 sau 0 = 1; 0 sau 1 = 1;
        //rezultatul = 11011 = 16 + 8 + 0 + 2 + 1 = 27;
    }

}
