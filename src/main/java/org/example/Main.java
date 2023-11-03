package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите что хотите конвертировать (На выбор: вес, температура, расстояние, байты");
            String a = sc.next();
            System.out.println("Введите число которое хотите конвертировать");
            double b = sc.nextDouble();
            if (a.equals("вес")) {
                System.out.println("Из чего во что вы хотите конвертировать? г->кг(1), кг->т(2),кг->г(3), т->кг(4), т->г(5),г->т(6)");
                int c = sc.nextInt();
                if (c == 1) {
                    double d = b / 1000;
                    System.out.println(b + "г" + "= " + d + "кг");
                } else if (c == 2) {
                    double d = b / 1000;
                    System.out.println(b + "кг" + "= " + d + "т");
                } else if (c == 3) {
                    double d = b * 1000;
                    System.out.println(b + "кг" + "= " + d + "г");
                } else if (c == 4) {
                    double d = b * 1000;
                    System.out.println(b + "т" + "= " + d + "кг");
                } else if (c == 5) {
                    double d = b * 1000000;
                    System.out.println(b + "т" + "= " + d + "г");
                } else if (c == 6) {
                    double d = b / 1000000;
                    System.out.println(b + "г" + "= " + d + "т");
                }
            } else if (a.equals("температура")) {
                System.out.println("Из чего во что вы хотите конвертировать? С->К(1),С->Ф(2),К->C(3), К->Ф(4), Ф->C(5), Ф->К(6)");
                int c = sc.nextInt();
                if (c == 1) {
                    double d = b + 273.15;
                    System.out.println(b + "C" + "= " + d + "К");
                } else if (c == 2) {
                    double d = (b * (9 / 5)) + 32;
                    System.out.println(b + "С" + "= " + d + "Ф");
                } else if (c == 3) {
                    double d = b - 273.15;
                    System.out.println(b + "К" + "= " + d + "С");
                } else if (c == 4) {
                    double d = (b - 273.15) * (9 / 5) + 32;
                    System.out.println(b + "К" + "= " + d + "Ф");
                } else if (c == 5) {
                    double d = (b - 32) * (5 / 9);
                    System.out.println(b + "Ф" + "= " + d + "С");
                } else if (c == 6) {
                    double d = (b - 32) * (5 / 9) + 273.15;
                    System.out.println(b + "Ф" + "= " + d + "К");
                }
            } else if (a.equals("расстояние")) {
                System.out.println("Из чего во что вы хотите конвертировать? см->м(1),см->км(2),м->см(3), м->км(4), км->см(5), км->м(6)");
                int c = sc.nextInt();
                if (c == 1) {
                    double d = b / 100;
                    System.out.println(b + "см" + "= " + d + "м");
                } else if (c == 2) {
                    double d = b / 100000;
                    System.out.println(b + "см" + "= " + d + "км");
                } else if (c == 3) {
                    double d = b * 100;
                    System.out.println(b + "м" + "= " + d + "см");
                } else if (c == 4) {
                    double d = b / 1000;
                    System.out.println(b + "м" + "= " + d + "км");
                } else if (c == 5) {
                    double d = b * 100000;
                    System.out.println(b + "км" + "= " + d + "см");
                } else if (c == 6) {
                    double d = b * 1000;
                    System.out.println(b + "км" + "= " + d + "м");
                }
            }
            if (a.equals("байты")) {
                System.out.println("Из чего во что вы хотите конвертировать? б->Кб(1),б->Мб(2), б->Гб(3),Кб->б(4),Кб->Мб(5)," +
                        " Кб->Гб(6), Мб->б(7), Мб->Кб(8), Мб->Гб(9), Гб->б(10),Гб->Кб(11),Гб->Мб(12)");
                int c = sc.nextInt();
                if (c == 1) {
                    double d = b / 1024;
                    System.out.println(b + "б" + "= " + d + "Кб");
                } else if (c == 2) {
                    double d = (b / 1024)/1024;
                    System.out.println(b + "б" + "= " + d + "Мб");
                } else if (c == 3) {
                    double d = (b / 1024)/1024/1024;
                    System.out.println(b + "б" + "= " + d + "Гб");
                } else if (c == 4) {
                    double d = b * 1024;
                    System.out.println(b + "Кб" + "= " + d + "б");
                } else if (c == 5) {
                    double d = b / 1024;
                    System.out.println(b + "Кб" + "= " + d + "Мб");
                } else if (c == 6) {
                    double d = (b / 1024)/1024;
                    System.out.println(b + "Кб" + "= " + d + "Гб");
                } else if (c == 7) {
                    double d = b * 1024*1024;
                    System.out.println(b + "Мб" + "= " + d + "б");
                } else if (c == 8) {
                    double d = b * 1024;
                    System.out.println(b + "Мб" + "= " + d + "Кб");
                } else if (c == 9) {
                    double d = b / 1024;
                    System.out.println(b + "Мб" + "= " + d + "Гб");
                } else if (c == 10) {
                    double d = b *1024*1024*1024;
                    System.out.println(b + "Гб" + "= " + d + "б");
                } else if (c == 11) {
                    double d = b *  1024*1024;
                    System.out.println(b + "Гб" + "= " + d + "Кб");
                } else if (c == 12) {
                    double d = b * 1024;
                    System.out.println(b + "Гб" + "= " + d + "Мб");
                }
            }
        }
    }
}