package org.akhverdian;

import edu.princeton.cs.introcs.StdDraw;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scan = new Scanner(System.in);
        System.out.println("X = (b + \u221A(b\u00B2 - 4ac)) : 2a)");
        int a;
        int b;
        int c;
        int y;
        double root;
        int x;

        System.out.println("Введите значение a:");
        a = scan.nextInt();
        if (a == 0) throw new ArithmeticException("Значение этого параметра не может быть ноль");
        System.out.println("Введите значение b:");
        b = scan.nextInt();
        System.out.println("Введите значение c:");
        c = scan.nextInt();
        root = Math.pow(b, 2) - 4 * a * c;
        if (root < 0) throw new ArithmeticException("Извлечь корень из отрицательного числа нельзя!");

        x = (int) (b + Math.sqrt(root)) / (2 * a);

        System.out.println("\u221A(b\u00B2 - 4ac) = \u221A(" + b + "\u00B2 - " + 4 + " * " + a + " * " + c + ") = " + root);
        System.out.println("X = (b + \u221A(b\u00B2 - 4ac)) : 2a) = (" + b + " + " + "\u221A(" + b + "\u00B2 - " + 4 + " * " + a + " * " + c + ")) : " + 2 + " * " + a + " = " + x);

        System.out.println("Введите значение y:");
        y = scan.nextInt();
        System.out.println("абсцисса = " + x + ", ордината = " + y + ", координаты точки: A(" + x + ',' + y + ')');

        double f = 0.5;
        double x1;
        double y1;

        String stX = String.valueOf(x);
        String stY = String.valueOf(y);

        x1 = x * f / 10 + f;
        y1 = y * f / 10 + f;

        StdDraw.setCanvasSize(830, 827);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(-2, 0.5, 2, 0.5);
        StdDraw.line(0.5, -2, 0.5, 2);
        StdDraw.picture(0.5, 0.5, "src/main/java/org/akhverdian/data/axis1.png");
        StdDraw.setPenRadius(0.022);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(x1, y1);

        StdDraw.setPenColor(StdDraw.BLACK);

        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.text(x1 + 0.08, y1, "A(" + stX + ", " + stY + ')');

        StdDraw.text(0.09, 1.02, "\u221A(b\u00B2 - 4ac) = " + root);
        StdDraw.text(0.15, 0.97, "X = (b + \u221A(b\u00B2 - 4ac)) : 2a) = " + x);

    }
}
