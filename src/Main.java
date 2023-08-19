public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Решение 1 задачи
        int contribution = 15_000;
        int sum = 0;
        int i = 1;
        for (; sum < 2_459_000; i++) {
            sum = sum + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        // Решение 2 задачи
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println(" ");

        int start1 = 10;
        for (; start1 >= 1; start1--) {
            System.out.print(start1 + " ");
        }
        System.out.println(" ");

        // Решение 3 задачи
        double population = 12_000_000;
        double birth = population * 0.017;
        double mortality = population * 0.008;
        {
            for (i = 0; i < 10; i++)
                population = population + birth - mortality;
            {
                System.out.println("Год " + i + ", численность населения составляет " + population);
            }
        }

        // Решение задачи из урока
        int salary = 65_535;
        int total = 0;
        int a = 0;
        for (; total < 1_000_000; a++) {
            total = total + total / 100;
            total = total + salary;
            if (a % 5 == 0) {
                System.out.println("Месяц " + a + " Итого " + total);
            }
        }
        System.out.println(total);

        // Решение 4 и 5 задачи
        double deposit = 15_000;
        double interests = deposit * 0.07;
        double sumForTask4And5 = 0;
        for (i = 0; sumForTask4And5 <= 12_000_000; i++) {
            sumForTask4And5 = deposit;
            deposit = deposit + interests;
            interests = deposit * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопилось " + sumForTask4And5 + " рублей");
            }
        }

        // Решение 6 задачи
        double deposit_1 = 15_000;
        double interests_1 = deposit_1 * 0.07;
        double sumForTask6 = 0;
        for (i = 0; i <= 108; i++) {
            sumForTask6 = deposit_1;
            deposit_1 = deposit_1 + interests_1;
            interests_1 = deposit_1 * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопилось " + sumForTask6 + " рублей");
            }
        }

        // Решение 7 задачи.
        int firstFriday = 1;
        for (i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        // Решение 8 задачи.
        int thisYear = 2023;
        int pastYear = thisYear - 200;
        int futureYear = thisYear + 100;
        for (i = pastYear; i <= futureYear; i ++ ) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        // Другое решение 8 задачи.
        int thisYear1 = 2023;
        int pastYear1 = thisYear1 - 200;
        int futureYear1 = thisYear1 + 100;
        for (i = pastYear1; i <= futureYear1; i = i + 79) {
            System.out.println(i);
        }
    }
}