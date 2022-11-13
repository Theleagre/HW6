public class Main {
    public static void main(String[] args) {
        System.out.println("HW6");
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int fee = 15000;
        int all = 0;
        int i = 0;
        while (all <= 2459000) {
            all = all + fee;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + all + " рублей");
        }
        System.out.println("Задание 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int q = 10; q >= 1; q--)
            System.out.print(q + " ");
        System.out.println("Задание 3");
        int allpeople = 12_000_000;
        int born = 17;
        int death = 8;
        for (int r = 1; r <= 10; r++) {
            allpeople = allpeople + allpeople * (born - death)/1000;
            System.out.println ("Год " + r + " численность населения составляет " + allpeople);
        }
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1 и 2");
        int v = 0;
        int total = 15000;
        int babki = 0;
        for (; babki <= 12000000; v++) {
            babki = babki + total + babki * 7 / 12 / 100;
            if (v % 6 == 0) {
                System.out.println("В месяце " + v + " сумма накоплений " + babki);
                }
            }
        System.out.println("Задание 3");
        int cash = 15000;
        int allmoney = 0;
        int time = 1;
        for (; time <= 12*9; time = time + 1) {
            allmoney = (allmoney + cash) + (allmoney*7)/100;
            if (time % 6 == 0) {
            System.out.println("Месяц " + time + ", сумма накоплений равна " + allmoney + " рублей");}
            }
        System.out.println("Задание 4");
        int d = 4;
        for (; d<=31; d= d+7)
            System.out.println("Сегодня пятница, " +d + "-число. Необходимо подготовить отчет");
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int star = 0;
        for (; star <=2122; star = star + 79) {
            if (star > 1822) {
                System.out.println(star);
            }
        }

        System.out.println("Задание 2");
        int y = 2;
        int z = 1;
        int u = 0;
        for (; z<= 10; z++) {
            u = y*z;
            System.out.println(y + "*" + z + "=" + u);
        }


    }

}