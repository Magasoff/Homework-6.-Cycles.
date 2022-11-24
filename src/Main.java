public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Число " + i);
        }
        System.out.println("Задание 2");
        for (int a = 10; a > 0; a--) {
            System.out.println("Число " + a);
        }
        System.out.println("Задание 3");
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println("Четные числа " + b);
        }
        System.out.println("Задание 4");
        for (int c = 10; c >= -10; c--) {
            System.out.println("Обратный порядок " + c);
        }
        System.out.println("Задание 5");
        for (int year = 1904; year < 2096; year = year + 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
            {
                System.out.println("Задание 6");
                for (int r = 7; r <= 98; r = r + 7) {
                    System.out.println("Числа " + r);
                }
                System.out.println("Задание 7");
                for (int m = 1; m <= 512; m = m * 2) {
                    System.out.println("Числа " + m);
                }
                System.out.println("Задание 8");
                int deposit = 29_000;
                int capital = 0;
                for (int g = 1; g <= 12; g++) {
                    capital = capital + deposit;
                    System.out.println("Месяц " + g + " сумма накоплений равна " + capital + " рублей");
                }
                System.out.println("Задание 9");
                double capitalWithPercent = 0;
                double percent = 0.01;
                for (int g = 1; g <= 12; g++) {
                    capitalWithPercent = (capitalWithPercent + deposit) * (1 + percent);
                    System.out.println("Месяц " + g + " сумма накоплений равна " + capitalWithPercent + " рублей");
                }
            }
        }
    }
}
