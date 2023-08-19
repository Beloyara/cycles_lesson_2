public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Решение 8 задачи из прошлого урока
        int contribution = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + contribution;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }

        // Решение 9 задачи из прошлого урока
        double contribution2 = 29_000;
        double sum2 = 0;
        for (int i = 1; i <= 12; i++) {
            sum2 *= 1.01;
            sum2 += contribution2;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum2 + " рублей");
        }

        // Решение 1 задачи
        int contribution1_1 = 15_000;
        int sum1_1 = 0;
        int i = 1;
        for (; sum1_1 < 2_459_000; i++) {
            sum1_1 = sum1_1 + contribution1_1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum1_1 + " рублей");
        }

        // Решение 2 задачи
        int start = 1;
        while (start <= 10)
        {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println(" ");

        int start1 = 10;
        for (; start1 >= 1; start1 --)
        {
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
        for (; total < 1_000_000; a ++) {
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
        double sum1_2 = 0;
        for (i = 0; sum1_2 <= 12_000_000; i ++)
        {
            sum1_2 = deposit;
            deposit = deposit + interests;
            interests = deposit * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопилось " + sum1_2 + " рублей");
            }
        }

        // Решение 6 задачи
        double deposit_1 = 15_000;
        double interests_1 = deposit_1 * 0.07;
        double sum1_3 = 0;
        for (i = 0; i <= 108; i ++)
        {
            sum1_3 = deposit_1;
            deposit_1 = deposit_1 + interests_1;
            interests_1 = deposit_1 * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопилось " + sum1_3 + " рублей");
            }
        }

        // Решение 7 задачи. Не уверена, что решение правильное, но не могу понять, как составить нужную формулу.
        int firstFriday = 1;
        for (i = firstFriday; i <= 31; i = i + 7)
        {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        // Решение 8 задачи.
        int zeroYear = 0;
        int thisYear = 2023;
        int pastYear = thisYear - 200;
        int futureYear = thisYear + 100;
        i = zeroYear + 79;
        for (i = pastYear; i <= futureYear; )
        {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

    }
}