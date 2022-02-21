package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int choose, zero = 0;
        while (true) {
            boolean findzero = false;
            boolean findzerorand = false;
            // меню
            System.out.print("Виберіть дію: \n" +
                    "1 - ввести одновимерний масив n цілих чисел \n" +
                    "2 - заповнити масив n цілих чисел значеннями за допомогою генератора псевдовипадкових чисел з відрізка [-100; 100] \n" +
                    "3- вийти з програми \n" +
                    "Ваша відповідь: ");
            choose = in.nextInt();
            //конструкція для одновимірного масиву
            if (choose == 1) {
                System.out.print("Введіть довжину масиву n: ");
                int n = input.nextInt();
                int[] mas = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Введiть " + (i + 1) + " елемент масиву: ");
                    mas[i] = input.nextInt();

                }
                System.out.print("Введений масив : {");
                for (int i = 0; i < n; i++) {
                    System.out.print(" " + mas[i]);
                }
                System.out.print(" }\n\n");

                //початок коду для визначення максимального елементу за модулем
                int max=0;
                for (int i=0; i<n; i++) {
                    if (max < Math.abs(mas[i])) {
                        max = Math.abs(mas[i]);
                    }
                }
                System.out.print("Максимальний за модулем елемент - " +max+"\n");

                //початок коду для визначення суми елементів, розташованих після 0
                int sum = 0;
                for (int i = n - 1; i >= 0; i--) {
                    if (mas[i] == 0) {
                        zero = i;
                        findzero = true;
                    }
                }
                for (int i = zero; i < n; i++) {
                    sum += mas[i];
                }

                // конструкція для виключень
                if(findzero){
                    System.out.print("Сума елементів масиву розташованих після останнього нульового елемента - "+ sum +"\n\n");
                }
                else {
                    System.out.print("В заданому масиві немає нулів \n");
                }
            }

            //конструкція для одновимірного масиву заданого генератором псевдовипадкових чисел
                    if (choose == 2) {
                        System.out.print("Введіть довжину масиву n: ");
                        int n = input.nextInt();
                        int[] masrand = new int[n];
                        //Введення рандому
                        for (int i = 0; i < n; i++) {
                            masrand[i] = (int)Math.round((Math.random() * 200) - 100);
                        }
                        System.out.print("Введений масив : {");
                        for (int i = 0; i < n; i++) {
                            System.out.print(" " + masrand[i]);
                        }
                        System.out.print(" }\n\n");
                        //початок коду для визначення максимального елементу за модулем
                        int max=0;
                        for (int i=0; i<n; i++) {
                            if (max < Math.abs(masrand[i])) {
                                max = Math.abs(masrand[i]);
                            }
                        }
                        System.out.print("Максимальний за модулем елемент - " +max+"\n");

                        //початок коду для визначення суми елементів, розташованих після 0
                        int sum = 0;
                        for (int i = n - 1; i >= 0; i--) {
                            if (masrand[i] == 0) {
                                zero = i;
                                findzerorand = true;
                            }
                        }
                        for (int i = zero; i < n; i++) {
                            sum += masrand[i];
                        }

                        // конструкція для виключень
                        if(findzerorand){
                            System.out.print("Сума елементів масиву розташованих після останнього нульового елемента - "+ sum +"\n\n");
                        }
                        else {
                            System.out.print("В заданому масиві немає нулів \n\n");
                        }
                    }
                if (choose == 3) {
                    break;
                } else if (choose < 1 || choose > 3) {
                    continue;
                }



        }
    }
}
