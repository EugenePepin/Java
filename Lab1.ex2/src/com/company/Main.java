package com.company;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, x, h;
        int choose;
        Scanner in = new Scanner(System.in);

        a = -Math.PI / 2;
        b = 3 * Math.PI / 2;
        h = Math.PI / 3;
        while (true) {

            System.out.print("Виберіть дію: \n" +
                    "1 - обчислити за допомогою цикла з передумовою \n" +
                    "2 - обчислити за допомогою цикла з післяумовою \n" +
                    "3- вийти з програми \n" +
                    "Ваша відповідь: ");
            choose = in.nextInt();
            double y=0;
            if (choose == 1) {
                x = a;
                System.out.printf("\tx\t\t\t\ty=f(x)\n");
                while (x <= b) {
                    System.out.printf("%.3f\t\t\t\t%.2f\n", x, y);
                    x += h;
                    y = Math.pow(Math.cos(x), 2) + Math.sin(x);
                }
            }
            if (choose == 2) {
                x = a;
                System.out.printf("\tx\t\t\t\ty=f(x)\n");
                do {
                    System.out.printf("%.3f\t\t\t\t%.2f\n", x, y);
                    x += h;
                    y = Math.pow(Math.cos(x), 2) + Math.sin(x);
                } while (x <= b);
            }
            if (choose == 3) {
                break;
            } else if (choose < 1 || choose > 3) {
                continue;
            }


        }
    }
}

