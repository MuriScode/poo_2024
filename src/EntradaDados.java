import java.util.Scanner;
import java.util.Locale;
public class EntradaDados {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.FRANCE);
        System.out.print("Inteiro: ");
        int i = keyboard.nextInt();
        System.out.print("Boolean: ");
        boolean b = keyboard.nextBoolean();
        System.out.print("Double: ");
        double d = keyboard.nextDouble();
        System.out.print("Palavra: ");
        String s = keyboard.next();
        keyboard.nextLine();
        System.out.print("Linha: ");
        String line = keyboard.nextLine();

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(s);
        System.out.println(line);
        keyboard.close();
    }
}