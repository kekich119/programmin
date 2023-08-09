import java.util.Scanner;

public class noFan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введи, что ты хочешь конвертировать в рубли: ");
        String con = in.nextLine();

        if (con.equals("dollar")) {

            doll();
        }
        if (con.equals("euro")) {

        }

    }

    public static void doll() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введи, сколько долларов: ");
        int dollar = in.nextInt();

        System.out.println(dollar * 93);
        return;
    }

    public static void euri() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи, сколько евро");
        int euro = in.nextInt();

        System.out.print(euro * 104);

    }

}
