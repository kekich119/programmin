import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        for (int i = 999; i > 6; i--) {
            System.out.print("1000-7=");
            System.out.println(i -= 6);
        }
        String text = "Delite dota 2,\n" +
                "no dowload, \n" +
                "only live";
        System.out.println(text);

        kul();
    }

    static void kul() {

        try {

            Scanner in = new Scanner(System.in);
            String word = in.nextLine();

            System.out.println("Enter first number");

            int numberF = in.nextInt();

            System.out.println("Enter second number");

            int numberS = in.nextInt();

            System.out.println("PLeases enter: +, -, *, /");

            char arv = in.next().charAt(0);

            if (arv == '+') {
                System.out.println(numberF + numberS);
                return;
            }

            if (arv == '-') {
                System.out.println(numberF - numberS);
                return;
            }
            if (arv == '*') {
                System.out.printf("Your result: " + numberF * numberS);
                return;
            }
            if (arv == '/') {
                System.out.printf("Your result: " + numberF / numberS);
                return;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("что то не правильно, чурка");

        int a = 1005;
        int b = 1001;
        switch (a) {
            case 1005:
                System.out.println("число 1005");
                break;

            case 1:
                System.out.println("число 1");
                break;

            default:
                System.out.println("это не 1 и не 1005");

        }
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i : array) {
            System.out.println(i);

            Person tom = new Person();
            tom.displayInfo();
            tom.name = "Tom";
            tom.age = 04;
            tom.displayInfo();

        }
    }
}

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.printf("Name: %s\tAge: %d\n", name, age);
    }
}
