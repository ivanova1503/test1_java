import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double kurs = scanner.nextDouble();

        while (kurs<=0) {
            System.out.println("Некорректный ввод!");
            System.out.println("Введите текущий курс доллара: ");
            kurs=scanner.nextDouble();
        }

        System.out.println("Введите количество рублей: ");
        double rubli = scanner.nextDouble();

        while (rubli<=0) {
            System.out.println("Некорректный ввод!");
            System.out.println("Введите текущий курс доллара: ");
            rubli=scanner.nextDouble();
        }

        double dollari = rubli/kurs;
        dollari= Math.rint(dollari*100)/100;

        System.out.println("Курс доллара: " + kurs);
        System.out.println("Количество рублей: " + rubli);
        System.out.println("Итого: " + dollari + " долларов");
    }
}