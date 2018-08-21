package org.itstep.qa.variables;

public class Variables {
    public static void main(String[] args) {
        int i = 10;
        float b = 3.12f;
        boolean a = true;

        System.out.println("число i = " + ++i);
        System.out.println("число b = " + --b + (i / b));
        System.out.println(i + b / i);

        int d = 123;
        int s = 7;
        System.out.println("Остаток от деления 123 на 7: " + d % s);

        System.out.println("Среднее арифметическое = " + (i + b + d + s) / 4);

        // написать алгоритм вычесления площади круга
        double pi = 3.1416;
        int radius = 6;
        System.out.println("Площадь круга = " + radius * radius * pi);

        // Дано 1865 часов. Вывести на экран количество целых дней и часов в виде
        //"Было дано 1865 часовю. Это равно х дней и у часов"
        double clock = 1865;

        System.out.println("Было дано 1865 часов. Это равно " + (clock - clock % 24) / 24 + " дней " +
                " и " + clock % 24 + " часов");


        // Дана геометрическая прогрессия 99, 33, 11, ... найти сумму данной прогрессии

        double first = 99;
        double last = 33;
        System.out.println("сумму данной прогрессии = " + first / (1 - last/first));


    }
}
