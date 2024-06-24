public class ComparacaoReferencia {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        System.out.println(a);
        System.out.println(b);
        System.out.printf("a == b : %b\n", a == b);
        System.out.printf("a == c : %b\n", a == c);
    }
}