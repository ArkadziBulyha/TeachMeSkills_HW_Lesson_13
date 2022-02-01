package Task2;

import Task2.Calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 для реверса слова или 2 для подсчёта факториала:");
        String o = sc.next();

        if (o.equals("1")) {
            System.out.println("Введите любое слово");
            String rev = sc.next();
            Object object = Calc.getResInputStr(o, rev);
            System.out.println("Реверс строки: " + object);

        } else if (o.equals("2")) {
            System.out.println("Введите число");
            String fact = sc.next();
            Object object2 = Calc.getResInputStr(o, fact);
            System.out.println("Факториал числа = " + object2);
        }else {
            System.out.println("Некорректно введён символ");
        }

        sc.close();

    }
}

